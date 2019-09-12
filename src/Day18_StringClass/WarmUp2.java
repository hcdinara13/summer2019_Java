package Day18_StringClass;
import java.util.Scanner;
public class WarmUp2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		scan.nextLine();
		firstName = firstName.substring(0,1).toUpperCase()
				+ firstName.substring(1).toLowerCase();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		// mUhtAr			
		lastName = lastName.substring(0,1).toUpperCase()
					+ lastName.substring(1).toLowerCase();
		
		String FullName = firstName +" "+lastName;
		System.out.println(FullName);

		//""+lastName.charAt(0).toUpperCase();
		/*
		 *charAt()
firstName = ("" + (firstName=firstName.toLowerCase()).charAt(0)).toUpperCase() + (firstName.substring(1,firstName.length()));
lastName =  ("" + (lastName=lastName.toLowerCase()).charAt(0)).toUpperCase() + (lastName.substring(1,lastName.length()));;
		 */
	}
}
