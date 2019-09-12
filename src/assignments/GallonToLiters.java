package assignments;

public class GallonToLiters {

	public static void main(String[] args) {
	
	// write java program to convert gallon into litlers
	// 1 gallon = 3.785 liters
	
	int gallon = 100;
	double litres = gallon * 3.785; //converts gallon to litres
	
	System.out.println(gallon+"gallon equal to "+litres+" Liters");

	
	// white java program which converts liters into gallons
	
	double L = 1;
	double G = L / 3.785; //converts gallon to litres
	
	System.out.println(L+" liters equal to " +G +" gallons");
	
	
	//task 1:
	
	int x =2;
	int y=x++; // y= 2; x=3
	System.out.println(y+" "+x);
	
	int x2=2;
	System.out.println( x2++); //2
	System.out.println( x2); //3
	
	int x3=2;
	System.out.println( --x3); //2-1=1
	
	int x4=8;
	int y4=x4--; //8
	System.out.println( x4--); //8
	System.out.println( x4); //7
	
	
	
	
	}
	
}
 