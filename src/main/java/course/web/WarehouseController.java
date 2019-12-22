package course.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import course.data.CourseRepository;
import course.web.api.SchoolConversion;

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
		  model.addAttribute("departments", SchoolConversion.DEPARTMENTS);
		  model.addAttribute("schools", SchoolConversion.getSchools("IS"));
		  model.addAttribute("courses", courseRepo.findByIdContainsIgnoresCase("CS"));

	    return "warehouse";
	  }

}
