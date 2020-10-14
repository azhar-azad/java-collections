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
    