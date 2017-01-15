

import java.util.Calendar;

public interface JulianDate {
	Calendar currentDate = Calendar.getInstance();

	// conversion from greg to julian
	public default int convertToJulianDate(int day, int month, int year) {
		int julianDate = 0;
		int a = (14 - month) / 12;
		int y = year + 4800 - a;
		int m = month + 12 * a - 3;

		int comparer = (year * 1000) + (month * 100) + day;

		if (comparer <= 1583004) {
			julianDate = day + ((153 * m + 2) / 5) + 365 * y + (y / 4) - 32083;

		} else if (comparer >= 1583015) {
			julianDate = day + ((153 * m + 2) / 5) + 365 * y + (y / 4) - (y / 100) + (y / 400) - 32045;
		}

		return julianDate;

	}

	// Julian date from 1. January -4712 until current date
	public default int currentJulianDate() {
		int year = currentDate.get(Calendar.YEAR);
		int month = currentDate.get(Calendar.MONTH) + 1;
		int day = currentDate.get(Calendar.DAY_OF_MONTH);

		int julianDate = convertToJulianDate(day, month, year);

		return julianDate;

	}

	// Days between a specific and the current date
	public default int daysBetween(int day, int month, int year) {

		int julianDateSpecific = convertToJulianDate(day, month, year);
		int julianDateCurrent = currentJulianDate();

		return julianDateCurrent - julianDateSpecific;

	}

}
