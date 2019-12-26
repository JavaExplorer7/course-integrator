package course.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import course.data.UserRepository;
import course.domain.User;

@Controller
@RequestMapping("/home")
public class HomeController {
  
  private UserRepository userRepo;
  
  @Autowired
  public HomeController(UserRepository userRepo) {

    this.userRepo = userRepo;
  }


  @GetMapping
  public String initPage(Model model, Principal principal) {

    String username = principal.getName();
    User user = userRepo.findByUsername(username);
    model.addAttribute("user", user);
    
    return "home";
  }
  
}
