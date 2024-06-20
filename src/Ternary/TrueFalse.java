package Ternary;

import java.util.Scanner;

public class TrueFalse {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		String msg = (num%2==0) ? " The number is even" : " The number is odd";
		System.out.println(msg);
		scan.close();
	}


}


// (condition)? "True" : "False"