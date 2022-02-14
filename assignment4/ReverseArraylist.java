package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        //Creating an ArrayList object         
	        ArrayList<String> arrlist = new ArrayList<String>(); 
	 
	        //Adding elements to ArrayList object 
	        arrlist.add("group of");         
	        arrlist.add("people in");        
	        arrlist.add("Broadridge");
	        arrlist.add(" are going for ");
	        arrlist.add("SDET");         
	        arrlist.add("Training");
	                 
	        //Displaying ArrayList Before Reverse         
	        System.out.println("Before Reverse ArrayList:");         
	        System.out.println(arrlist);
	         
	        /*Reversing the list using 
	          Collections.reverse() method*/         
	        Collections.reverse(arrlist);
	         
	        //Displaying list after reverse         
	        System.out.println("After Reverse ArrayList:");         
	        System.out.println(arrlist);
	    }
	} 
