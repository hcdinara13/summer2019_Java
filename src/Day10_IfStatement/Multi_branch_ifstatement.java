package Day10_IfStatement;

public class Multi_branch_ifstatement {

	   /*
    if-else if-else:
           if(condition1){
               // A ==> if condition1 is true
           }
           else if( condition2 ) {
               //B   ==> if condition1 is false and condition2 is true
           }
           else {
               //C  ==> if condition1 and condition2 are both false
           }
    
    */
   
   public static void main(String[] args) {
       
       if(false) {
           System.out.println("if block");
       }
       else if(false) {
           System.out.println("else if block");
       }
       else {
           System.out.println("else block");
       }
       
       // task1:
       /*
        
       90<= GRADE ==> A
       80<= GRADE <90 ==> B
       70<= GRADE <80 ==> C
       60<= GRADE <70 ==> D
       else ==> F
    	*/	   
       int grade=85;
       if(grade>=90 ) {
           System.out.println("you made A");
       }
       else if(grade<90 && grade >= 80) {
           System.out.println("you made B");
       }
       else if(grade<80 && grade >= 70) {
           System.out.println("you made C");
       }
       else if(grade<70 && grade >= 60) {
           System.out.println("you made D");
       }
       else {
           System.out.println("you made F, study more");
       }
       
       
       //task status codes
       
       int StatusCode = 200;
       
       if ( StatusCode == 200 ) { System.out.println (" OK "); }
       else if ( StatusCode == 201 ) { System.out.println (" Created "); }
       else if ( StatusCode == 202 ) { System.out.println (" Accepted "); }
       else if ( StatusCode == 301 ) { System.out.println (" Moved Permanently "); }
       else if ( StatusCode == 303 ) { System.out.println (" See Other "); }
       else if ( StatusCode == 304 ) { System.out.println (" Not Modified "); }
       else if ( StatusCode == 307 ) { System.out.println (" Temporary Redirect "); }
       else if ( StatusCode == 400 ) { System.out.println (" Bad Request "); }
       else if ( StatusCode == 401 ) { System.out.println (" Unauthorized "); }
       else if ( StatusCode == 403 ) { System.out.println (" Forbidden "); }
       else if ( StatusCode == 404 ) { System.out.println (" Not Found "); }
       else if ( StatusCode == 410 ) { System.out.println (" Gone "); }
       else if ( StatusCode == 500 ) { System.out.println (" Internal Server Error "); }
       else if ( StatusCode == 503 ) { System.out.println (" Service unavailable "); }
       else { System.out.println("We dont know this number yet :disappointed: " );}
       
       
       //TASK 02:
       /*
        write a program that:
        1. 0~12 ==> good morning
        2. 12-15 ==> good afternoon
        3. 15~23 ==> good night
        4. 12 == good noon
        
        */
       int hour = 8;
       if(hour >= 0 && hour < 12 ) {
           System.out.println("Good morning!");
       }
       else if(hour > 12 && hour <= 15) {
           System.out.println("Good afternoon!");
       }
       else if(hour > 15 && hour <= 23) {
           System.out.println("Good night");
       }
       else {
           System.out.println("noon");
       }
       
       /*
        * int n1=2; int n2=2; int n3=2; (This is the all equal part. An extra
        * possibility which is done also.
        */
       int n1 = 42;
       int n2 = 22;
       int n3 = 12;
       String output = "";
       if (n1 > n2 && n1 > n3) {
           output = "n1 is bigger";
       }
       if (n2 > n1 && n2 > n3) {
           output = "n2 is bigger";
       }
       if (n3 > n2 && n3 > n1) {
           output = "n3 is bigger";
       }
       if (n1 == n2 && n2 == n3) {
           output = "n1, n2, n3... They are all same";
       }
       System.out.println(output);
       
//task find more possibility and bug 
       
       int num1 =30, num2=300, num3 =200;
       
       if( num1 > num2 && num1 > num3) {
           System.out.println(num1+" is the bigger number");
       }
       
       else if( num2 > num1 && num2 > num3){
           System.out.println(num2+" is bigger number");
       }
       
       else if(num3 > num2 && num3 >num1) {
           System.out.println(num3+" is the bigger number");
       }
       
       else if (num3 == num2 && num3 > num1) {
           System.out.println(num3+" and "+num2+" are the bigger number");
       }
   
       else if(num3==num1 && num3 > num2) {
           System.out.println(num3+" and "+num1+" are the bigger number");
       }
       else if(num2 == num1 && num2 > num3) {
           System.out.println(num2+" and "+num1+" are the bigger number");
       }
       else {
           System.out.println("all of them are equal");
       }


   }
}
