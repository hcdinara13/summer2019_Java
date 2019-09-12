package assignments;
import java.util.Scanner;

public class repltit_BiggesNum_Scan {

	public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println(" ");
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
    String LNum = " ";
    LNum =  (n1>n2 && n1>n3) ? "n1 is bigger"
              : (n2>n1 && n2>n3) ? "n2 is bigger"
                      : "n3 is bigger";
                    	
                      
                      System.out.println(LNum);
                    		  
	}
}
