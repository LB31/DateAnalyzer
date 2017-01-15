public class MetricDate implements JulianDate {

	public MetricDate() {

	}

	public String julianToMetric() {
		int julianDate = (int) currentJulianDate();
		int year = julianDate / 1000;
		int month = (julianDate % 1000) / 100;
		int day = (julianDate % 1000) % 100;

		String theDate = "Metric date: " + day + "." + month + "." + year;

		return theDate;

	}

	public String julianToMetric(int ownJulian) {
		int julianDate = ownJulian;
		int year = julianDate / 1000;
		int month = (julianDate % 1000) / 100;
		int day = (julianDate % 1000) % 100;

		String theDate = "Metric date: " + day + "." + month + "." + year;

		return theDate;

	}
	
	
	public String julianToMetric(int yourDay, int yourMonth, int yourYear) {
		int julianDate = convertToJulianDate(yourDay, yourMonth, yourYear);
		int year = julianDate / 1000;
		int month = (julianDate % 1000) / 100;
		int day = (julianDate % 1000) % 100;

		String theDate = "Metric date: " + day + "." + month + "." + year;

		return theDate;

	}
	
	

	public int metricToJulian(int day, int month, int year) {

		int julianDate = (year * 1000) + (month * 100) + day;

		return julianDate;

	}
	
	public static void main(String[] args) {
		MetricDate instance1 = new MetricDate();
		String julianToMetric = instance1.julianToMetric((int) instance1.daysBetween(1, 1, 1995));
		
		int metricToJulian = instance1.metricToJulian(24, 5, 2457);
		int bla = instance1.convertToJulianDate(1,1,1993);
		System.out.println(julianToMetric);
		System.out.println(metricToJulian);
		System.out.println(bla);
		

	}

}
