package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.User;

public interface UserRepository 
  extends CrudRepository<User, String> {

    User findByUsername(String username);
    
}