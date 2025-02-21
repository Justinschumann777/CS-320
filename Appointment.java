///justin schumann 
import java.util.Date;
public class Appointment {
	private final String appID;
	private Date appDate;
	private String description;
	
	private Appointment(String appID, Date appDate, String description) {
		///if varibles = null 
		if(appID == null || appID.length() > 10 ) {
			throw new IllegalArgumentException("appointment ID not valid!");
			
		}
		if(appDate == null || appDate.before(new Date())) {
			throw new IllegalArgumentException("appointment Date not valid!"); 
		}
		
		if(description == null || description.length() > 50 ) {
				throw new IllegalArgumentException("appointment description not valid!");
				
		}
		public String GetAppID() { ////getters and setters 
			return appID;
		}
		public void SetAppID() {
			this.appDate = appDate;
		}
		public Date GetAppDate() {
			return appDate;
		}
		public void SetAppDate() {
			this.appDate = appDate;
		}
		public String GetDescription() {
			return description;
		}
		public void SetDescription() {
			this.description = description;
		}
		
	}

}
