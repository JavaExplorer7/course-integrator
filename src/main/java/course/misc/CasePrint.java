package course.misc;

import java.util.Arrays;
import java.util.List;

import course.web.api.SchoolConversion;

public class CasePrint {

  public static void main(String[] args) {
    
    List<String> depts = Arrays.asList("AU", "SS", "S", "E", "BE", "IS");
    
    for (String dept: depts)
      for (String schoolID : SchoolConversion.getSchools(dept).values())
        System.out.println("\tcase \"" + schoolID + "\""
            + "\t:\treturn SCHOOL_" + schoolID + ";");
  }

}
