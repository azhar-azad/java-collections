# Basics:
1. LinkedList: 
    * LinkedList is a linear data structure. 
    * LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers.
    * Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.
    
2. LinkedList Representation: 
    * Each element in the LinkedList is called the Node. 
    * Each Node of the LinkedList contains two items: 1) Content of the element, 2) Pointer/Address/Reference to the Next Node in the LinkedList.

3. Why do we need LinkedList?
    * Linked list allows dynamic memory allocation, which means memory allocation is done at the run time by the compiler and we do not need to mention the size of the list during linked list declaration.
    * Linked list elements don’t need contiguous memory locations because elements are linked with each other using the reference part of the node that contains the address of the next node of the list.
    * Insert and delete operations in the Linked list are not performance wise expensive because adding and deleting an element from the linked list does’t require element shifting, only the pointer of the previous and the next node requires change.
    
4. Create a LinkedList: 
    * LinkedList<String<x>> strList = new LinkedList<>();
    * LinkedList<Integer<x>> intList = new LinkedList<>();

5. Add elements to LinkedList: 
    * strList.add("a string"); _(element will be added at last by default)_
    * intList.addFirst(96); _(element will be added to the first position)_
    * strList.addLast("string at last position"); _(element will be added to the last position)_
    * intList.add(2, 100); _(element will be added to the 3rd position)_

6. Remove elements from LinkedList: 
    * strList.remove(1); _(2nd element will be removed)_
    * intList.removeFirst(); _(first element will be removed)_
    * strList.removeLast(); _(last element will be removed)_
    
### Methods:

	* boolean add(Object item): It adds the item at the end of the list.  
	    LinkedList<String> listObj = new LinkedList<>();
	    listObj.add("hello");
		
	* void add(int index, Object item): It adds an item at the given index of the the list.
		listObj.add(1, "hello2");
		
	* boolean addAll(Collection c): It adds all the elements of the specified collection c to the list. It throws NullPointerException if the specified collection is null. 
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("str1");
		arraylist.add("str2");
		listObj.addAll(arraylist);
		
	* boolean addAll(int index, Collection c): It adds all the elements of collection c to the list starting from a give index in the list. It throws NullPointerException if the collection c is null and IndexOutOfBoundsException when the specified index is out of the range.
	    listObj.addAll(5, arraylist);
	
	* void addFirst(Object item): It adds the item (or element) at the first position in the list.
    	 listObj.addFirst("Hi");
	    
	* void addLast(Object item): It inserts the specified item at the end of the list.
	     listObj.addLast("Good Bye");
	     
    * void clear(): It removes all the elements of a list.
        listObj.clear();
        
    * Object clone(): It returns the copy of the list. 
        Object list = listObj.clone();
        
    * boolean contains(Object item): It checks whether the given item is present in the list or not. If its there then it returns true else it returns false.
    	boolean isContain = listObj.contains("hello");
    	
    * Object get(int index): It returns the item of the specified index from the list. 
   		Object obj = listObj.get(0);
   		
   	* Object getFirst(): It fetches the first item from the list. 
   	    Object obj = listObj.getFirst();
   	    
    * Object getLast(): It fetches the last item from the list. 
        Object obj = listObj.getLast(); 
        
    * int indexOf(Object item): It returns the index of the specified item.
    	int index = listObj.indexOf("hello");
    	
    * int lastIndexOf(Object item): It returns the index of last occurrence of the specified element.
        int index = listObj.lastIndexOf("hello");
        
    * Object poll(): It returns and removes the first item of the list. 
        Object o = listObj.poll();
        
    * Object pollFirst(): Removes the first item of the list. 
        Object o = listObj.pollFirst();
        
    * Object pollLast(): It returns and removes the last item of the list. 
        Object o = listObj.pollLast();    	  	    
   		
	* Object remove(): It returns and removes the first element of the list. 
		Object o = listObj.remove();
		
	* Object remove(int index): It removes and returns the item from the list which is present at the specified index. 
		Object o = listObj.remove(0);
		
    * Object remove(Object obj): It removes and returns the specified object from the list.  
    	Object o = listObj.remove("hello");
    	
    * Object removeFirst(): It removes the first item from the list. 
        Object o = listObj.removeFirst();
        
    * Object removeLast(): It removes the last item from the list. 
        Object o = listObj.removeLast();
        
    * Object removeFirstOccurrence(Object item): It removes the first occurrence of the specified item. 
        Object o = listObj.removeFirstOccurrence("hello");
        
    * Object removeLastOccurrence(Object item): It removes the last occurrence of the specified item. 
        Object o = listObj.removeLastOccurrence("hello"); 
		
	* Object set(int index, Object item): It updates the item of specified index with the given value.  
		Object o = listObj.set(2, "Greetings");
		
	* int size(): It gives the size of the ArrayList – Number of elements of the list.
		int itemCount = listObj.size();

 