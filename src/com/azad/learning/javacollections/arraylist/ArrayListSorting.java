package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable {

    private String name;
    private int rollNo;
    private int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Collections.sort(list) method can be used
    @Override
    public int compareTo(Object student) {

        int compareAge = ((Student) student).getAge();
        return this.age - compareAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Comparator for sorting the employee list by employee name
	public static Comparator<Employee> empNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			String emp1Name = emp1.getName().toLowerCase();
			String emp2Name = emp2.getName().toLowerCase();

			return emp1Name.compareTo(emp2Name);
		}
	};

	// Comparator for sorting the employee list by employee age
	public static Comparator<Employee> empAgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp1.getAge() - emp2.getAge();
		}
	};

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

public class ArrayListSorting {

	public static void main(String[] args) {

		sortAsc();
		sortDesc();
		sortUsingComparable();
		sortUsingComparator();
	}
	
	public static void sortAsc() {
		
		System.out.println("\nsort(asc)\n=========\n");
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(34);
		intList.add(43);
		intList.add(3);
		intList.add(4);
		
		strList.add("thirty-four");
		strList.add("forty-three");
		strList.add("three");
		strList.add("four");
		
		Collections.sort(intList);
		Collections.sort(strList);
		
		System.out.println("Sorted(asc) intList: " + intList);
		System.out.println("Sorted(asc) strList: " + strList);
		
		/*
		OUTPUT: 
		
		Sorted(asc) intList: [3, 4, 34, 43]
		Sorted(asc) strList: [forty-three, four, thirty-four, three]
		 */
	}
	
	public static void sortDesc() {
		
		System.out.println("\nsort(desc)\n==========\n");
		
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(34);
		intList.add(43);
		intList.add(3);
		intList.add(4);
		
		strList.add("thirty-four");
		strList.add("forty-three");
		strList.add("three");
		strList.add("four");
		
		Collections.sort(intList, Collections.reverseOrder());
		
		Collections.sort(strList);
		Collections.reverse(strList);
		
		System.out.println("Sorted(desc) intList: " + intList);
		System.out.println("Sorted(desc) strList: " + strList);
		
		/*
		OUTPUT: 
		
		Sorted(desc) intList: [43, 34, 4, 3]
		Sorted(desc) strList: [three, thirty-four, four, forty-three]
		 */
	}

	public static void sortUsingComparable() {

		System.out.println("\nsort(Comparable)\n==========\n");

	    ArrayList<Student> studentList = new ArrayList<>();

	    studentList.add(new Student("Tipu", 223, 31));
	    studentList.add(new Student("Akib", 345, 27));
	    studentList.add(new Student("Ripon", 123, 28));

	    Collections.sort(studentList);

	    for (Student student: studentList) {
	        System.out.println(student);
        }

        /*
        OUTPUT:

        Student{name='Akib', rollNo=345, age=27}
		Student{name='Ripon', rollNo=123, age=28}
		Student{name='Tipu', rollNo=223, age=31}
         */
    }

    public static void sortUsingComparator() {

		System.out.println("\nsort(Comparator)\n==========");

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("Shawon", 28));
		employeeList.add(new Employee("Azad", 27));
		employeeList.add(new Employee("Tanim", 26));

		// Sorting by name
		System.out.println("\nSorting by name: ");
		Collections.sort(employeeList, Employee.empNameComparator);
		for (Employee employee: employeeList) {
			System.out.println(employee);
		}

		// Sorting by age
		System.out.println("\nSorting by age: ");
		Collections.sort(employeeList, Employee.empAgeComparator);
		for (Employee employee: employeeList) {
			System.out.println(employee);
		}

		/*
		OUTPUT:

		Sorting by name:
		Employee{name='Azad', age=27}
		Employee{name='Shawon', age=28}
		Employee{name='Tanim', age=26}

		Sorting by age:
		Employee{name='Tanim', age=26}
		Employee{name='Azad', age=27}
		Employee{name='Shawon', age=28}
		 */
	}
}
