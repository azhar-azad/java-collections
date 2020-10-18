package com.azad.learning.javacollections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteration {

    public static void main(String[] args) {

        LinkedList<String> strList = new LinkedList<>();

        doIteration(strList);
    }

    private static void doIteration(LinkedList<String> strList) {

        // adding items
        strList.add("Ripon");
        strList.add("Akib");
        strList.add("Tipu");
        strList.add("Shawon");

        // for loop
        System.out.println("For loop: ");
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }
        System.out.println("\n");

        // enhanced for loop
        System.out.println("Enhanced For loop: ");
        for (String str: strList) {
            System.out.print(str + " ");
        }
        System.out.println("\n");

        // while loop
        System.out.println("While loop: ");
        int i = 0;
        while (i < strList.size()) {
            System.out.print(strList.get(i) + " ");
            i++;
        }
        System.out.println("\n");

        // iterator
        System.out.println("Iterator: ");
        Iterator iterator = strList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");

        /*
        OUTPUT:

        For loop:
        Ripon Akib Tipu Shawon

        Enhanced For loop:
        Ripon Akib Tipu Shawon

        While loop:
        Ripon Akib Tipu Shawon

        Iterator:
        Ripon Akib Tipu Shawon
         */
    }
}
