# Basics: 
1. ArrayList:  
	* ArrayList class implements List interface and it is based on an Array data structure.
	* ArrayList is a resizable-array implementation of the List interface. 
	* It implements all optional list operations, and permits all elements, including null.
	
2. ArrayList vs Array:
	* The limitation with array is that it has a fixed length so if it is full you cannot add any more elements to it, likewise if there are number of elements gets removed from it, the memory consumption would be the same as it doesn’t shrink.
	* On the other hand ArrayList can dynamically grow and shrink after addition and removal of elements.
	* Apart from these benefits, ArrayList class enables us to use predefined methods of it which makes our task easy.
	
3. Create an ArrayList:
	* ArrayList<String<x>> strList = new ArrayList<>();
	* ArrayList<Integer<x>> integerList = new ArrayList<>(); 
	
4. Add elements to ArrayList: 
	* strList.add("a string");
	* integerList.add(19);
	* strList.add(3, "string in fourth position"); _(not replace. right side items will be shifted)_
	
5. Change an element in ArrayList: 
	* strList.set(0, "will replace the first item");
	
6. Remove elements from ArrayList: 
	* strList.remove("a string");
	* strList.remove(2); _(will remove the 3rd element)_
	
7. Get ArrayList length: 
	* strList.size();
	
### Methods:

	* add(Object o): This method adds an object o to the ArrayList.  
	    listObj.add("hello");
		
	* add(int index, Object o): It adds the object o to the array list at the given index.
		listObj.add(0, "hello");
		
	* remove(Object o): Removes the object o from the ArrayList.
		listObj.remove("hello");
		
	* remove(int index): Removes element from a given index.
		listObj.remove(0);
		
	* set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.
		listObj.set(2, "Greetings");
		
	* int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
		int pos = listObj.indexOf("hello");
		
	* Object get(int index): It returns the object of list which is present at the specified index.
		String str = listObj.get(0);
		
	* int size(): It gives the size of the ArrayList – Number of elements of the list.
		int itemCount = listObj.size();
		
	* boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false
		boolean isContain = listObj.contains("hello");
		
	* clear(): It is used for removing all the elements of the array list in one go.
		listObj.clear();
		
# Init:
1. Method 1: Initialization using Arrays.asList  
    * ArrayList<T<T>> obj = new ArrayList<>(  
    Arrays.asList(Object o1, Object o2, ...)  
    );

2. Method 2: Anonymous inner class method 
    * ArrayList<T<T>> obj = new ArrayList<T<T>>(){{  
      add(Object o1);  
      add(Object o2);  
      add(Object o3);  
      ...  
        }};
    
3. Method 3: Use Collections.nCopies
    * Collections.nCopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. 
    * ArrayList<T<T>> obj = new ArrayList<T<T>>(Collections.nCopies(count, element));
    * _**count**_ is the number of elements and _**element**_ is the item value.
 
 