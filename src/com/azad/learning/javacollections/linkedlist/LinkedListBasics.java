package com.azad.learning.javacollections.linkedlist;


import java.util.*;

public class LinkedListBasics {

    public static void main(String[] args) {

        LinkedList<String> strList = new LinkedList<>();

        addElements(strList);
        removeElements(strList);
    }

    private static void addElements(LinkedList<String> strList) {

        System.out.println("\nadd: \n====\n");

        // Adding elements to the list
        strList.add("Tipu");
        strList.add(0, "Akib");
        strList.addFirst("Ripon");
        strList.addLast("Shawon");
        strList.addAll(new ArrayList<>(Collections.nCopies(5, "Me")));
        strList.addAll(6, new ArrayList<>(Arrays.asList(new String[] {"Some", "Guest"})));

        // Display the list
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        /*
        OUTPUT:

        Ripon Akib Tipu Shawon Me Me Some Guest Me Me Me
         */
    }

    private static void removeElements(LinkedList<String> strList) {

        System.out.println("\nremove: \n=======\n");

        // Remove elements from the list
        strList.removeFirst();
        strList.remove();
        strList.remove(2);
        strList.remove("Me");
        strList.removeFirstOccurrence("Me");
        strList.removeLastOccurrence("Me");
        strList.removeLast();

        // Display the list
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        /*
        OUTPUT:

        Tipu Shawon Some Guest
         */
    }
}
