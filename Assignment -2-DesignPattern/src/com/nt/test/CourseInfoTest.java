package com.nt.test;
import com.nt.comps.ICourse;
import com.nt.comps.Student;
import com.nt.factroy.StudentFactory;
public class CourseInfoTest {
	public static void main(String[] args) {
Student student=StudentFactory.getInstance("phpcourse");
student.coursefees(3000);
	}

}
