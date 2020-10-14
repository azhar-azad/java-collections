# Sorting:
1. Ascending Sorting: 
	* Collections.sort(ArrayList);
	
2. Descending Sorting: 
	* Collections.sort(ArrayList, Collections.reverseOrder());
	* Collections.sort(ArrayList); Collections.reverse(ArrayList);
	
3. Sorting ArrayList with custom objects:
    * Two options: Comparable and Comparator
    
    3.1. Comparable:   
        * Implement **_Comparable_** interface in object class definition.  
        * Override **_compareTo()_** method and write compare logic here.  
        * Now, we can call **_Collections.sort(list)_** method on ArrayList of objects.    
    
    3.2. Comparator:   
        * Create property-comparator of type **_Comparator<Class-name>_**.  
        * Override **_compare(obj1, obj2)_** method and write compare logic here.  
        * Now, we can call **_Collections.sort(list, comparator)_** method on ArrayList.  
        
        