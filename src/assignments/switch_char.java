package assignments;
import java.util.Scanner;
public class switch_char {
	
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter command:");
	    char response = scan.next().charAt(0);
	    //WRITE YOUR CODE HERE 
	    switch(response){
	      case 'y': System.out.println("Your request is being processed"); break;
	      case 'n': System.out.println("Thank you anyway for your consideration"); break;
	      case 'h': System.out.println("Invalid entry, please ty again!"); break;
	    }
			
	  }
	}