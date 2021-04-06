import java.util.*;
public class PhoneDirectory{
	private PhoneDirectory(){
	 	List<DirectoryEntry> theDirectory = new ArrayList<>();
	}
	public String addOrChangeEntry(String name, String number){
		int index = theDirectory.indexOf(new DirectoryEntry(name, ""));
		if(index != -1){
			String oldNumber = theDirectory.get(index).number;
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
		if(index != -1){
			return theDirectory.get(index);
		}
		else{
			return null;
		}
	}

}
