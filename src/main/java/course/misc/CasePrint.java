package course.misc;

import java.util.Arrays;
import java.util.List;

import course.web.api.MajorConversion;

public class CasePrint {

  public static void main(String[] args) {
    
    List<String> depts = Arrays.asList("AU", "SS", "S", "E", "BE", "IS");
    
    for (String dept: depts)
      for (String schoolID : MajorConversion.getSchools(dept).values())
        System.out.println("\tcase \"" + schoolID + "\""
            + "\t:\treturn SCHOOL_" + schoolID + ";");
  }

}
