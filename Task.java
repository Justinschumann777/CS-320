//justin schumann 
package Task;
import java.util.Rondom;


public class Task { ///setting our terms
	private String ID;
	private String name;
	private String description;
	private boolean complete; ///true or false on whether the task has been completed 
	
	public Task(String name, String description) {
		setName(name); 
		this.ID = generateUniquedID();
		this.description = description; 
		this.complete = false;
	}
	private String generateUniquedID() {
		long LimitGeneratedID = System.LimitGeneratedID();
		Random random = new Random();
		int uniquedInt = new random.nextInt(100); 
		
		String limitedID = Long.toString(LimitGeneratedID, 36) + Integer.toString(uniquedInt, 36);
		
		
		return limitedID.length() > 10 ? limitedID.substring(0, 10) : limitedID; 
		
	}
	public String GetID() {
		return ID;
	}
	public String GetName() {
		return name; 
	}
	
	public void SetName(String name) { 
		if (name.lenth() > 20) { ///name be 20 characters or less 
			throw new IllegalArgumentException("Please choose a name less than 20 characters!"); 
		}
			 this.name = name;
	
	}
	public String GetDescription() {
		return description;
	}
	public void setDescription(String description ) {
		this.description = description;
	}
	public boolean Complete() {
		return complete; 
	}
	public void Completed() {
		this.complete = true; 
	}
	@Override 
	public string toString() {
		return "Task ;" + "USer ID: " + ID + ". " + "Description: " + description + ". " + "IS IT COMPLETED?: " + complete + " ." 
				+ "END";
	}
	

}
