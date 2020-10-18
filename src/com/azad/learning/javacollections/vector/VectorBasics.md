# Basics: 
1. Vector: 
    * Vector implements List Interface. Like ArrayList it also maintains insertion order.
    * It is rarely used in non-thread environment as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.
    
2. Create a Vector: 
    *     Vector vector = new Vector();
    > It creates an empty Vector with the default initial capacity of 10. It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. Note: By default vector doubles its size. i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element It would become 20 (double of default capacity 10).
    
    *     Vector vector = new Vector(3);
    > It will create a Vector of initial capacity of 3.
    
    *     Vector vector = new Vector(3, 4);
    > It will create a Vector of initial capacity of 4 and capacity will be incremented by 6. 
    
    