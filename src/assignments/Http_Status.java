package assignments;
import java.util.Scanner;
public class Http_Status {

	public static void main(String[] args) {
		
		/*
		  int StatusCode = 200;
		 
	       
	       if ( StatusCode == 200 ) { 
	    	   System.out.println (" OK "); }
	       else if ( StatusCode == 201 ) { 
	    	   System.out.println (" Created "); }
	       else if ( StatusCode == 202 ){  
	    	   System.out.println (" Accepted "); }
	       else if ( StatusCode == 301 ) { 
	    	   System.out.println (" Moved Permanently "); }
	       else if ( StatusCode == 303 ) { 
	    	   System.out.println (" See Other "); }
	       else if ( StatusCode == 304 ) { 
	    	   System.out.println (" Not Modified "); }
	       else if ( StatusCode == 307 ) { 
	    	   System.out.println (" Temporary Redirect "); }
	       else if ( StatusCode == 400 ) { 
	    	   System.out.println (" Bad Request "); }
	       else if ( StatusCode == 401 ) { 
	    	   System.out.println (" Unauthorized "); }
	       else if ( StatusCode == 403 ) { 
	    	   System.out.println (" Forbidden "); }
	       else if ( StatusCode == 404 ) { 
	    	   System.out.println (" Not Found "); }
	       else if ( StatusCode == 410 ) { 
	    	   System.out.println (" Gone "); }
	       else if ( StatusCode == 500 ) { 
	    	   System.out.println (" Internal Server Error "); }
	       else if ( StatusCode == 503 ) { 
	    	   System.out.println (" Service unavailable "); }
	       else { 
	    	   System.out.println("Incorrect code" );}
	    	   
	    	   */
		
		    //WRITE YOUR CODE HERE 
		    Scanner b = new Scanner(System.in);
		    System.out.println("Enter status code:");
		    int num2 = b.nextInt();
		    switch(num2){
		      case 200: System.out.println("OK"); break;
		      case 201: System.out.println("Created"); break;
		      case 202: System.out.println("Accepted"); break;
		      case 301: System.out.println("Moved Permanently"); break;
		      case 303: System.out.println("See Other"); break;
		      case 304: System.out.println("Not Modified"); break;
		      case 307: System.out.println("Temporary Redirect"); break;
		      case 400: System.out.println("Bad Request"); break;
		      case 401: System.out.println("Unauthorized"); break;
		      case 403: System.out.println("Forbidden"); break;
		      case 404: System.out.println("Not Found"); break;
		      case 410: System.out.println("Gone"); break;
		      case 500: System.out.println("Internal Server Error"); break;
		      case 503: System.out.println("Service Unavailable"); break;
		      default:  System.out.println("Invalid Status code!"); break;
		    }
		    
		    
		    
		  }
		}