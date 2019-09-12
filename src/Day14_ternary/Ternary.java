package Day14_ternary;

public class Ternary {


    /*
     in Ternary:
         if(condition)       ==> (Condition)?
         else                ==>    :
         else if(Condition)  ==> :(Condition)?
         variable x = (expression) ? value if true : value if false
     */
    
    public static void main(String[] args) {
        int num = 0;
        
        if(false) {
            num = 100;
        }else {
            num = 50;
        }
            
    int n = (false)? 100 : 50 ;   // ternary returns a Value
    
    int y = false ? 100 : 50;  
                System.out.println(50 );
    
    System.out.println(num);  // 50
    System.out.println(n);  // 50
    System.out.println(y);
    
    
        String Schoolname ="";
        boolean Batch12 = true; 
        if(Batch12) {
            Schoolname ="Cybertek";
        } else {
            Schoolname ="Invalid";
        }
        
    System.out.println( Batch12 ? "Cybertek" : "Invalid" );
        
    String BestSchool = Batch12 ? "Cybertek" : "Invalid"; 
    
    System.out.println(BestSchool);
    
        
            double d = 10;
            if(true) {
                d= 10.5;
            }
    
        double z = true ? 10.5 : 0;
        // in ternary, total number of ? and :  has to be equal
    
    
        double interestRate = 0;
        boolean GoodCredit = true;
    
        interestRate = GoodCredit == true ? 0.5 : 0.9 ;
        System.out.println(interestRate);
        
      byte grade=60;
        
        boolean Passed =  grade >= 60 ? true : false ;
        
        System.out.println(Passed);
        
        
        char FinalGrade ='C';
        String Group="";
        
        
Group= FinalGrade == 'A' ? "Early bird" :FinalGrade =='B'? 
        "Group 1" : "After Group 1" ;   
/*
        if(FinalGrade == 'A') {
            Group="Early bird";           
        }else if(FinalGrade =='B') {
            Group ="Group 1"; 
        } else if(FinalGrade == 'C') {
            Group = "Group 2";
        } else {
            Group ="After Group 2";
        }
        
        */
    Group = (FinalGrade == 'A') ? "Early Birds" 
                : (FinalGrade == 'B') ? "Group 1"
                    : (FinalGrade == 'C')? "Group 2"
                        : "After Group 2";
        
    System.out.println(Group);
    
    
        int score=80;
        char Finals=' ';
        
        if(score>=90 && score <=100)
        		Finals = 'A';
        else if(score >=80 && score <=89)
        		Finals = 'B';
        else if(score >=70 && score <=79)
    		Finals = 'C';
        else if(score >=60 && score <=69)
    		Finals = 'D';
        else if(score >=0 && score <=59)
    		Finals = 'F';
        else
        	Finals = ' ';
        
        
        int score2 = 85;
    	char finals= ' ';
    	
    	finals= ( score2 >= 90 && score2<=100)? 'A'
    				:(score2 >= 80 && score2<=89)? 'B'
    					:(score2 >= 70 && score2<=79)? 'C'
    						:(score2 >= 60 && score2<=69)? 'D'
    							:(score2 >= 0 && score2<=59)? 'F'
    								:'?'; // or ' '  ==empty space	
        
    	 System.out.println(finals);
    	 
    	 int n1=100, n2=600, n3=400;
    	 
    	 int max = (n1 > n2 && n1 > n3)? n1
    			 :(n2 > n1 && n2 > n3)? n2
    					 :n3;
    	 System.out.println(max);
    
    	
    }

}

