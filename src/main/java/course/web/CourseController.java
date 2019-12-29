package course.web;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerMapping;

import course.data.CourseDetailRepository;
import course.domain.CourseDetail;

@Controller
@RequestMapping("/course")
public class CourseController {
  
  private CourseDetailRepository detailRepo;

  @Autowired
  public CourseController(CourseDetailRepository detailRepo) {
    this.detailRepo = detailRepo;
  }
  
  @GetMapping({"index", "basic", "lecture", "task", "staff"})
  public String courseIndex(@RequestParam("id") String courseId,
      Model model, HttpServletRequest request) {
    // figure out which view is requested
    String pattern = (String) request.getAttribute(
        HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
    
    // response with that view along with the detail data
    Optional<CourseDetail> opCourse = detailRepo.findById(courseId);
    if (opCourse.isPresent()) {
      model.addAttribute("course", opCourse.get());
      return pattern.replaceFirst("/", "");
    }
    else {
      return "course/error";
    }
  }

}
