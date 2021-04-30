package day3_HW2;

public class User {
	String firstName;
	String lastName;
	String address;
	int id;
	String tag;
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String firstName, String lastName, String address, int id, String tag) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.id = id;
		this.tag = tag;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
