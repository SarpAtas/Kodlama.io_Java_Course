package oop÷dev1;

public class Course {
	public Course()
	{
		System.out.println("Course is created");
	}
	public Course(int id, String name, String category, int capacity)
	{
		this();
		this.id = id;
		this.name = name;
		this.category = category;
		this.capacity = capacity;
	
	}
	
	int id;
	String name; 
	String category; 
	int capacity;

}
