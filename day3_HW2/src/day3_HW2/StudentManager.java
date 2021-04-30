package day3_HW2;

public class StudentManager {
	public void add(Student student)
	{
		System.out.println("Student: " + student.firstName +" "+student.lastName + " ( " + student.id + " ) " + "registered!");
	}
	public void joinTheCourse(Student student, String courseID)
	{
		System.out.println("Student "+ student.getId() + " joined the course " + courseID);
	}
}
