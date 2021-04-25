package oop÷dev1;

public class Student {
	public Student()
	{
		System.out.println("Student is created");
	}
	public Student(int id, String name, String faculty, double gpa, String address)
	{
		this();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.gpa = gpa;
		this.address = address;
	}
	
	int id;
	String name; 
	String faculty; 
	double gpa;
	String address;
}
