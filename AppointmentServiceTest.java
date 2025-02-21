//justin schumann
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import AppointmentClass.AppointmentService;
import org.junit.jupiter.api.DisplayName;

public class AppointmentServiceTest {
	@AfterEach 
	void Down() throws exception {
		AppointmentService.appointment.clear();
		@DispalyName("Appointment to add")
		@test 
		void IDAddTest() { ///add, null, and deletion tests 
			String ID = "0";
			String description = "Description is good!";
			Calender c = Calender.getInstance();
			
			c.set(Calender.MONTH, 1);
			c.set(Calender.DATE, 02);
			c.set(Calender.YEAR, 2025);
			
			Date = rightDate = c.getTime();
			
			AppointmentService TA = new AppointmentService();
			assertEquals(0, AppointmentService.appointment.size());
			TA.addApointment(rightDate, description);
			
			
		});
		assertEquals("Description not valid", exception.getMessage()); 
	}
	@DisplayName("Appointment with null description")
	@Test 
	void NullDesTest() {
		String ID = "0";
		String description = null;
		Calender c = Calender.getInstance();
		c.set(Calender.MONTH, 1);
		c.set(Calender.DATE, 02);
		c.set(Calender.YEAR, 2025);
		
		Date rightDate = c.getTime();
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      		AppointmentService TA = new AppointmentService();
      		TA.addAppointment(rightDate, description);
        });
      	
      	assertEquals("Description not valid", exception.getMessage());
	}
	@DisplayName("deletion test")
	@Test
	void deletionTest() {
		String ID = "0";
		String description = "This description is good";
		Calender c = Calender.getInstance();
		c.set(Calender.MONTH, 1);
		c.set(Calender.DATE, 02);
		c.set(Calender.YEAR, 2025);
		Date rightDate = c.getTime();
		AppointmentService TA = new AppointmentService();
		assertEquals(3, AppointmentService.appointment.size());
		TA.deleteAppointment("1");
		
		assertEquals(2,AppointmentService.appointment.size());
        assertFalse(AppointmentService.appointment.containsKey("1"));
		
		TA.deleteAppointment("1");
		assertEquals(2, AppointmentService.appointment.size());
		
		
		
	}
	

}
