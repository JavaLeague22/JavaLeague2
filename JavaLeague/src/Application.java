import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> Menu = new ArrayList<String>();
		
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
