package assignment1;
import java.util.Scanner;

public class TriangleArea_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner inputMeasurements = new Scanner(System.in);

			System.out.println("Enter the Length of the Triangle:");
			double length = inputMeasurements.nextDouble();

			System.out.println("Enter the Height of the Triangle:");
			double height = inputMeasurements.nextDouble();

			double area = (length * height) / 2;
			System.out.println("Area of Triangle is: " + area);
		}
	}
