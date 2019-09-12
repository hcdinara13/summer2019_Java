package assignments;
import java.util.Scanner;
public class ReplIt_charString {

	
	public static void main(String[] args) {
//		    Scanner s = new Scanner(System.in);
//		    System.out.println("Please enter your word");
//		    String txt = s.next();
//		    //your code here
//		    System.out.print(txt.charAt(4)+""+txt.charAt(5)+""+txt.charAt(6) );  
//		    
//		  Scanner scan= new Scanner(System.in);
//		  System.out.println("Enter word: ");
//		  String word=scan.nextLine();
//		  char first= word.charAt(0);
//		 char last= word.charAt(word.length()-1);
//		 System.out.print(first);
//		 System.out.print(last);
		
	/*	
		  Scanner s = new Scanner(System.in);
		    System.out.println("enter your name:");
		    String name = s.next();
		    System.out.println(name.length());
	*/
	 	  
		  Scanner r= new Scanner(System.in);
		    System.out.println("Enter number:");
		    int num=r.nextInt();

		    switch (num){
		      case 1: System.out.println("Monday"); break;
		      case 2: System.out.println("Tuesday"); break;
		      case 3: System.out.println("Wednesday"); break;
		      case 4: System.out.println("Thurday"); break;
		      case 5: System.out.println("Friday"); break;
		      case 6: System.out.println("Saturday"); break;
		      case 7: System.out.println("Sunday"); break;
		      default:System.out.println("Invalid");break;
	 
		    }
		    
		  }
	
		}

