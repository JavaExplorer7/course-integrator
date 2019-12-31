package course.misc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class CompilerCourse {
  
  public static final String ID = "CST31117";

  public static final String TITLE = "Compilers (Fall 2019)";

  public static final String DESCRIPTION = "This course will discuss the major ideas used today in the implementation of programming language compilers, including lexical analysis, parsing, syntax-directed translation, abstract syntax trees, types and type checking, intermediate languages, data flow analysis, program optimization, code generation, and run time systems. As a result, you will learn how a program written in a high-level language designed for humans is systematically translated into a program written in low-level assembly more suited to machines. Along the way we will also touch on how programming languages are designed, programming language semantics, and why there are so many different kinds of programming languages.";
  
  public static HashMap<String, String> getInfo() {
    HashMap<String, String> info = new HashMap<>();
    info.put("Books", "Compilers: Principles, Techniques & Tools, by Aho, Lam, Sethi and Ullman, Second edition. ISBN 0-321-48681-1. First edition will also be fine.");
    info.put("Tasks", "The class includes three homework and four programming projects based on the lab book.");
    info.put("Exams", "The class will have a final examination during exams week and it is opened-book.");
    info.put("Others","Anything worth mentioning will be pushished here.");
    return info;
  }
  
  public static HashMap<String, Integer> getGrading() {
    HashMap<String, Integer> grades = new HashMap<>();
    grades.put("Attendance", 5);
    grades.put("Homework",   15);
    grades.put("Projects",   40);
    grades.put("Final",      40);
    return grades;
   }
  
  public static HashMap<String, Date> getTasks() {
    HashMap<String, Date> tasks = new HashMap<>();
    for (int i = 0; i < DATES.length; i++) {
      tasks.put(ASSINGMENTS[i], 
          Date.from(DATES[i].atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }
    return tasks;
   }
  
  private static final LocalDate[] DATES = {LocalDate.of(2019, 9, 20),
      LocalDate.of(2019, 10, 10), LocalDate.of(2019, 10, 30),
      LocalDate.of(2019, 10, 5),  LocalDate.of(2019, 10, 25),
      LocalDate.of(2019, 11, 25), LocalDate.of(2019, 12, 25)};
  
  private static final String[] ASSINGMENTS = {
      "Homework 1", "Homework 2", "Homework 3",
      "Project 1: Getting Started", "Project 2: Lexical & Syntax Analysis",
      "Project 3: Sematic Analysis", "Project 4: Code Generation"};

}
