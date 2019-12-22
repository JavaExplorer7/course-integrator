package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
  extends CrudRepository<Course, String> {

  Iterable<Course> findByIdContainsIgnoresCase(String schoolID);
  
  Iterable<Course> findByTitleContainsIgnoresCase(String title);

  Iterable<Course> findByIdContainsAndTitleContainsAllIgnoresCase(String schoolID, String title);
  
}