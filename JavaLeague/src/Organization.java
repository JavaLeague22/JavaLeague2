
	/*Author: Sushil
	 * Date: 23 March 2022
	 *Description: Created the child class name organization and inherited from user class named contact
	*/
	 public class Organization extends Contact {
	
	private String website;
	
	//created constructor for Organization with one private attributes
	 Organization(String name, String number, String createdAt) {
		super(name, number, createdAt);
		this.website=website;
		
	 }
		public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
		@Override
		public String toString() {
			return "Organization [website= "+ website+"]";
		}
}

	 

// Sushil
public class Organization {

}
