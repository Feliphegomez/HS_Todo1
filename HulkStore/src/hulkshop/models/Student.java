package hulkshop.models;

public class Student {
	private int id;
    private String firstName;
    private String lastName;

    public Student(int i, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
    	this.setId(i);
    	this.setFirstName(firstName);
    	this.setLastName(lastName);
	}
    // constructors, getters and setters goes here

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}