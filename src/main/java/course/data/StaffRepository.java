package course.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import course.domain.Staff;

public interface StaffRepository 
  extends CrudRepository<Staff, String> {
  
  List<Staff> findByIdContaining(String id);

}
