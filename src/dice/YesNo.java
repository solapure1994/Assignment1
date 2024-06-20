package dice;

import java.util.Scanner;

public class YesNo {
	public static void main (String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value on dice: ");
		int x=scan.nextInt();
		String msg= (x>6) ? "YES" : "No";
		System.out.println(msg);
		scan.close();
	}
}
//(condition)? "True" : "False"