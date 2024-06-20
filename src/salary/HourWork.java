package salary;

import java.util.Scanner;
/*Write a Java program that calculates the monthly salary for employees based on their hourly wage and number of hours worked. It should also account for overtime pay (1.5 times the hourly wage for hours worked beyond 40 hours per week).
Input
Hourly Wage: 15
Hours Worked: 45
Output
Monthly Salary: 725 (assuming 40 hours regular pay and 5 hours overtime pay).

 * 
 */
public class HourWork {
	public static void main(String[]args)
	{
		int  b, c;
		double a , d;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Hourly wage:"); // per hour money
		int x=scan.nextInt();
		System.out.println("Enter number of hour employee worked:");
		int y=scan.nextInt(); // no of hour work
	
		if(y> 40) //45>40
		{
			b=y-40;//45-40= 5
			d= (1.5*x)*b;//22.5*5=112.5
			a=(x*40)+d;//(15*40)+112.5=712.5
			
			System.out.println("Monthly salary beyond 40 hour = "+a);
		}
		else
		{
			c=x*y;
			System.out.println("Monthly salary ="+c);
		}
		scan.close();
	}
	
}

