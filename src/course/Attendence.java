package course;

import java.util.Scanner;
/* According to a recent survey, Java Programing is the most demanding course. Saniya wants to learn Java programing. Saniya required to attend the classes for 𝑋 weeks, and the cost of classes per week is Y coins. What is the total amount of money that Saniya will have to pay?
Input           Output
1  10             10
1  15             15
2  10             20
2    15             30

*/
public class Attendence {

	public static void main(String[]args)
	{
		int z;
		int x;
		int y;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of week that sania aatended class:");
		x=scan.nextInt();
		
		System.out.println("Enter cost of classes per week :");
		y=scan.nextInt();
		
		z= x*y;
		System.out.println("Ttal amount of money that saniya will have to pay:" + z);
		scan.close();
		
	}
}
