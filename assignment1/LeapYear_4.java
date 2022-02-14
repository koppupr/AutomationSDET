package assignment1;
import java.util.Scanner;

public class LeapYear_4 {

		public static void main(String[] args) {

			int year;
			Scanner inputyear = new Scanner(System.in);
			System.out.println("Enter any Year:");
			year = inputyear.nextInt();
			inputyear.close();
			boolean isLeap = false;

			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						isLeap = true;
					else
						isLeap = false;
				} else
					isLeap = true;
			} else {
				isLeap = false;
			}

			if (isLeap == true)
				System.out.println(year + " is a Leap Year.");
			else
				System.out.println(year + " is not a Leap Year.");
		}
	}
