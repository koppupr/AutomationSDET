package assignment3;

public class ConvertStrToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			char[] ch = { 'S', 'D', 'E', 'T','T', 'R', 'A', 'I', 'N', 'I', 'N', 'G' };
			String str = new String(ch);
			System.out.println("Characters are changed to String  " +str);

			char c[] = str.toCharArray();

			System.out.println("On using toCharArray() method -");

			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);

			}
		}
	}