package Day15_Scanner;

public class StringClass {

	    
	    public static void main(String[] args) {
	        
	        String str ="Cybertek";
	        String A = "Cybertek";
	        String B = "Cybertek";
	        System.out.println( A == B );
	            // both String literals are stored at String pool
	        
	        
	        String str2 = new String("Cybertek");
	        
	        System.out.println( str == str2 );  
	                // different memory locations
	        
	        String str3 = new String("Cybertek");
	        System.out.println(str2 == str3); 
	        
	        
	        String s1 = "cat";
	        String s2 = "cat";
	        System.out.println(s1==s2); // same memory locations in String pool
	        
	        String s3 = new String("cat");
	        String s4 = new String("cat");
	        System.out.println(s3 == s4); // different memory locations in java heap
	        
	        System.out.println(s1 == s4); // different memory
	        
	        
	        String a = "Batch12";
	        String b = "batch12";
	        System.out.println(a == b);  // false, case sensitivity
	        
	        String c = new String("cybertek");
	        String d = new String("Cybertek");
	        System.out.println(c == d);
	        
	        /*
	         
	         09/05/2019
Topic: 
            1. Scanner class
            2. String class & String manipulations
Scanner class: used for reading user inputs
        
            Scanner class is presented in "java.util" package
            in order to use scanner, we MUST import it from its package:
                                    import java.util.Scanner;
                 // imports scanner class only from the java.util' package 
            the import statement MUSt be placed between class and pckage:
                            package A;
                                import java.util.Scanner;
                            publi class B{  }
            wild import: 
                            import java.util.*;
            // imports all the classes within "java.util" package
            Decleration of scanner class:
                        Scanner variableName = new Scanner(System.in)
                        variableName: can reference an object of scanner class
                        new Scanner(System.in): creates an object from the scanner class
            Scanner methods:
                        variableName.nextByte():
                                        returns the user input as byte value
                        variableName.nextShort():
                                    returns the user input as short value
                        variableName.nextInt():
                                    returns the user input as int value
                        variableName.nextLong():
                                    returns the user input as long value
                        variableName.nextBoolean():
                                    returns the user input as boolean value
                        variableName.nextFloat():
                                    return the user input as float value        
                        variableName.nextDouble():
                                    return the user input as double value
                        variableName.nextLine():
                                    returns the ENTIRE user input as String value
                        variableName.next():
                                    returns the first word of the user input as String value
String class:
        
        1. String is an object
                    there are two ways to create object from String class:
                                1. String literals:
                                                String str = "Cybertek";
                                2. by using "new" keyword:
                                    String str = new String("Cybertek")
                    when the String object is created by String literals, that object will be saved at String pool (String pool does not take duplicates)
                    when the String object is created by using "new" keyword. the object will be saved at java heap memory (not within the String pool)
                    heap memory : the place where all the objects are store at
                    String pool : located in heap memory, stores all string literals' objects 
                    everytime when we use new keyword, compiler will create a new object in java Heap memory
break till :  3:21 pm

	         
	         
	         
	         */
	        
	    }
	}

