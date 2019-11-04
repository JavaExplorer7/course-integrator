package course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import course.data.CourseRepository;
import course.domain.Course;

@Controller
@RequestMapping("/course")
public class CourseController {
	
  @GetMapping("/details")
  public String courseSite(Model model) {

  	//System.out.println(model.getAttribute("id"));
  	
    return "home";
  }

}
