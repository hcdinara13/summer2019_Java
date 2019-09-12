package assignments;

public class time {

	public static void main(String[] args) {
		
		int hour=24;
		int minute=45;
		int second=02;
		String amOrPm="";
		
		if(hour >= 0 && hour <= 24 ) {
			if(hour >= 0 && hour < 12 ) {
				amOrPm="AM";
	           System.out.println(hour+":"+minute+":"+second+amOrPm);
	       }
		else if(hour > 12 && hour <= 24 ) {
			 amOrPm="PM";  
			System.out.println(hour+":"+minute+":"+second+amOrPm);
	          
	       }
		else {
			System.out.println("time not recognized");
		}
			
	}
	
	}
}
