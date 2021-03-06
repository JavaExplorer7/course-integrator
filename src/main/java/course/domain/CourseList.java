package course.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import course.domain.Course;
import lombok.Data;

@Data
@Entity
public class CourseList implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  @ManyToOne
  private User user;

  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;

  @ManyToMany(targetEntity=Course.class)
  private Set<Course> courses;

  public void addCourse(Course course) {
      this.courses.add(course);
  }
  
}
