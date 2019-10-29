package course.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import course.domain.User;
import course.domain.Course.Type;
import lombok.Data;

@Data
@Entity
public class CreditRequirement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User user;
	
	private Type type;
	
	private double credit;

}
