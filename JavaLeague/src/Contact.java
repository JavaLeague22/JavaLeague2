
public class Contact {



import java.util.Date;

public abstract class Contact {

	protected String name;
	protected String contactNumber;
	protected Date createdAt;

	public Contact(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
		createdAt = new Date();

	}

	public abstract void isNumberValid(String numberToCheck);

	@Override
	public String toString() {
		return "Contact [name= " + name + ", contactNumber= " + contactNumber + "]";
	}

