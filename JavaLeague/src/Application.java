

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
		
		//User Input
		String query = key.nextLine();
		
		//Loops through HashMap for equivalent names / and prints equivalent keys with matching names
		for(int j = 0; j < hashContactList.size(); j++) {
			if(query.equalsIgnoreCase(hashContactList.get(j).getName())); {
				System.out.println(j + "." + hashContactList.get(j).getName()));
			}
		}
		 
	}
	
}
//GitHub turns my brains to mush

//Chelsea

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> Contacts = new ArrayList<String>();
		
		//placeholders for methods
		/*addMethod();
		listMethod();
		countMethod();
		infoMethod();
		deleteMethod();
		searchMethod();
		exitMethod();
		*/
		//
		
		System.out.println("Make a selection from the following menu");
		
		do {
		//display menu until the exit option is chosen
			System.out.println("1.Add 2.List 3.Count 4.Info 5.Delete 6.Search 7.Exit");
		
		} while (input);

			
			try (FileNotFoundException a) {
				
				
			} catch (FileNotFoundException a) {
				System.out.println("No file exists");
		
			}
			
			input.close();
}
}

