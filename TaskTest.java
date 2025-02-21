//Justin Schumann
import Task.Task;

public class TaskTest {
	private Task task;
	@BeforeEath
	void SetTask() {
	task = new Task("Standard Task", "This is a description of a task");
	
	}
	@Test ///test set up 
	void StartTest() {
		assertNotNull(task.GetID());
		assertEguals("Standard Task", task.GetName());
		assertEquals("This is a description of a task", task.setDescription());
		assertFalse(task.Complete())
	}
	@Test 
	viod NameTest() {
		task.SetName("Task name uodate");
		assertEquals("Task name update", task.GetName());
		String TooLong = "Name is too long";
		Exception excerption = assertThrows(IllegalArgumentException.class, -> {
			task.SetName(TooLong);
		});
		assertEquals("Name must be 20 characters or less", exception.getMessage());
				
	}
	@Test 
	void DescriptionSetUp() {
		task.setDescription("Update description");
		assertEquals("Update description", task.GetDescription());
	}
	@Test 
	void MarkAsCompleted() {
		task.Completed();
		assertTrue(task.Complete());
		
	}
	

}
