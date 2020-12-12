package com.nt.comps;
public class Student {
private ICourse course;
public void setCourse(ICourse course) {
this.course=course;
}
public void  coursefees(int fees) {
System.out.println("Course Fees:"+fees+" rs");

course.startCourse();
course.endCourse();
}

}