package assignment1;

public class Sum_7 {

	public static void main(String[] args) {
		int noCount = 20;
		int sum = 0;
		for(int i = 1; i <= noCount; ++i)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of first 20 natural numbers is " + sum);
	}

}
