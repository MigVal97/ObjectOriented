package org.generation;

import org.generation.classes.Student;
import org.generation.classes.StudentService;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
	    studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
	    studentService.addStudent(new Student(  "Ian", "1020", 28 ) );//
	    studentService.addStudent(new Student( "Elise", "1020", 26 ) );
	    studentService.addStudent(new Student( "Santiago", "1020", 33 ) );
	    
//	    studentService.students.put( "500", new Student( "Carlos", "1030", 31 ) );
//        studentService.students.put( "501", new Student( "Ian", "1020", 28 ) );
//        studentService.students.put( "502", new Student( "Elise", "1020", 26 ) );
//        studentService.students.put( "503", new Student( "Santiago", "1020", 33 ) );

        studentService.enrollStudents( "Math", "1030" );
    }
    
	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}