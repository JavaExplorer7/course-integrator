package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
	extends CrudRepository<Course, String> {

	Iterable<Course> findByIdContaining(String majorID);
	
	Iterable<Course> findByTitleContainingIgnoreCase(String title);

	Iterable<Course> findByIdContainingAndTitleContainingIgnoreCase(String majorID, String title);
	
}