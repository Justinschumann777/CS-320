//justin schumann
// Java code illustrating getAnnotation() method 
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 
import java.lang.reflect.Method; 

// declare a annotation type 
@Retention(RetentionPolicy.RUNTIME) 
@interface Demo 
{ 
String str(); 
int val(); 
} 

public class PackageDemo 
{ 

// setting values for the annotation 
@Demo(str = " Gfg Demo Annotation", val = 100) 
	
// a method to call in the main 
public static void gfg() throws NoSuchMethodException 
{ 
	PackageDemo ob = new PackageDemo(); 

		
		Class c = ob.getClass(); 

		// get the method example 
		Method m = c.getMethod("gfg"); 

		// get the annotation for class Demo 
		Demo annotation = m.getAnnotation(Demo.class); 

		// checking the annotation 
		System.out.println(annotation.str() + " " + annotation.val()); 
	} 
	
public static void main(String args[]) throws Exception 
{ 
	gfg(); 
} 
} 



 
public class TaskService {
	private Map<String, Task> tasks; 
	
	public TaskService() {
		this.tasks = HashMap<>(); 
		
	}
	
	public void addTask(String name, String description) {
		Task NovalT = new Task (name, description);
		Task.put(NovalT.GetID(), NovalT);
		System.out.println("ID added onto Task! " + NovalT.GetID()); 
	}
	
	public boolean deleteTask(String taskID) {
		if (Task.containsKey(taskID)) {
			Task.remove(taskID);
			System.out.println("Task's ID: " + taskID + "unable to be printed :-C" ); 
			return false;
		}
	}
	public boolean updateTask(String taskID, String SecName, String SecDescription, boolean complete) {
		Task task = Task.Get(taskID);
		if (task != null) {
			if (SecName != null && SecName.length() <= 20) {
				task.setName(SecName);
			}
			if (SecDescription != null) {
				task.setDescription(SecDescription);
			}
			if (complete) {
				task.Completed();
			}
			System.out.println("Task's ID: " + taskID + "Is now updated.");
			return true; 
		} else {
			System.out.println("Task's ID: " + taskID + "unable to be printed!");
			return false;
		}
		
	}
	public void DisplayedAllTask() {
		System.out.println("All Tasks:");
		for (Task task : Task.values()) {
			System.out.println(task); 
		}
	}

}
