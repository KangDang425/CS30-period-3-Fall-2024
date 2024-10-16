package skillbuilder_chap11;

import java.io.*;

public class Student implements Serializable {
	private String stuName;
	private String stuGrade;
	
	public Student(String name,String grade) {
		stuName = name;
		stuGrade = grade;
	}
	
	
	public String toString() {
		String stuString;
		stuString = "Student name is " + stuName + " " + stuGrade ;
		return(stuString);
	}

	
	
	
	

}
