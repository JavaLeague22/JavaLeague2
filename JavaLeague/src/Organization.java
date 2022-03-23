	/*Author: Sushil
	 * Date: 23 March 2022
	 */Description: Created the child class name new organization and inherited from user class named contact

	 public class Organization extends Contact {
	
	private String website;
	
	//created constructor for Organization with one private attributes
	public Organization(String name, String number, String createdAt) {
		super(name, number, createdAt);
		this.website=website;
		
		@Override
		public String toString() {
			return "Organization [website= "+ website+"]";
		}
}
}
	 