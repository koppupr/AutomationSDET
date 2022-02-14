package assignment2;

public class DuplicateArray_6 {

	public static void main(String[] args) {
		int[] my_array = { 12, 32, 18, 45, 45, 93, 10, 23, 5, 6,18 };

		for (int i = 0; i < my_array.length - 1; i++) 
		{
		for (int j = i + 1; j < my_array.length; j++) 
		{
		if ((my_array[i] == my_array[j]) && (i != j)) 
		{
		System.out.println("Duplicate Element : " + my_array[j]);
		}
		}
		}
	    }
}
