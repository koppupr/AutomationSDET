package assignment3;

public class SearchWordinString_3 {

	public static void main(String[] args) {
		
		String inputstr = "A brown fox ran away fast";
		int intIndex = inputstr.indexOf("brown");
		if(intIndex == - 1) {
			System.out.println("brown not found");
		} else {
			System.out.println("Found brown at index "+ intIndex);
		}
	}
}