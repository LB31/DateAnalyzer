
public class JulianDate2 {
 
	private int[] date;
	private int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
	private static int BCasJulianDate = 1721424; //JD at 00.00.0000BC 
	
	public JulianDate2() {
		date = new int[]{};
	}


	public static void main(String[] args){
		JulianDate2 julianDate = new JulianDate2();
		
		julianDate.setDate(new int[]{14,5,2016});
		
//		//run cofigurations
//		String[] values = args[0].split("[.]");
//		julianDate.setDate(new int[] { 
//				new Integer(values[0]).intValue(), 
//				new Integer(values[1]).intValue(), 
//				new Integer(values[2]).intValue() } );
//		
		julianDate.analyseDate();

	}

	

	private void analyseDate() {
		int result = BCasJulianDate;
		result += date[0]; //days added today 13
		for(int i=0; i < date[1]-1; i++){  //add days of each applicable month before given date from array
			result += months[i];
		}
		for(int i=0; i<date[2]-1; i++){   //add days of each year up to given year
			result += 365;
			//sonderfaelle abziehen
			if (i % 4==0){
				result += 1;
			}
			if (i % 100==0){
				result -= 1;
			}
			if (i % 400==0){
				result += 1;
			}
		}	
		
		System.out.println(BCasJulianDate);
		System.out.println(result);
	}


	public int[] getDate() {
		return date;
	}

	public void setDate(int[] date) {
		this.date = date;
	}}