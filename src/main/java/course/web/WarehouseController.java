package course.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import course.data.CourseRepository;
import course.web.api.MajorConversion;

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
		  model.addAttribute("courses", courseRepo.findByIdContaining("CST"));
		  model.addAttribute("departments", MajorConversion.DEPARTMENTS);
		  model.addAttribute("majors", MajorConversion.getSchool("IS"));
		  
	    return "warehouse";
	  }

}
