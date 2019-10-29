package course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import course.data.CourseRepository;
import course.data.UserRepository;
import course.domain.Course;
import course.domain.User;
import course.domain.Course.Type;

@Profile("!prod")
@Configuration
public class DevelopmentConfig {

	@Bean
	public CommandLineRunner dataLoader(CourseRepository repo,
			UserRepository userRepo, PasswordEncoder encoder) {
		// user repo for ease of testing with a built-in user
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Course("IPT10000", "Situation & Policy I", Type.PFC, 0.50, 8, 0, 1));
	        
	        
				userRepo.save(new User("jacob", encoder.encode("password")));
	      }
	    };
	  }

}
