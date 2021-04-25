package oopÖdev1;

public class StudentManager {
	
	public void setStudentAddress(Student student, String address)
	{
		student.address = address;
	}
	public int getStudentId(Student student)
	{
		return student.id;
	}
	public double getStudentGPA(Student student)
	{
		return student.gpa;
	}
	
}
