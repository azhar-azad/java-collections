package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		sortAsc();
		sortDesc();
	}
	
	public static void sortAsc() {
		
		System.out.println("\nsort(asc)\n=========\n");
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(34);
		intList.add(43);
		intList.add(3);
		intList.add(4);
		
		strList.add("thirty-four");
		strList.add("forty-three");
		strList.add("three");
		strList.add("four");
		
		Collections.sort(intList);
		Collections.sort(strList);
		
		System.out.println("Sorted(asc) intList: " + intList);
		System.out.println("Sorted(asc) strList: " + strList);
		
		/*
		OUTPUT: 
		
		Sorted(asc) intList: [3, 4, 34, 43]
		Sorted(asc) strList: [forty-three, four, thirty-four, three]
		 */
	}
	
public static void sortDesc() {
		
		System.out.println("\nsort(desc)\n==========\n");
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(34);
		intList.add(43);
		intList.add(3);
		intList.add(4);
		
		strList.add("thirty-four");
		strList.add("forty-three");
		strList.add("three");
		strList.add("four");
		
		Collections.sort(intList, Collections.reverseOrder());
		
		Collections.sort(strList);
		Collections.reverse(strList);
		
		System.out.println("Sorted(desc) intList: " + intList);
		System.out.println("Sorted(desc) strList: " + strList);
		
		/*
		OUTPUT: 
		
		Sorted(desc) intList: [43, 34, 4, 3]
		Sorted(desc) strList: [three, thirty-four, four, forty-three]
		 */
	}

}
