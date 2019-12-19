package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
  extends CrudRepository<Course, String> {

  Iterable<Course> findByIdContaining(String schoolID);
  
  Iterable<Course> findByTitleContainingIgnoreCase(String title);

  Iterable<Course> findByIdContainingAndTitleContainingIgnoreCase(String schoolID, String title);
  
}