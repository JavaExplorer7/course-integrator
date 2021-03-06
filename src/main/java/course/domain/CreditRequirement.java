package course.domain;

import java.util.HashMap;
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
  
  private HashMap<Type, Double> requirements;
  
  @ManyToMany(targetEntity=Course.class)
  private Set<Course> courses;
  
  public void addRequirement(Type type, double credit) {
    this.requirements.put(type, new Double(credit));
  }
  
  public void addFinishedCourse(Course finished) {
    this.courses.add(finished);
  }
  
}
