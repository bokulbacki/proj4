//The DirectoryEntry class is used to create all of the directory objects used
//in the phonebook directory. Each entry contains a name and a number. There
//are a few various methods defined as well for getters and setters. We also
//overidded the equals method. 
//Bo Kulbacki - rkulbacki@sandiego.edu
//Dalton Kohl - dkohl@sandiego.edu
//
//Last modified: 4-12-21

public class DirectoryEntry{
	private String name;
	private String number;
	
	public DirectoryEntry(String name, String number){
	this.name  = name;
	this.number = number;
	}

	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}

	public void setNumber(String num)
	{
		number = num;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public boolean equals(Object d)
	{
		if(this.name.equalsIgnoreCase(((DirectoryEntry)d).getName()))
		{
			return true;
		}	
		else
		{
			return false;
		}	
	}			
}


