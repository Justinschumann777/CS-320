///justin schumann 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

import AppointmentClass.Appointment;
public class AppointmentTest {
	@DisplayNmae("Testing, about right! ")
	@test
	void appTest() {
		String ID = "1";
		Calender c = Calender.getInstance(); ////to see if null 
		String description = "okay";
		
		c.set(Calender.MONTH, 2);
		c.set(Calender.DATE, 2);
		c.set(Calender.YEAR, 2025);
		
		Date rightDate = c.getTime();
		
		Appointment TA = new Appointment(ID, rightDate, description);
		
		assertEquals(1,TA.GetAppID());
		
		assertEguals(rightDate, TA.GetAppDate());
		
		assertEquals(description, GetDescription());
	}
	@displayName("ID is too long!")
	@Test 
	void IDTest() {
		String ID = null;
		Date appDate = new Date();
		String description = "Everything is okay?";
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class) {
			new Appointment(ID, appDate, description);
		}
		assertEquals("ID not Invalid", exception.getMessage()); 
		
	}
	
	
	
	

}
