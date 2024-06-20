package result;

import java.util.Scanner;
/*Develop a Java program that computes the final grade for students based on their 
 * scores in various assignments, quizzes, and exams. It should allow for different 
 * weightages for each type of assessment and apply a grading scale to determine letter
 *  grades. (100-90 A ,80-90 B,70-80 C, <70 D)
 
Input
Assignment 1 score: 80
Assignment 2 score: 90
Midterm Exam Score: 85
Final Exam Score: 88

Output 
Final Result: 85.75.
Grade: B
*/
public class Score {
	public static void main(String[]args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter Assignment 1 Score: ");
		int x=scan.nextInt();
		System.out.println("Enter Assignment 2 Score: ");
		int y=scan.nextInt();
		System.out.println("Enter midterm exam Score: ");
		int z=scan.nextInt();
		System.out.println("Enter Final exam Score: ");
		int f=scan.nextInt();
		double result;
		result=(x+y+z+f)/4;
		System.out.println("Final result of exam is = "+result);
		if(result>90&&result<=100)
		{
			System.out.println("Grade:A");
		}
		else if (result>80&&result<=90)
		{
			System.out.println("Grade:B");
		}
		else if (result>70&&result<=80)
		{
			System.out.println("Grade:C");
		}
		else
		{
			System.out.println("No Grade");
		}
		scan.close();
	}

}
