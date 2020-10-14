package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListBasics {

	public static void main(String[] args) {

		basics();
		init();
	}
	
	public static void basics() {
		
		System.out.println("\n\nbasics\n======\n");
		
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
	
	public static void init() {
		
		System.out.println("\n\ninit\n====\n");
		
		// Initialization using Arrays.asList
        String[] strArray = {"Tipu", "Shawon", "Akib", "Ripon"};
        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("strList1: " + strList1);

        // Anonymous inner class method
        ArrayList<String> strList2 = new ArrayList<String>() {{
            add("Tipu");
            add("Shawon");
            add("Akib");
        }};
        System.out.println("strList2: " + strList2);

        // Use Collections.nCopies method
        ArrayList<Integer> intList = new ArrayList<>(Collections.nCopies(10, 1));
        System.out.println("intList: " + intList);
        
        /*
        OUTPUT:

        strList1: [Tipu, Shawon, Akib, Ripon]
        strList2: [Tipu, Shawon, Akib]
        intList: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
         */
	}
}
