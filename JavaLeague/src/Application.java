
import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class Application {

	public static void main(String[] args) {
		
		int userInput;
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> Contacts = new ArrayList<String>();
		
		//placeholders for methods
		/*addMethod();
		listMethod();
		countMethod();
		infoMethod();
		deleteMethod();
		searchMethod();
		*/
		
		
		System.out.println("Make a selection from the following menu");
		
		do {
		//display menu until the exit option is chosen
			System.out.println("1.Add 2.List 3.Count 4.Info 5.Delete 6.Search 7.Exit");
		
		} while (userInput <= 6);
		
		if (userInput == 1) {
				//insert add method
		} else if (userInput == 2) {
				//insert list method
		} else if (userInput == 3) {
				//insert count method
		} else if (userInput == 4) {
				//insert info method
		} else if (userInput == 5) {
				//insert delete method
		} else if (userInput == 6) {
				//insert search method
		} else if (userInput == 7) {
			System.out.println("Thank you. Have a Nice Day!");
		} else {
			System.out.println("Invalid selection");
		
		}
			
			//try (FileNotFoundException a) {
				
				
			//} catch (FileNotFoundException a) {
			//	System.out.println("No file exists");
		
			
			
			input.close();
}
}



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
	

//GitHub turns my brains to mush

//Chelsea

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


