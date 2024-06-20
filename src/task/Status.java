package task;

import java.util.Scanner;

public class Status {
public static void main(String[]args)
{
	String Task1,Status;
		int Time;
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of x input:");
		x=scan.nextInt();
		
		if(x<=3) {
			System.out.println("Enter task,status and complition time");
		Task1=scan.nextLine();
		Status=scan.nextLine();
		Time=scan.nextInt();
		}
		else
		{
			System.out.println("no entry found");
		}
		scan.close();
		
		
	
}

}
/*6.Write a Java program that accepts a list of tasks within a project management tool 
 * and their completion status (completed, pending), 
 * and returns the number of tasks completed, pending, 
 * and the average time taken to complete each task.	
Input                             
Task 1, Completed, 5
Task 2, Pending, 0
Task 3, Completed, 3
*/