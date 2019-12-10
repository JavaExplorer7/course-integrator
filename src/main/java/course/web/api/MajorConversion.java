package course.web.api;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorConversion {
	
	public static final Map<String, String> DEPARTMENTS = 
			Stream.of(new String[][] {
				{"Arts and Humanities", "AU"},
				{"Social Science", "SS"},
				{"Sciences", "S"},
				{"Engineering", "E"},
				{"Built Environment", "BE"},
				{"Information Science", "IS"}})
		.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_AU = 
			Stream.of(new String[][] {
					{"Foreign Languages", "FL"},
					{"Arts", "AT"},
					{"Physical Education", "PE"},
					{"Meishi Film Academy", "FA"},
					{"Liberal Arts College", "LA"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_SS = 
			Stream.of(new String[][] {
					{"Public Administration", "PA"},
					{"Economics and Business Administration", "EBA"},
					{"Journalism", "JL"},
					{"School of Law", "SL"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_S = 
			Stream.of(new String[][] {
					{"Mathematics and Statistics", "MATH"},
					{"Physics", "PHY"},
					{"Chemistry and Chemical Engineering", "CCE"},
					{"Pharmaceutical Science", "PS"},
					{"Bioengineering", "BIO"},
					{"Life Science", "LS"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_E = 
			Stream.of(new String[][] {
					{"Electrical Engineering", "EE"},
					{"Mechanical Engineering", "ME"},
					{"Power Engineering", "PE"},
					{"Resources and Environmental Science", "RE"},
					{"Materials Science and Engineering", "MSE"},
					{"Aerospace Engineering", "AE"},
					{"Automotive Engineering", "AE"},
					{"CQU-UC Joint Co-op Institute", "CUC"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_BE = 
			Stream.of(new String[][] {
					{"Architecture and Urban Planning", "AUP"},
					{"Civil Engineering", "CE"},
					{"Urban Construction and Environmental Engineering", "UCEE"},
					{"Construction Management and Real Estate", "CMRE"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));	

	private static final Map<String, String> DEPT_IS = 
			Stream.of(new String[][] {
					{"Computer Science", "CST"},
					{"Big Data and Software Engineering", "SE"},
					{"OptoElectronic Engineering", "OEE"},
					{"Communication Engineering", "CE"},
					{"Automation", "AUTO"}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));	
	
	public static Map<String, String> getSchool(String dept) {
		switch (dept) {
		
			case "AU":	return DEPT_AU;
			case "SS": 	return DEPT_SS;
			case "S" : 	return DEPT_S;
			case "E" : 	return DEPT_E;
			case "BE": 	return DEPT_BE;
			case "IS": 	return DEPT_IS;
			
			default  : return null;
		}
	}

}
