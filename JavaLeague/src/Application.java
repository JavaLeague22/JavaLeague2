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