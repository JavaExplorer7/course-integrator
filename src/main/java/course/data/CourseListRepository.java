package course.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import course.domain.CourseList;
import course.domain.User;

public interface CourseListRepository 
  extends CrudRepository<CourseList, Long> {
  
  List<CourseList> findByUser(User user);
  
}