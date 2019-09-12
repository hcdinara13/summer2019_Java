package Day18_StringClass;
import java.util.Scanner;

public class WarmUp {

	   public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("enter your first name and last name :");
	        
	        String firstName = input.next();
	        String lastName = input.next();
	        String result1 = "" + firstName.charAt(0) + lastName.charAt(0);
	        System.out.println(result1);
	        
	        String result2 = firstName.substring(0, 1).toUpperCase().concat(" ") 
	                        + lastName.substring(0, 1).toUpperCase();
	        System.out.println(result2);
	    }
}
