package Day03_Variables;

public class EscapeSequences {
	/*
	 \n (or \r): starts from new line
	 \t: horizontal tab
	 \\ backslash - 1 slash is not recognized, so for slash you need to your double slash
	 \' prints single quote
	 \" prints double quote
	 *
	
	 */

	public static void main(String[] args) {
		System.out.println("Hello Cybertek\n Batch 12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\n");
		System.out.print("False\n\n\n\n\n\n");
		
		System.out.println("\tClass starts from tomorrow");
		
		System.out.println("\\dinara");
		
		System.out.println("'Java");
		System.out.println("Book is called \"Game of thrones\" ");
	
		
	
	}
	
	
}
