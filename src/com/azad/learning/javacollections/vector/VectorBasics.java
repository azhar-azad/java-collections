package com.azad.learning.javacollections.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorBasics {

    public static void main(String[] args) {

        // Vector of initial capacity of 2
        Vector<String> strVector = new Vector<>(2);

        usingMethods(strVector);
    }

    private static void usingMethods(Vector<String> strVector) {

        displaySizeAndCapacity("Before adding elements: ", strVector);

        // adding elements to vector
        strVector.add("Akib");
        strVector.add(0, "Ripon");
        strVector.addElement("Tipu");
        strVector.addAll(new ArrayList<>(Collections.nCopies(5, "Me")));
        strVector.addAll(6, new ArrayList<>(Arrays.asList(new String[] {"Some", "Guest"})));

        displayVector("Vector after adding elements: ", strVector);

        displaySizeAndCapacity("After adding elements: ", strVector);

        //
    }

    private static void displaySizeAndCapacity(String msg, Vector<String> strVector) {
        System.out.println(msg);
        System.out.println("Size: " + strVector.size());
        System.out.println("Capacity: " + strVector.capacity());
        System.out.println();
    }

    private static void displayVector(String msg, Vector<String> strVector) {
        System.out.println(msg);
        for (String str: strVector) {
            System.out.print(" " + str);
        }
        System.out.println();
    }
}
