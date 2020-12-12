package com.nt.factroy;
import com.nt.comps.DotNetCourse;
import com.nt.comps.ICourse;
import com.nt.comps.JavaCourse;
import com.nt.comps.PhpCourse;
import com.nt.comps.Student;
public class StudentFactory {
public static Student getInstance(String courseType) {
	ICourse course=null;
	if(courseType.equalsIgnoreCase("javacourse")) {
		course= new JavaCourse();
	}else if (courseType.equalsIgnoreCase("dotnetCourse")) {
		course=new DotNetCourse();
	}else if (courseType.equalsIgnoreCase("PhpCourse")) {
		course= new PhpCourse();
		}else {
	throw new IllegalArgumentException("invalid argumnet");
	}
	Student student=new Student();
	student.setCourse(course);
	return student;
	}
}
