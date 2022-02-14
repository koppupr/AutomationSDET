package assignment1;

public class PrimeNumber_5 {

	public static void main(String[] args) {

		int primeflag=0,n=0,i=1,j=1;  
		while(n<10)  
		{  
		j=1;  
		primeflag=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		primeflag++;  
		j++;   
		}  
		if(primeflag==2)  
		{  
		System.out.println(n +" Prime numbers "+ i);  
		n++;  
		}  
		i++;  
		}  
		}  
		}  
