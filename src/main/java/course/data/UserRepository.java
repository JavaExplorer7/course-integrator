package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);
  
  boolean existsByUsername(String username);
  
}