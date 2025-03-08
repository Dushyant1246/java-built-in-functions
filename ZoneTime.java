import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ZoneTime {
	
	// Method to find time using proper format
	public static String getTimeZone (String id) {
        // Define formatter for readable output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of(id));
        return gmtTime.format(formatter);
	}
	
    public static void main(String[] args) {
        // Get time in GMT, IST and PST and display
		System.out.println("Current GMT Time: " + getTimeZone("GMT"));
        System.out.println("Current IST Time: " + getTimeZone("Asia/Kolkata"));
        System.out.println("Current PST Time: " + getTimeZone("America/Los_Angeles"));
    }
}

/*
Current GMT Time: 2025-03-08 04:26:07 GMT
Current IST Time: 2025-03-08 09:56:07 IST
Current PST Time: 2025-03-07 20:26:07 GMT-08:00
*/