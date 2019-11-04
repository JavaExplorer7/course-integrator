package course.misc;

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
					{"Foreign Languages", ""},
					{"Arts", ""},
					{"Physical Education", ""},
					{"Meishi Film Academy", ""},
					{"Liberal Arts College", ""}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_SS = 
			Stream.of(new String[][] {
					{"Public Administration", ""},
					{"Economics and Business Administration", ""},
					{"Journalism", ""},
					{"School of Law", ""}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_S = 
			Stream.of(new String[][] {
					{"Mathematics and Statistics", ""},
					{"Physics", ""},
					{"Chemistry and Chemical Engineering", ""},
					{"Pharmaceutical Science", ""},
					{"Bioengineering", ""},
					{"Life Science", ""}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_E = 
			Stream.of(new String[][] {
					{"Electrical Engineering", ""},
					{"Mechanical Engineering", ""},
					{"Power Engineering", ""},
					{"Resources and Environmental Science", ""},
					{"Materials Science and Engineering", ""},
					{"Aerospace Engineering", ""},
					{"Automotive Engineering", ""},
					{"CQU-UC Joint Co-op Institute", ""}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	private static final Map<String, String> DEPT_BE = 
			Stream.of(new String[][] {
					{"Architecture and Urban Planning", ""},
					{"Civil Engineering", ""},
					{"Urban Construction and Environmental Engineering", ""},
					{"Construction Management and Real Estate", ""}})
			.collect(Collectors.toMap(data -> data[0], data -> data[1]));	

	private static final Map<String, String> DEPT_IS = 
			Stream.of(new String[][] {
					{"Computer Science", "CST"},
					{"Big Data and Software Engineering", "SE"},
					{"OptoElectronic Engineering", ""},
					{"Communication Engineering", ""},
					{"Automation", ""}})
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
	
	public static void main(String[] args) {
		
		for (String s : DEPARTMENTS.keySet())
			System.out.println(s + "\t-> \t" + DEPARTMENTS.get(s));
			
		String dept = "IS";
		
		String majorID = getSchool(dept).get("Big Data and Software Engineering");
		
		System.out.println(majorID);
	}

}
