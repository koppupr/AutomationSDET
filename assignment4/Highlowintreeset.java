package assignment4;

import java.util.TreeSet;

public class Highlowintreeset {

	public static void main(String[] args) {

		TreeSet<String> tSet = new TreeSet<String>();

		tSet.add("12");
		tSet.add("33");
		tSet.add("24");
		tSet.add("55");
		tSet.add("47");

		System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());

		System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());

	}
}
