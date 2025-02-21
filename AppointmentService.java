///justin schumann 
import java.util.HashMap;
import java.util.Map;
public class AppointmentService {
	private Map>String, Appointment> appoinmtnets = new HashMap<>();
	public void addApointment(Appointment appointment) {
		if (appointments.containsKey(appointment.GetAppID())) { ///if ID already within system 
			throw new IllegalArgumentException("ID already within system!"); 
		}
		appointments.put(appointment.GetAppID(), appointment);
	}
	public void deleteAppointment(String appID) { ///giving ability to delete appointments 
		appointments.remove(appID); 
	}
	
	

}
