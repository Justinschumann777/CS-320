
//justin schumann 
public class TaskServiceTest {
	private TaskService taskService;
	@Before 
	void SetUp() {
		taskService = new TaskService();
		
		
	}
	@Test ///voids to add tests 
	void TestAdded() {
		taskService.addTask("Test 1", "Description 1");
		assertEquals(1, taskService.tasks.size());
	}
	@Test 
	void DeleteTest() {
		taskService.addTask("Test 2", "Destscription 2");
		String TaskID = taskService.tasks.keySet().iterator().next():
			
		assertTrue(taskService.deleteTask(TaskID));
		assertEquals(0, taskService.tasks.size());
		assertFalse(taskService.deleteTask("nonexistentID"));
		    
	}
	@Test 
	void UpdateTest() {
		taskService.addTask("Test 3", "Description 3");
		String TaskID = taskService.tasks.keySet().iterator().next();
		assertTrue(taskService.UpdateTask(TaskID, "Update task", "Update description", true)); ///if test has been updated 
		Task updateTask = taskService.tasks.get(TaskID);
		assertEquals("Update task", updatedTask.GetName());
		assertEquals("Update description", updatedTask.GetDescription());
		assertFalse(taskService.updateTask("nonexistentID", "Test", "Test", false));///if not 
		    
		    
			
	}

}
