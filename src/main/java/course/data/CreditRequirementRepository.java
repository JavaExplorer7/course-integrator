package course.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import course.domain.CreditRequirement;
import course.domain.User;

public interface CreditRequirementRepository 
	extends CrudRepository<CreditRequirement, Long> {

	  List<CreditRequirement> findByUser(User user);
	
}
