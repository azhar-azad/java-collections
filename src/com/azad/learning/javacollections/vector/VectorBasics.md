# Basics: 
1. Vector: 
    * Vector implements List Interface. Like ArrayList it also maintains insertion order.
    * It is rarely used in non-thread environment as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.
    
2. Create a Vector: 
    *     Vector<Object> vector = new Vector<>();
    > It creates an empty Vector with the default initial capacity of 10. It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. Note: By default vector doubles its size. i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element It would become 20 (double of default capacity 10).
    
    *     Vector<Object> vector = new Vector<>(3);
    > It will create a Vector of initial capacity of 3.
    
    *     Vector<Object> vector = new Vector<>(3, 4);
    > It will create a Vector of initial capacity of 4 and capacity will be incremented by 6.
    
### Methods: 

    * void addElement(Object element): It inserts the element at the end of the Vector.
    
    * int capacity(): This method returns the current capacity of the vector.
    
    * int size(): It returns the current size of the vector.
    
    * void setSize(int size): It changes the existing size with the specified size.
    
    * boolean contains(Object element): This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.
    
    * boolean containsAll(Collection c): It returns true if all the elements of collection c are present in the Vector.
    
    * Object elementAt(int index): It returns the element present at the specified location in Vector.
    
    * Object firstElement(): It is used for getting the first element of the vector.
    
    * Object lastElement(): Returns the last element of the array.
    
    * Object get(int index): Returns the element at the specified index.
    
    * boolean isEmpty(): This method returns true if Vector doesn’t have any element.
    
    * boolean removeElement(Object element): Removes the specifed element from vector.
    
    * boolean removeAll(Collection c): It Removes all those elements from vector which are present in the Collection c.
    
    * void setElementAt(Object element, int index): It updates the element of specifed index with the given element.
     
    
    