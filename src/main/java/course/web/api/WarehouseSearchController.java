package course.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.data.CourseRepository;
import course.domain.Course;

@RestController
@RequestMapping(path="/warehouse",
                produces="application/json")
@CrossOrigin(origins="*")
public class WarehouseSearchController {
  
  private CourseRepository courseRepo;

  @Autowired
  public WarehouseSearchController(CourseRepository CourseRepo) {
    this.courseRepo = CourseRepo;
  }
  
  @GetMapping("/search")
  public Iterable<Course> processSearch(
      @ModelAttribute("school") String schoolID,
      @ModelAttribute("courseName") String courseName,
      @ModelAttribute("searchBy") String searchBy) {

    if (searchBy.equalsIgnoreCase("school"))
      return courseRepo.findByIdContainingIgnoreCase(schoolID);
    else if (searchBy.equalsIgnoreCase("name"))
      return courseRepo.findByTitleContainingIgnoreCase(courseName);
    else
      return courseRepo.findByIdContainingAndTitleContainingAllIgnoreCase(schoolID, courseName);
  }

}
