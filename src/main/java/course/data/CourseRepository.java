package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Course;

public interface CourseRepository 
	extends CrudRepository<Course, String> {

}