package oopÖdev1;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1,"Sarp","CS",2.06,"Ankara");
		Student student2 = new Student();
		
		Teacher teacher1 = new Teacher(1,"Engin","CS",28,"Ankara","Professor");
		Teacher teacher2 = new Teacher();
		
		Course course1 = new Course(1,"Java Course","Coding",50);
		
		StudentManager studentManager = new StudentManager();
		studentManager.setStudentAddress(student1, "İstanbul");
		System.out.println("student1 s new address : " + student1.address);	
	
		System.out.println(studentManager.getStudentId(student1));
		System.out.println(studentManager.getStudentGPA(student1));
	
		System.out.println(teacher1.name);
		System.out.println(course1.category);
		
	
		/* Like StudentManager class,
			TeacherManager and CourseManager classes could be created as well this was just an example
		*/
	}

}
