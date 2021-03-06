package course.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class CourseDetail {
  
  @Id
  private final String id;
  private final String title;
  
  @Column(columnDefinition="TEXT")
  private final String description;
  
  @ManyToMany(targetEntity=Staff.class)
  private final List<Staff> staffs;
  
  @Column(columnDefinition="TEXT")
  private final HashMap<String, String> info;
  
  private final HashMap<String, Integer> grading;
  
  @Column(columnDefinition="TEXT")
  private final HashMap<String, Date> tasks;

}
