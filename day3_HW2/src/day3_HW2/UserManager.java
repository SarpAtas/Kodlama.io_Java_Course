package day3_HW2;


public class UserManager {

	public void add(User user)
	{
		if(user.tag.equals("Student"))
			System.out.println("Student: " + user.id + " added!");
		else if(user.tag.equals("Teacher"))
			System.out.println("Teacher: " + user.id + " added!");
		else
			System.out.println("User: " + user.id + " added!");

	}
	
	public void addMultiple(User [] users)
	{
		for(User user: users)
			add(user);
	}
	
	
	
	//More functions can be writen as long as it can be executed for Student and Instructor classes as well
	
}
