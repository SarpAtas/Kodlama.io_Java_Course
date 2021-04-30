package day3_HW2;

public class Instructor extends User{
	String fieldOfTeaching;
	String position;
	
	public String getFieldOfTeaching() {
		return fieldOfTeaching;
	}

	public void setFieldOfTeaching(String fieldOfTeaching) {
		this.fieldOfTeaching = fieldOfTeaching;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Instructor(String firstName, String lastName, String address, int id, String tag, String fieldOfTeaching,
			String position) {
		super(firstName, lastName, address, id, tag);
		this.fieldOfTeaching = fieldOfTeaching;
		this.position = position;
	}

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
