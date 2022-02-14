package assignment1;

import java.util.Scanner;

public class Factorial_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorialno ;
		System.out.println("Input your number and press enter: ");

		Scanner in = new Scanner(System.in);

		factorialno = in.nextInt();
		in.close();
		
		long firstno =1;
		int i=1;
		while (i<=factorialno)
		{
			firstno=firstno*i;
			i++;
	}
		System.out.println("Factorial of " + factorialno + " is " + firstno );
}
}