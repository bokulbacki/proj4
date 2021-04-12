import java.util.*;
import java.io.*;


//The proj4 class is the driver class for the Phone Directory. This allows the
//user to manipulate the phone directory with a user-friendly menu as well as
//displaying the directory's contents.
//
//Bo Kulbacki - rkulbacki@sandigo.edu
//Dalton Kohl - dkohl@sandiego.edu
//
//Last modifed: 4-12-21 

public class proj4
{
	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		boolean choosing = true;
		PhoneDirectory pDirectory = new PhoneDirectory();
		System.out.println("Welcome to the Phone Directory.");
		while (choosing)
		{
			System.out.println("Please choose an option below. \n 1. Load a previously saved phone directory from file \n 2. Add or change an enrty \n 3. Remove an entry \n 4. Search for an entry \n 5. Display all entries \n 6. Save the current phone directory to a file \n 7. Quit the Program ");
			int choice = Integer.parseInt(kb.nextLine());
	
		if (choice ==1)
		{
			System.out.println("Enter the name of the file you would like to load a existing directory from:");
			String fileName =kb.nextLine();
			try{
				//files that will be read in will be in the form:
				//Name,Number 
				//Name,Number...
				BufferedReader input = new BufferedReader(new FileReader(fileName));
				String line;
				while ((line = input.readLine()) != null)
				{
					String contents [] = line.split(",");
					//DirectoryEntry newEntry = new DirectoryEntry(contents[0], contents[1]);
					pDirectory.addOrChangeEntry(contents[0], contents[1]);
					
				}	
				
			}
			catch (FileNotFoundException f)
			{
				System.out.println(f.getMessage());
				System.exit(1);
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
				System.exit(1);
			}			
		}	
		else if (choice ==2)
		{
			System.out.println("Please enter the name you would like to add:");
			String name = kb.nextLine();
			System.out.println("Please enter the number associated with "+ name + ". Format: xxx-xxx-xxxx");
			String number = kb.nextLine();
			pDirectory.addOrChangeEntry(name,number);
		}	
		else if (choice ==3)
		{
			System.out.println("Please enter the name you would like to remove:");
			String name = kb.nextLine();
			pDirectory.removeEntry(name);

		}	
		else if (choice ==4)
		{
			System.out.println("Please enter the name you would like to search.");
			String name = kb.nextLine();
			DirectoryEntry searched = pDirectory.searchEntry(name);
			if (searched == null)
			{
				System.out.println("Entry not found.");
			}
			else
				{
				System.out.println(searched.getName() + " " + searched.getNumber());
				 }
		}
		else if (choice ==5)
		{
			pDirectory.displayAllEntries();
		}
		else if (choice ==6)
		{
			try{
			System.out.println("Enter the name of the file you wish to save this directory to: ");
			String newFile = kb.nextLine();
			PrintWriter output = new PrintWriter(new FileOutputStream(newFile));
			pDirectory.saveToFile(output); 
			}
			catch (FileNotFoundException f)
			{
				System.out.println(f.getMessage());
				System.exit(1);
			}
			//catch (IOException e)
			//{
			//	System.out.println(e.getMessage());
		//		System.exit(1);
		//	}
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
