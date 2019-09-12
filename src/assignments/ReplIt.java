package assignments;

import java.util.*;

public class ReplIt {

	public static void main(String [] args) {
		// if statement grades task 
		/*
		 an automated test also needs a way to grade students.
		in this assignment you will get a grade int and using ifs output if its a passing grade or failure.
		if grade is bigger then 90 output "excellent" 
		if the grade is bigger then 70 and smaller then 90 output "good"
		if grade is bigger then 60 and smaller then 70 output "pass"
		if grade is smaller then 60 output "fail"
		hint: && is the operator for and in java.
		 
		 */
		Scanner s = new Scanner(System.in);
	    System.out.println("Please enter your score");
		 
	    int grade = s.nextInt();

	  	String score = " ";
			score= ( grade >= 90 && grade<=100)? "excellent"
					:(grade >= 70 && grade<=89)? "good"
						 :(grade >= 60 && grade<=69)? "pass"
								 :(grade<=60)? "fail"
									:" "; 	
	    
			System.out.println(score);
			 
		
	}
	
	
}
