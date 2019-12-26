package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.Staff;

public interface StaffRepository 
  extends CrudRepository<Staff, String> {

}
