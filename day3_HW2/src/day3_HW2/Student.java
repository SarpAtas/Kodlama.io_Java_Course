package day3_HW2;

public class Student extends User{
	double gpa;
	int attendanceScore;
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAttendanceScore() {
		return attendanceScore;
	}

	public void setAttendanceScore(int attendanceScore) {
		this.attendanceScore = attendanceScore;
	}

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String address, int id, String tag, double gpa, int attendanceScore) {
		super(firstName, lastName, address, id, tag);
		this.gpa = gpa;
		this.attendanceScore = attendanceScore;
	}

}
