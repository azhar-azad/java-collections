package com.azad.learning.javacollections.linkedlist;


import java.util.*;

public class LinkedListBasics {

    public static void main(String[] args) {

        LinkedList<String> strList = new LinkedList<>();

        addElements(strList);
        removeElements(strList);
        usingMethods(strList);
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

    private static void usingMethods(LinkedList<String> strList) {

        System.out.println("\nmethods: \n========\n");

        // clear the list
        strList.clear();

        // add(String) elements
        strList.add("Item1");
        strList.add("Item5");
        strList.add("Item3");
        strList.add("Item6");
        strList.add("Item2");

        // display elements
        System.out.println("Linked List content: " + strList);

        // add first and last element
        strList.addFirst("First Item");
        strList.addLast("Last Item");
        System.out.println("Linked List content after addition: " + strList);

        // get and set values
        Object firstItem = strList.get(0);
        System.out.println("First Element: " + firstItem);
        strList.set(0, "Changed First Item");
        Object newFirstItem = strList.getFirst();
        System.out.println("First element after update by set element: " + newFirstItem);

        // remove first and last element
        strList.removeFirst();
        strList.removeLast();
        System.out.println("Linked List after deletion of first and last element: " + strList);

        // add to a position and remove from a position
        strList.add(2, "New Item at 3rd Position");
        System.out.println("Linked List after addition at middle: " + strList);
        strList.remove(3);
        System.out.println("Final Content: " + strList);

        /*
        OUTPUT:

        Linked List content: [Item1, Item5, Item3, Item6, Item2]
        Linked List content after addition: [First Item, Item1, Item5, Item3, Item6, Item2, Last Item]
        First Element: First Item
        First element after update by set element: Changed First Item
        Linked List after deletion of first and last element: [Item1, Item5, Item3, Item6, Item2]
        Linked List after addition at middle: [Item1, Item5, New Item at 3rd Position, Item3, Item6, Item2]
        Final Content: [Item1, Item5, New Item at 3rd Position, Item6, Item2]
         */
    }
}
