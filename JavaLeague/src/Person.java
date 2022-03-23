
import java.text.SimpleDateFormat;

public class Person {

	private String email;
	private SimpleDateFormat DOB = new SimpleDateFormat("dd/mm/yyyy");

	Person(String email, SimpleDateFormat DOB) {
		//super(name, contactNumber);
		this.email = email;
		this.DOB = DOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SimpleDateFormat getDOB() {
		return DOB;
	}
	
	public void setDOB(SimpleDateFormat dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", DOB=" + DOB + "]";
	}
}
