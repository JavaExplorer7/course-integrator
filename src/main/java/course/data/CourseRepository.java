package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
  extends CrudRepository<Course, String> {

  Iterable<Course> findByIdContainingIgnoreCase(String schoolID);
  
  Iterable<Course> findByTitleContainingIgnoreCase(String title);

  Iterable<Course> findByIdContainingAndTitleContainingAllIgnoreCase(String schoolID, String title);
  
}