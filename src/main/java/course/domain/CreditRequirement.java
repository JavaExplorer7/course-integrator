package course.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import course.domain.User;
import course.domain.Course.Type;
import lombok.Data;

@Data
@Entity
public class CreditRequirement {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  @OneToOne
  private User user;
  
  private HashMap<Type, Double> requirement;
  
  @ManyToMany(targetEntity=Course.class)
  private Set<Course> courses = new HashSet<>();
  
  public void addRequirement(Type type, double credit) {
    this.requirement.put(type, new Double(credit));
  }
  
  public void addFinished(Course finished) {
    this.courses.add(finished);
  }
  
}