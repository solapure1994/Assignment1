package doctor;

import java.util.Scanner;
/*3.Recently, Sonu visited his doctor. The doctor advised Sonu to drink 
at least 3000 ml of water each day. Sonu drank 𝑋 ml of water today.
Determine if Sonu followed the doctor's advice or not.
Input           Output
3999             YES
1450             NO
3000             YES*/
public class WaterDrink {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter how much water drunk by sonu:");
	int x = scan.nextInt();
	if(x>3000) {
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	
	scan.close();
}
}

