	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
		
public class class1 {

	
	
	/* Name: Bailey Patt
	 * Date: March 21, 2022
	 * Description: Java Math, Date, and Calender Class
	 */
	
		
		public static void main(String[] args) {

			LocalDate obj1= LocalDate.now();
			System.out.println("Todays Date YYYY-MM-DD: " + obj1);
			
			LocalDate date = LocalDate.of(2022, 12, 17);
			
			LocalDateTime current = LocalDateTime.now(); //Reads from the operating system
			System.out.println(current);
			
			//Time elasped - last seen 53 minutes, last updates 10 days ago
			
			LocalTime sooner = LocalTime.of(17, 00);
			LocalTime later = LocalTime.of(19, 00);
			Duration duration = Duration.between(sooner, later);
			System.out.println(duration.toHours());
			
			String date_s = "2011-01-18 00:00:00.0";
			SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
			//System.out.println(df.format(date_s));
		
	}

}
