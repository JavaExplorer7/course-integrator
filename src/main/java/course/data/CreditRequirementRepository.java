package course.data;

import org.springframework.data.repository.CrudRepository;

import course.domain.CreditRequirement;
import course.domain.User;

public interface CreditRequirementRepository 
  extends CrudRepository<CreditRequirement, Long> {

    CreditRequirement findByUser(User user);
  
}