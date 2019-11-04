package course.misc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import course.domain.Course;

public class RawToRepo {

	private static final String FILE_DIR = 
			"/home/jacob/Documents/Course-Integrator-Project/data/";
	
	private static final String TASK_IN_DIR = FILE_DIR + "raw-EN.txt";
	private static final String TASK_OUT_DIR = FILE_DIR + "data.repo";
	
	private static StringBuffer temp = new StringBuffer();
	
	private static void addToBuffer(String[] token) throws IOException {
		
		temp.append("repo.save(new Course(");
		
		int i, j;
		i = j = 0;
		
		for ( ; i < token.length; ++i) {
			if (token[i].length() < 1)
				continue;
			
			if (++j <= 2)
				temp.append("\"" + token[i].trim() + "\", ");
			else if (j == 3)
				temp.append("Type." + token[i].trim() + ", ");
			else if (j < 7)
				temp.append(token[i].trim() + ", ");
			else
				temp.append(token[i].trim() + ")");
		}
		
		temp.append(");\n");
	}
	
	
	private static void read() throws IOException {
		File file = new File(TASK_IN_DIR);
		Scanner input = new Scanner(file);
			
		while (input.hasNext()) {
			String line = input.nextLine();
			
			if (line.length() < 2)
				continue;
			
			String[] token = line.split("\t");
			
			//System.out.print(++lineno + "\t");
			addToBuffer(token);
			//System.out.println();
		}
		
		input.close();
	}
	
	private static void write() throws IOException {
		File file = new File(TASK_OUT_DIR);
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
