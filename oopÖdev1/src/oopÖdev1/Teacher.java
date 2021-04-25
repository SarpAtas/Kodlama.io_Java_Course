package oop÷dev1;

public class Teacher {
	
	public Teacher()
	{
		System.out.println("Teacher is created");
	}
	public Teacher(int id, String name, String faculty, int age, String address, String position)
	{
		this();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.age = age;
		this.address = address;
		this.position = position;
	}
	
	int id;
	String name; 
	String faculty; 
	int age;
	String address;
	String position;
	
}
