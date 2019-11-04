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
				repo.save(new Course("IPT10100", "Moral Cultivation & Basic Law", Type.PFC, 2.00, 32, 0, 1));
				repo.save(new Course("MATH10012", "Higher Mathematics I", Type.PFC, 5.00, 80, 0, 1));
				repo.save(new Course("MATH10032", "Linear Algebra II", Type.PFC, 3.00, 48, 0, 1));
				repo.save(new Course("MET11000", "Military Class", Type.PFC, 2.00, 36, 0, 1));
				repo.save(new Course("PESS12010", "PE Health Knowledge", Type.PFC, 1.00, 32, 0, 1));
				repo.save(new Course("EUS10011", "English I", Type.PFO, 2.00, 32, 0, 1));
				repo.save(new Course("EUS10111", "Oral English I", Type.PFO, 1.00, 16, 0, 1));
				repo.save(new Course("SE10001", "Freshman Seminar", Type.MF, 1.00, 16, 0, 1));
				repo.save(new Course("SE10003", "Intro to Information System", Type.MF, 2.00, 32, 0, 1));
				repo.save(new Course("SE11005", "Intro to Programming", Type.MF, 4.00, 56, 16, 1));
				repo.save(new Course("IPT10001", "Situation & Policy II", Type.PFC, 0.50, 8, 0, 2));
				repo.save(new Course("IPT10200", "Contemporary Chinese History", Type.PFC, 2.00, 32, 0, 2));
				repo.save(new Course("MATH10022", "Higher Mathematics II", Type.PFC, 6.00, 96, 0, 2));
				repo.save(new Course("PESS12020", "PE (Swimming)", Type.PFC, 1.00, 32, 0, 2));
				repo.save(new Course("PHYS10013", "University Physics", Type.PFC, 3.50, 56, 0, 2));
				repo.save(new Course("PHYS12010", "University Physics Experiment", Type.PFC, 1.50, 0, 48, 2));
				repo.save(new Course("EUS10021", "English II", Type.PFO, 2.00, 32, 0, 2));
				repo.save(new Course("EUS10121", "Oral English II", Type.PFO, 1.00, 16, 0, 2));
				repo.save(new Course("SE10009", "Discrete Mathematics", Type.MF, 3.00, 48, 0, 2));
				repo.save(new Course("SE21007", "Object-Oriented Programming", Type.MF, 3.00, 40, 16, 2));
				repo.save(new Course("SE20201", "Creative Planning for Digital Works", Type.U, 2.00, 32, 0, 3));
				repo.save(new Course("SE21203", "Digital Photography", Type.U, 2.00, 24, 16, 3));
				repo.save(new Course("IPT10400", "Theory of Chinese Socialism", Type.PFC, 3.00, 48, 0, 3));
				repo.save(new Course("IPT20000", "Situation & Policy III", Type.PFC, 0.50, 8, 0, 3));
				repo.save(new Course("MATH20041", "Probability & Statistics I", Type.PFC, 3.00, 48, 0, 3));
				repo.save(new Course("PESS22030", "PE Optional Skills I", Type.PFC, 1.00, 32, 0, 3));
				repo.save(new Course("EUS10031", "English III", Type.PFO, 2.00, 32, 0, 3));
				repo.save(new Course("EUS10131", "Oral English III", Type.PFO, 1.00, 16, 0, 3));
				repo.save(new Course("SE21011", "Computer Architecture", Type.MF, 3.00, 40, 16, 3));
				repo.save(new Course("SE21013", "Data Structure & Algorithm", Type.MF, 3.00, 40, 16, 3));
				repo.save(new Course("SE21015", "Assembly Language", Type.MO, 2.00, 24, 16, 3));
				repo.save(new Course("SE20205", "Color & Plane Composition", Type.U, 2.00, 32, 0, 4));
				repo.save(new Course("IPT10300", "Principles of Marxism", Type.PFC, 3.00, 48, 0, 4));
				repo.save(new Course("IPT20001", "Situation & Policy IV", Type.PFC, 0.50, 8, 0, 4));
				repo.save(new Course("PESS22040", "PE (Running)", Type.PFC, 1.00, 32, 0, 4));
				repo.save(new Course("EUS10041", "English IV", Type.PFO, 2.00, 32, 0, 4));
				repo.save(new Course("EUS10141", "Oral English IV", Type.PFO, 1.00, 16, 0, 4));
				repo.save(new Course("SE21017", "Database Principle & Design", Type.MF, 3.00, 40, 16, 4));
				repo.save(new Course("SE21019", "Computer Network", Type.MF, 3.00, 40, 16, 4));
				repo.save(new Course("SE21021", "Operating System", Type.MF, 3.00, 40, 16, 4));
				repo.save(new Course("SE21101", "Theory of Software Engineering", Type.MC, 2.00, 28, 8, 4));
				repo.save(new Course("SE20025", "Professional English Writing", Type.MO, 2.00, 32, 0, 4));
				repo.save(new Course("SE21023", "Java EE Programming", Type.MO, 2.00, 24, 16, 4));
				repo.save(new Course("SE31027", "Computer Graphics", Type.U, 3.00, 40, 16, 5));
				repo.save(new Course("SE30103", "Software Requirements Analysis", Type.MC, 2.00, 32, 0, 5));
				repo.save(new Course("SE31105", "Object-Oriented Technology & UML", Type.MC, 2.00, 28, 8, 5));
				repo.save(new Course("SE31107", "Web Development", Type.MC, 2.00, 24, 16, 5));
				repo.save(new Course("SE30501", "Information Security", Type.MO, 2.00, 32, 0, 5));
				repo.save(new Course("SE31029", ".NET Framework & C# Programming", Type.MO, 2.00, 24, 16, 5));
				repo.save(new Course("SE31207", "Multimedia Technology", Type.MO, 2.00, 24, 16, 5));
				repo.save(new Course("SE31209", "DirectX Graphics Programming", Type.MO, 2.00, 24, 16, 5));
				repo.save(new Course("SE31311", "Theory of Big Data Engineering", Type.MO, 2.00, 28, 8, 5));
				repo.save(new Course("SE31313", "Machine Learning", Type.MO, 2.00, 28, 8, 5));
				repo.save(new Course("SE31401", "Embedded Architecture", Type.MO, 3.00, 32, 32, 5));
				repo.save(new Course("SE31211", "Human-Computer Interaction", Type.U, 2.00, 24, 16, 6));
				repo.save(new Course("SE30109", "Software Project Management", Type.MC, 2.00, 32, 0, 6));
				repo.save(new Course("SE31111", "Software Architecture & Design Pattern", Type.MC, 2.00, 28, 8, 6));
				repo.save(new Course("SE31113", "Software Testing", Type.MC, 2.00, 24, 16, 6));
				repo.save(new Course("SE30315", "Financial Software & Service", Type.MO, 1.00, 16, 0, 6));
				repo.save(new Course("SE31031", "Compilers", Type.MO, 2.00, 24, 16, 6));
				repo.save(new Course("SE31033", "Digital Image Processing", Type.MO, 2.00, 28, 8, 6));
				repo.save(new Course("SE31213", "Digital Animation & Game Design", Type.MO, 3.00, 36, 24, 6));
				repo.save(new Course("SE31303", "Data Warehouse & Data Mining", Type.MO, 2.00, 28, 8, 6));
				repo.save(new Course("SE31305", "Mobile Application Development", Type.MO, 2.00, 24, 16, 6));
				repo.save(new Course("SE31403", "Embedded System Design", Type.MO, 3.00, 32, 32, 6));
				repo.save(new Course("SE31307", "Computing Service & Application", Type.U, 2.00, 28, 8, 7));
				repo.save(new Course("SE31309", "Geographical Information System", Type.MO, 2.00, 24, 16, 7));
				repo.save(new Course("IPT13100", "Moral Cultivation & Basic Law Practice", Type.P, 1.00, 0, 0, 1));
				repo.save(new Course("SE24061", "Programming Practice", Type.P, 3.00, 0, 0, 2));
				repo.save(new Course("IPT13400", "Theory of Chinese Socialism Practice", Type.P, 3.00, 0, 0, 3));
				repo.save(new Course("SE25012", "Data Structure & Algorithm Course Design", Type.P, 1.00, 0, 0, 3));
				repo.save(new Course("SE25018", "Database Course Design", Type.P, 1.00, 0, 0, 4));
				repo.save(new Course("SE34063", "Software Engineering Practice", Type.P, 3.00, 0, 0, 6));
				repo.save(new Course("SE34065", "Software Production Internship", Type.P, 5.00, 0, 0, 7));
				repo.save(new Course("SE44067", "Graduation Internship", Type.P, 5.00, 0, 0, 7));
				repo.save(new Course("SE45099", "Graduation Design", Type.P, 15.00, 0, 0, 8));
				repo.save(new Course("HG00046", "University Chinese I", Type.PO, 2.00, 32, 0, 0));
				repo.save(new Course("HG00047", "University Chinese II", Type.C, 2.00, 32, 0, 0));
				repo.save(new Course("EDS20801", "Business English", Type.PFO, 2.00, 32, 0, 0));
				repo.save(new Course("EDS20803", "Study Skill", Type.PFO, 2.00, 32, 0, 0));
				repo.save(new Course("MATH31922", "Database Principle", Type.PO, 3.00, 32, 16, 0));
				repo.save(new Course("CST31117", "Compilers", Type.MC, 3.50, 48, 8, 0));
				repo.save(new Course("CST30103", "Information Security", Type.U, 3.00, 40, 8, 0));
				repo.save(new Course("IPG01002", "Mathematical Experiment", Type.C, 2.00, 16, 16, 0));
				repo.save(new Course("STG00036", "Java & App Development", Type.C, 2.00, 32, 0, 0));
				repo.save(new Course("HG00005", "Intercultural Communication", Type.C, 2.00, 32, 0, 0));
				repo.save(new Course("HG00042", "Western Literature", Type.C, 2.00, 32, 0, 0));

	        
				userRepo.save(new User("jacob", encoder.encode("password")));
	      }
	    };
	  }

}
