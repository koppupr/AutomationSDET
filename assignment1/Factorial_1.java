package assignment1;

public class Factorial_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorialno =3;
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