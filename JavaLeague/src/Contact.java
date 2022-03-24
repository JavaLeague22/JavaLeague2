
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
//added comment to save4
	public static void isNumberValid(String numberToCheck) {
				
		if (numberToCheck.length()!=12) {
			System.out.println("The contact number you have entered is invalid.");			
		}else {
			//else just continue as normal
		}		
		
	}

	@Override
	public String toString() {
		return "Contact [name= " + name + ", contactNumber= " + contactNumber + "]";
	}

}
