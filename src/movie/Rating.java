package movie;

import java.util.Scanner;
//2.Write a Java program that accepts a list of movie reviews and 
	//returns the number of movies reviewed within specified rating 
	//ranges (e.g.,1-5 stars, 6-10 stars), and the count of movies with 
	//superhit , hit, and flop reviews

public class Rating {
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter review Star:");
		int review = scan.nextInt();
		if(review >7 && review<=10) 
		{
		System.out.println("superhit movie");	
		}
		else if(review >4 &&review<=7)
		{
			System.out.println("Hit Movie");	
		}
		else  {
			System.out.println("Flop MOvie");	
		}
		
		scan.close();
		
	}
	}
   