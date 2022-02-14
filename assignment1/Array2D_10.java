package assignment1;

public class Array2D_10 {

	public static void main(String[] args) {
		System.out.println("Printing Pyramid using 2 Dimentional Array   : "); 
		int [][] arra2d = new int[10][10];
				System.out.println(arra2d.length);
				for (int i = 0; i < arra2d.length; i++)
				{
		            for (int j = arra2d.length-i; j>1; j--)
		            {
		                // printing spaces
		                System.out.print(" ");
		            }
		            for (int j=0; j <= i; j++ )
		            {
		                // printing zeros
		            	//System.out.print("* ");
		            	arra2d[i][j] = 0;
		                System.out.print(arra2d[i][j]+" ");
		            }
		            System.out.println();
}
}
}
	