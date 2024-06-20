package dice;

import java.util.Scanner;
/*Rani and Rajesh are playing with dice. In one turn, both of them roll their dice at once.
 *  They consider a turn to be good if the sum of the numbers on their dice is greater than 6. Given that in a particular turn 
 * Rani and Rajesh got X and 𝑌 on their respective dice, find whether the turn was good.*?
 */

public class Good {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter that value of Rani's Turn:");
		int x = scan.nextInt();
		System.out.println("enter that value of Rajesh's Turn:");
		int y = scan.nextInt();
		int sum=x+y;
		if(sum>6)
		{
			System.out.println("Turn is good");
		}
		else
		{
			System.out.println("Turn is not good");
		}
		scan.close();
}
}
