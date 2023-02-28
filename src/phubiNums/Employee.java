package phubiNums;

public class Employee extends Person{
	
	private String position;
	private int emploeeID;
	
	public Employee() {
		
		super();
		this.position = "";
		this.emploeeID = 0;
	}
	public Employee(String position, int emploeeID) {
		
		super();
		this.position = position;
		this.emploeeID = emploeeID;
	}
	public Employee(String position, int employeeID, String firstName, String lastName, String email, String gender,
			int age) {
		super(firstName, lastName, email, gender, age);
		this.position = position;
		this.emploeeID = employeeID;
	}
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getEmploeeID() {
		return emploeeID;
	}

	public void setEmploeeID(int emploeeID) {
		this.emploeeID = emploeeID;
	}
	@Override
	public String toString() {
		return "Empleement [" + super.toString() + " position: " + position + "ID: " + emploeeID + "]";
	}


}
