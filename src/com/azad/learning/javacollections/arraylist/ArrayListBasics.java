package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {

		// Declaration
		ArrayList<String> strList = new ArrayList<>();
		
		// Add elements
		strList.add("Shawon");
		strList.add("Akib");
		strList.add("Tipu");
		strList.add("Ripon");
		
		// Displaying elements
		System.out.println("After adding: ");
		for (String str: strList) {
			System.out.println(str);
		}
		System.out.println();
		
		// Add elements at given index
		strList.add(0, "Azad");
		
		// Displaying elements
		System.out.println("After adding at given index: ");
		for (String str: strList) {
			System.out.println(str);
		}
		System.out.println();
		
		// Remove elements
		strList.remove("Azad");
		strList.remove(0);
		
		// Displaying elements
		System.out.println("After removing: ");
		for (String str: strList) {
			System.out.println(str);
		}
		System.out.println();
	}

	/*
	OUTPUT:

	After adding:
	Shawon
	Akib
	Tipu
	Ripon

	After adding at given index:
	Azad
	Shawon
	Akib
	Tipu
	Ripon

	After removing:
	Akib
	Tipu
	Ripon
	 */
}
