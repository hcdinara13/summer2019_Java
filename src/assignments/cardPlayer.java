package assignments;
import java.util.Scanner;
public class cardPlayer {

	/*
	 in blackjack after the player asks to keep the house 4 things may happen.

	1) if the card total is bigger then 21 the player busts.
	2)if the house score is bigger then the player, the player loses .
	3)if the player score is equal to the house then they are a draw.
	4)if the player score is bigger then the house the player wins.

	player and house scores are represented by  player and house int variables.
	check them using ifs to determine the result.
	
	for example:

player  = 21
 house = 8

output: bust


player  = 7
 house = 10

output: player loss

player  = 4
 house = 4

output: its a tie

player  = 12
 house = 7

output: player wins
	 */
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		 	System.out.println("enter house digit;");
		 	System.out.println("enter player digit;");
		    int house = s.nextInt();
		    int player = s.nextInt();
		    int total = 21;
		    
		    if(total <= player || total <= house) {
		    	System.out.println("bust");
		    }else if (house > player && house < total && player < total) {
		    	System.out.println("player loss");
		    }else if (house == player && house < total && player < total) {
		    	System.out.println("its a tie");
		    }else if (house < player && house < total && player < total) {
		    	System.out.println("player wins");
		    }
		   
}
}
