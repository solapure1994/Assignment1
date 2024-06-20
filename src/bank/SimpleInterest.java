package bank;

import java.util.Scanner;
/*John, a customer at XYZ Bank, wants to calculate the simple interest for a loan he took. 
 * Given the principal amount (P), the rate of interest (𝑅), and the time period in years (𝑇), 
 * write a Java program to help John calculate the simple interest.*/
public class SimpleInterest {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double x=scan.nextDouble();
		System.out.println("Enter Interest rate in percentage: ");
		int y=scan.nextInt();
		System.out.println("enter time period: ");
		int z=scan.nextInt();
		double SI;
		SI=(x*y*z)/100;
		System.out.println("Simple Interest= "+SI);
		scan.close();
	}
}
