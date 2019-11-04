package course.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
	extends CrudRepository<Course, String> {

	List<Course> findByIdContaining(String majorID);
	
	List<Course> findByTitleContainingIgnoreCase(String title);

	List<Course> findByIdContainingAndTitleContainingIgnoreCase(String majorID, String title);
	
}