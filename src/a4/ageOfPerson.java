package a4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ageOfPerson {

	public static void main(String[] args) throws ParseException {

		Calendar todayCalendar = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = dateFormat.parse("09/07/1994");
		
		Calendar dobCalendar = Calendar.getInstance();
		
		dobCalendar.setTime(dob);
		
		int age = todayCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
		int months = todayCalendar.get(Calendar.MONTH) - dobCalendar.get(Calendar.MONTH);
		int days = todayCalendar.get(Calendar.DAY_OF_MONTH) - dobCalendar.get(Calendar.DAY_OF_MONTH);
//		int hours = todayCalendar.get(Calendar.HOUR) - dobCalendar.get(Calendar.HOUR);
//		int minute = todayCalendar.get(Calendar.MINUTE) - dobCalendar.get(Calendar.MINUTE);

		
		System.out.println(age+" Years "+months+" months  "+days+" Days "); //+hours+ " Hours "+minute+ " Minutes "
		
	}

}
