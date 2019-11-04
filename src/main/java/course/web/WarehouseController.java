package course.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import course.data.CourseRepository;
import course.domain.Course;
import course.misc.MajorConversion;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {
	
	  private CourseRepository courseRepo;

	  @Autowired
	  public WarehouseController(CourseRepository CourseRepo) {
	    this.courseRepo = CourseRepo;
	  }
	  
	  @GetMapping
	  public String initList(Model model) {
		  summary(courseRepo.findByIdContaining("MATH"), model);
		  
	    return "warehouse";
	  }
	  
	  @PostMapping
	  public String processSearch(
	  		@ModelAttribute("major") String majorID,
	  		@ModelAttribute("courseName") String courseName,
	  		@ModelAttribute("searchBy") String searchBy,
	  		Model model) {

	  	if (searchBy.equalsIgnoreCase("major"))
	  		summary(courseRepo.findByIdContaining(majorID), model);
	  	else if (searchBy.equalsIgnoreCase("name"))
	  		summary(courseRepo.findByTitleContainingIgnoreCase(courseName), model);
	  	else
	  		summary(courseRepo.findByIdContainingAndTitleContainingIgnoreCase(majorID, courseName), model);

	    return "warehouse";
	  }
	  
	  public void summary(Iterable<Course> courses, Model model) {
	  	long theories = 0L, experiments = 0L;
		  double credits = 0.0;
		  
		  for (Course c : courses) {
			  credits += c.getCredit();
			  theories += c.getTheory();
			  experiments	+= c.getExperiment();
		  }
		  
		  model.addAttribute("courses", courses);
		  model.addAttribute("credits", credits);
		  model.addAttribute("theories", theories);
		  model.addAttribute("experiments", experiments);
		  
		  model.addAttribute("departments", MajorConversion.DEPARTMENTS);
	  }

}
