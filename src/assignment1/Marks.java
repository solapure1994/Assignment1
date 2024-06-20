package assignment1;
import java.util.Scanner;
public class Marks {
		//Ram has scored M1 marks in her test and Sham has scored M2  marks in the same test.
		//Ram  is happy if he scored at least twice the marks of Sham's score. 
		//Determine whether he is happy or not.
		//Sample 1:
		//Input:2 1
		
		public static void main(String[]args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter that value of M1");
			int M1 = scan.nextInt();
			System.out.println("enter that value of M2");
			int M2 = scan.nextInt();
			if(M1>=2*M2)
			{
				System.out.println("Ram is happy");
			}
			else
			{
				System.out.println("Ram is not happy");
			}
			scan.close();
		}
		
	}

