import java.io.*;
import java.util.*;

//The PhoneDirectory class is used to create the entire directory and then
//manage the directory. It contains a constructor as well as a few methods.
//The directory is an ArrayList of DirectoryEntrys.
//Bo Kulbacki - rkulbacki@sandiego.edu
//Dalton Kohl - dkohl@sandiego.edu
//
//Last modified: 4-12-21



public class PhoneDirectory{
	private List<DirectoryEntry> theDirectory = new ArrayList<>();
	public PhoneDirectory(){
	 	 this.theDirectory = new ArrayList<>();
	}

	public String addOrChangeEntry(String name, String number){
		int index = theDirectory.indexOf(new DirectoryEntry(name, ""));
		if(index != -1){
			String oldNumber = theDirectory.get(index).getNumber();
			theDirectory.set(index, new DirectoryEntry(name, number));
			return oldNumber;
		}
		else{
		theDirectory.add(new DirectoryEntry(name, number));
		return null;
		}
	}
	
	public DirectoryEntry searchEntry(String name){
		int index = theDirectory.indexOf(new DirectoryEntry(name, ""));
		//System.out.println(index);
		if(index != -1){
			return theDirectory.get(index);
		}
		else{
			return null;
		}
	}

	public DirectoryEntry removeEntry(String name)
	{
		int index = theDirectory.indexOf(new DirectoryEntry(name,""));
		if (index != -1)
		{
			DirectoryEntry removed = theDirectory.get(index);
			theDirectory.remove(index);
			return removed;
		}
		else
		{
				return null;
		}	

	}
	
	public void displayAllEntries()
	{
		System.out.printf("%-15s%-15s\n", "Name", "Number");
		for (int i =0; i<theDirectory.size(); i++)
		{
			System.out.printf("%-15s%-15s\n", theDirectory.get(i).getName(), theDirectory.get(i).getNumber());			
		}	
	}
	
	public void saveToFile(PrintWriter p)
	{
		for (int i=0; i<theDirectory.size(); i++)
			{
				p.println(theDirectory.get(i).getName() +","+ theDirectory.get(i).getNumber());
			}	
			p.close();
	}				

}
