package course.misc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RawToSQL {

  private static final String FILE_DIR = 
      "/home/jacob/Documents/college/Course-Integrator-Project/data/";
  
  private static final String TASK_IN   = FILE_DIR + "raw-EN.txt";
  private static final String TASK_OUT   = FILE_DIR + "data.sql";
  
  private static StringBuffer temp = new StringBuffer();
  
  private static void addToBuffer(String[] tokens) throws IOException {
    
    temp.append("insert into Course (id, title, type, credit, theory, experiment, semester)\n");
    
    temp.append("\t\t\tvalues (");
    
    int i, j;
    i = j = 0;
    
    for (; i < tokens.length; ++i) {
      if (tokens[i].length() < 1)
        continue;
      
      // escape any single quote
      if (tokens[i].contains("'"))
        tokens[i] = tokens[i].replace("'", "\\'");
      
      if (j++ < 6)
        temp.append("'" + tokens[i].trim() + "', ");
      else
        temp.append("'" + tokens[i].trim() + "'");
    }
    
    temp.append(");\n");
  }
  
  
  private static void read() throws IOException {
    File file = new File(TASK_IN);
    Scanner input = new Scanner(file);
      
    while (input.hasNext()) {
      String line = input.nextLine();
      
      if (line.length() < 2)
        continue;
      
      String[] tokens = line.split("\t");
      
      //System.out.print(++lineno + "\t");
      addToBuffer(tokens);
      //System.out.println();
    }
    
    input.close();
  }
  
  private static void write() throws IOException {
    File file = new File(TASK_OUT);
    try (
        PrintWriter output = new PrintWriter(file);
    ) {
      output.print(temp.toString());
    }
  }
  
  public static void main(String[] args) throws IOException {
    read();
    write();
  }

}
