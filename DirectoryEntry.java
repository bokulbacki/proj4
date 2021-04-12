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
}


