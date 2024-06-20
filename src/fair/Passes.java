package fair;

import java.util.Scanner;
/*There is a fair going on. Rahul wants to visit the fair along with his 𝑁 friends. 
 * Rahul manages to collect K passes for the fair. 
 * Will Rahul be able to enter the fair with all his N friends? A person can enter the fair using one pass, and each pass can be used by 
 * only one person.
 * */
public class Passes {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("No of friends wants to visit fair: ");
		int N=scan.nextInt();
		System.out.println("No of pass holds Rahul:");
		int K=scan.nextInt();
		if(N<K)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		scan.close();
	}

}

