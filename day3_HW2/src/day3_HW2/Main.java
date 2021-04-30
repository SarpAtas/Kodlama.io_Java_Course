package day3_HW2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Sarp" , "Ataş", "Ankara", 1, "Student", 3.4, 100);
		Student student2 = new Student("Veli", "Sazan", "İstanbul", 2,"Student", 3, 90);
		Student student3 = new Student();
		student3.setFirstName("Sezin");
		student3.setLastName("Asya");
		student3.setAddress("İzmir");
		student3.setId(3);
		student3.setTag("Student");
		student3.setGpa(3.1);
		student3.setAttendanceScore(10);
		
		User [] students = {student1,student2,student3};
		UserManager userManager = new UserManager();
		userManager.addMultiple(students);
		
		Instructor teacher1 = new Instructor("Kemal" , "Ataş", "Ankara", 11, "Teacher", "Physics", "Phd");
		Instructor teacher2 = new Instructor("Halil" , "İbrahim", "Ankara", 22, "Teacher", "CS", "Prof");
		Instructor teacher3 = new Instructor();
		teacher3.setFirstName("Sezin");
		teacher3.setLastName("Asya");
		teacher3.setAddress("İzmir");
		teacher3.setId(33);
		teacher3.setTag("Teacher");
		teacher3.setFieldOfTeaching("Social Science");
		teacher3.setPosition("Part-time");
		User [] teachers = {teacher1,teacher2,teacher3};
		userManager.addMultiple(teachers);
		
		InstructorManager instructerManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructerManager.add(teacher1);
		studentManager.add(student1);
		
		studentManager.joinTheCourse(student1, "CS101");
	
	}

}
