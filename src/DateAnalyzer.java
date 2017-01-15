import java.util.Calendar;

public class DateAnalyzer implements JulianDate {
	Calendar currentDate = Calendar.getInstance();
	Calendar givenDate = Calendar.getInstance();

	public DateAnalyzer() {

	}

	public String getWeekday(int julianDate) {

		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		int dayIndex = julianDate % 7;

		return weekdays[dayIndex];
	}

	public void checkBirthdate(int day, int month, int year) {

		int julianDate = convertToJulianDate(day, month, year);
		System.out.println("Your age in Julian date is " + julianDate + " days");

		// get weekday
		String weekday = getWeekday(julianDate);
		// System.out.println(weekday);
		// sunday child and weekday of birthday
		if (weekday.equals("Sunday")) {
			System.out.println("You're a Sunday Child!");
		} else
			System.out.println("You were born on: " + weekday);

		// birthday is today?
		if (currentJulianDate() == julianDate) {
			System.out.println("Congratiolations its your Birthday");
		}

		// if divisible by 100
		if (julianDate % 100 == 0) {
			System.out.println("Congratiolations you have lived a cleanly divisible by 100 amout of days");
		}
	}

	public void compareBirthdays(int day, int month, int year, int day2, int month2, int year2) {
		int date1 = convertToJulianDate(day, month, year);
		int date2 = convertToJulianDate(day2, month2, year2);

		if (date1 > date2) {
			System.out.println("Person 1 is " + (date1 - date2) + " days older");
		} else if (date1 == date2) {
			System.out.println("Cool, you share a birthday!");
		} else
			System.out.println("Person 2 in " + (date2 - date1) + " days older");
	}

	public static void main(String[] args) {

		DateAnalyzer analyzer = new DateAnalyzer();
		
		System.out.println(analyzer.getWeekday(2448989));

		analyzer.compareBirthdays(15, 1, 1993, 10, 1, 1993);

		analyzer.checkBirthdate(1, 1, 1993);

		
	}

}
