
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

//Application Shafir
public class Application {
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>();
	static Scanner key = new Scanner(System.in);
	
	//add method
	static void add() {
		System.out.println("Do you want to add a person, or Organization. Enter 1 for Person, 2 for Organization.");
		int choice = key.nextInt();
		if(choice == 1) {
			System.out.println("Enter the name.");
			String name = key.nextLine();
			key.nextLine();
			System.out.println("Enter the contact number.");
			String contactNumber = key.nextLine();
			Contact.isNumberValid(contactNumber);
			System.out.println("Enter the email.");
			String email = key.nextLine();
			key.nextLine();
			System.out.println("Enter the contacts's date of birth in 'dd/mm/yyyy' format.");
			String date = key.nextLine();
			Date DOB=null;
			
			try {
				DOB = new SimpleDateFormat("dd/mm/yyyy").parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Person contact = new Person(email, DOB, name, contactNumber);
			contactList.add(contact);
		} else if(choice == 2){
			System.out.println("Enter the name.");
			String name = key.nextLine();
			key.nextLine();
			System.out.println("Enter the contact number.");
			String contactNumber = key.nextLine();
			Contact.isNumberValid(contactNumber);
			System.out.println("Enter the website.");
			String website = key.nextLine();
			Organization contact = new Organization(name, contactNumber, website);
			contactList.add(contact);
		}
	}
	//list method
	static void list() {
		int j = 0;
		for(Contact i : contactList) {
			System.out.println(contactList.indexOf(i) + ":" + contactList.get(j).getName(j));
		}
	}
	
	//count method
	static void count() {
		System.out.println(contactList.size());
	}
	
	//info method
	static void info() {
		Application.list();
		int input = key.nextInt();
		if(contactList.contains(contactList.get(input))) {
			System.out.println(contactList.get(input));
		}
	}
	
	//delete method
	static void delete() {
		Application.list();
		System.out.println("Enter the id of the contact you want to delete.");
		int input = key.nextInt();
		contactList.remove(input);
		
	}
	
	//search method
	static void search() {
		
		//HashMap to store Contacts
		HashMap<Integer, Contact> hashContactList = new HashMap<Integer, Contact>();
		
		//Loop to add contacts to created hashmap
		for(int i = 0; i < contactList.size(); i++) {
			hashContactList.put(i, contactList.get(i));
		}
		
		//User Input
		String query = key.nextLine();
		
		//Loops through HashMap for equivalent names / and prints equivalent keys with matching names
		for(int j = 0; j < hashContactList.size(); j++) {
			if(query.equalsIgnoreCase(hashContactList.get(j).name)); {
				System.out.println(j + "." + hashContactList.get(j).name);
			}
		}
		 
	}
	

//GitHub turns my brains to mush

	public static void main(String[] args) {
		
		int userInput=0;
		
		
		Scanner input = new Scanner(System.in);
					
		System.out.println("Make a selection from the following menu");
		
		do {
		//display menu until the exit option is chosen
			System.out.println("1.Add 2.List 3.Count 4.Info 5.Delete 6.Search 7.Exit");
			userInput = input.nextInt();
			
		if (userInput == 1) {
				//insert add method
			Application.add();
		} else if (userInput == 2) {
				//insert list method
			Application.list();
		} else if (userInput == 3) {
				//insert count method
			Application.count();
		} else if (userInput == 4) {
				//insert info method
			Application.info();
		} else if (userInput == 5) {
				//insert delete method
			Application.delete();
		} else if (userInput == 6) {
				//insert search method
			Application.search();
		} else if (userInput == 7) {
			System.out.println("Thank you. Have a Nice Day!");
		} else {
			System.out.println("Invalid selection");
		
		}
	} while (userInput <= 6);	
			//try (FileNotFoundException a) {
				
				
			//} catch (FileNotFoundException a) {
			//	System.out.println("No file exists");
		
			
			key.close();
			input.close();
}
	
}



