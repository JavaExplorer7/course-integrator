package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.CourseDetail;

public interface CourseDetailRepository 
  extends CrudRepository<CourseDetail, String> {

}
