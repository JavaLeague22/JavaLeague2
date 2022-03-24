import java.util.Date;


public class Person extends Contact {

	private String email;
	private Date DOB = new Date();

	Person(String email, Date DOB, String name, String contactNumber) {
		super(name, contactNumber);
		this.email = email;
		this.DOB = DOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDOB() {
		return DOB;
	}
	
	public void setDOB(Date DOB) {
		DOB = DOB;
	}

	@Override
	public String toString() {
		return name + "[phoneNumber=" contactNumber+", email=" + email + ", DOB=" + DOB + "]";
	}
}
