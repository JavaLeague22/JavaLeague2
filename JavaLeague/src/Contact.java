//Anatalio
import java.util.Date;

public class Contact {

	protected String name;
	protected String contactNumber;
	protected Date createdAt;

	public Contact(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
		createdAt = new Date();

	}

	public void isNumberValid(String numberToCheck) {
		// method to check if contactNumber String has 12 characters

	}

	@Override
	public String toString() {
		return "Contact [name= " + name + ", contactNumber= " + contactNumber + "]";
	}

}