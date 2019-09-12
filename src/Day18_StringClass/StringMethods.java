package Day18_StringClass;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 indexOf(str): returns the index number of the first occured character
		 in the given String as an int value
		 */
		
		String A1="Batch 12 is a great batch";
		
		int num = A1.indexOf("g"); // "a", "eat", "at ", "atch"
		System.out.println(num);
		
		String B1="today is tuesday, today we have class in the afternoon";
		int n1= B1.indexOf("ternoon");
		System.out.println(n1);
		
		
		String Address= "7925 Jines Branch Dr, Mclearn, VA 22003";
		int begin = Address.indexOf(", ")+1+1;
		int end = Address.indexOf(", V");
		
		String cityName=Address.substring(begin, end );
		System.out.println(cityName);
		
		
		String email = "RandomEmails@gmail.com";
		int begin2 = email.indexOf("@");
		int end2 = email.indexOf(".com");
		
		String emailType = email.substring(begin2, end2 );
		System.out.println(emailType);
		
		/*
		 lastIndexOf(): returns the last occured character'
		 index number as and Int Value
		 */
		
		String str="ABCDABCD";
		int n2 = str.indexOf("B"); //1
		int n3 = str.lastIndexOf("B"); //5
		System.out.println(n2);
		System.out.println(n3);
		
		
		String myEmail = "Myemail.school@gmail.com";
		int Begin = myEmail.indexOf("@")+1;
		int End = myEmail.lastIndexOf(".");
		
		String myEmailType = myEmail.substring(Begin, End);
		System.out.println(myEmailType);
		
		
			}
}
