package assignments;
import java.util.Scanner;
public class timeScanner {

	public static void main(String[] args) {
		
// Version 1: Using Remainder operator
		
		/*Scanner time = new Scanner(System.in);

		System.out.println("Enter seconds:");
		int inputSeconds = time.nextInt();
		//5698
		
		int hour = inputSeconds / 60; //94.9666
		int minutes = hour % 60; //34
		int second = inputSeconds % 60; // 58
		hour = hour / 60;
		
	System.out.println(hour + " hours, " + minutes + " minutes, and " + second + " seconds");
	*/	
// Version 2: Using Arithmetic operators and Short Hand operator
		
		Scanner myTime=new Scanner(System.in);
		
		int second;
		int minute;
		int hour;
		System.out.println("Enter seconds : ");
	second=myTime.nextInt();
	
	minute=second/60;
	second=second-(minute*60);
	//second-=minute*60;in
	hour=minute/60;
	minute=minute-(hour*60);
	//minute-=hour*60;
	System.out.println("The time is: "+hour+" "+minute+" "+second);
	
	}
}
