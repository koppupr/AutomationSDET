package assignment1;

public class Fibonacci_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5, n1 = 0, n2 = 1;
        System.out.print("First " + n + " fibonnacci series : ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(n1 + " , ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
