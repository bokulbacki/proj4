import java.util.*;
import java.io.*;

public class proj4
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner (System.in);
		boolean choosing = true;
		System.out.println("Welcome to the Phone Directory.");
		while (choosing)
		{
			System.out.println("Please choose an option below. \n 1. Load a previously saved phone directory from file \n 2. Add or change an enrty \n 3. Remove an entry \n 4. Search for an entry \n 5. Display all entries \n 6. Save the current phone directory to a file \n 7. Quit the Program ");
			int choice = kb.nextInt();

		if (choice ==1)
		{
			//
		}	
		else if (choice ==2)
		{
			System.out.println("Please enter the name you would like to add");
			String name = kb.nextLine();
			System.out.println("Please enter the number associated with "+ name + ". Format: xxx-xxx-xxxx");
			String number = kb.nextLine();
			PhoneDirectory.addOrChangeEntry(name,number);
		}	
		else if (choice ==3)
		{
			System.out.println("Please enter the name you would like to remove:");
			String name = kb.nextLine();
			PhoneDirectory.removeEntry(name);

		}	
		else if (choice ==4)
		{
			System.out.println("Please enter the name you would like to search.");
			String name = kb.nextLine();
			PhoneDirectory.searchEntry(name);
			 
		}
		else if (choice ==5)
		{
			PhoneDirectory.displayAllEntries();
		}
		else if (choice ==6)
		{
			System.out.println("Save the current phone directory to a file.");

		}
		else if (choice ==7)
		{
			System.exit(1);
		
		}
		else 
		{
			System.out.println("Invalid entry.");
		}
		}

	}	
}	
