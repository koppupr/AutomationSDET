package assignment3;

public class PrintChar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr = "DevLabs Alliance Training"; 
		
		int counter[] = new int[256]; 

		//int len = inputstr.length(); 

		for (int i = 0; i < inputstr.length(); i++) 
			counter[inputstr.charAt(i)]++; 

		char array[] = new char[inputstr.length()]; 
	        for (int i = 0; i < inputstr.length(); i++) { 
		   array[i] = inputstr.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			if (inputstr.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + inputstr.charAt(i)
			 + " in the String is:" + counter[inputstr.charAt(i)]);             
		} 

	}

}
