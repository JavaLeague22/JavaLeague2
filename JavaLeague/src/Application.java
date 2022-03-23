import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Application Shafir
public class Application {
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//list method
	static void list() {
		System.out.println(contactList);
	}
	
	//search method
	static Contact search() {
		
		//HashMap to store Contacts
		HashMap<Integer, Contact> hashContactList = new HashMap<Integer, Contact>();
		
		//Loop to add contacts to created hashmap
		for(int i = 0; i < contactList.size(); i++) {
			hashContactList.put(i, contactList.get(i));
		}
		
		Scanner key = new Scanner(System.in);
		String query = key.nextLine();
		for(int j = 0; j < hashContactList.size(); j++) {
			if(query.equalsIgnoreCase(hashContactList.get(j).getName())); {
				System.out.println(j + "." + hashContactList.get(j).getName()));
			}
		}
		 
	}
	
}
