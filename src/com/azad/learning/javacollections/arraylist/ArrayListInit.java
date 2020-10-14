package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInit {

    public static void main(String[] args) {

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
    }
}
