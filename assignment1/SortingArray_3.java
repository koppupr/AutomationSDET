package assignment1;

import java.util.Scanner;

public class SortingArray_3 {

	public static void main(String[] args) {
		int count, temp;
		Scanner inputArr = new Scanner(System.in);
		System.out.print("Enter number of elements you want in the array: ");
		count = inputArr.nextInt();

		int num[] = new int[count];
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			num[i] = inputArr.nextInt();
		}
		inputArr.close();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");
		for (int i = 0; i < count - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[count - 1]);
	}
}
