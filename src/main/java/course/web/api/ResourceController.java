package course.web.api;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.data.UserRepository;

@RestController
@RequestMapping(path="/data",
                produces="application/json")
@CrossOrigin(origins="*")
public class ResourceController {
  
  private UserRepository userRepo;
  
  public ResourceController(UserRepository userRepo) {
    this.userRepo = userRepo;
  }
  
  @GetMapping("/users/{id}")
  public boolean isUserExists(@PathVariable("id") String username) {
    
    return userRepo.existsByUsername(username);
  }
  
  @GetMapping("/schools/{id}")
  public Map<String, String> 
    schoolsByDepartmentId(@PathVariable("id") String id) {

    return SchoolConversion.getSchools(id);
  }
  
  @GetMapping("/majors/{id}")
  public Map<String, String> 
    majorsBySchoolId(@PathVariable("id") String id) {

    return SchoolConversion.getMajors(id);
  }
  
}
