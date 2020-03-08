/**
 * 
 */
package com.kishan.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kishankumar
 * Feb 29, 2020 
 */
public class StreamSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "zgabc");
		Employee e2 = new Employee(5, "tet");
		Employee e3 = new Employee(2, "gyert");
		Employee e4 = new Employee(6, "gasfbc");
		Employee e5 = new Employee(9, "pol");
		Employee e6 = new Employee(1, "test");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println("Before Sorting the list:::");
		list.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by id using stream sorted:::");
		list.stream().sorted().forEach(r-> System.out.println(r));
		System.out.println("After Sorting the list by id using stream sorted-comparator:::");
		List<Employee> l1 = list.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
		l1.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by name using stream sorted-comparator:::");
		List<Employee> l2 = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		l2.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by id using Collections.sort-comparator:::");
		Collections.sort(list, Comparator.comparing(Employee::getEmpId));
		list.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by name using Collections.sort-comparator:::");
		Collections.sort(list, Comparator.comparing(Employee::getName));
		list.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by id,name using Collections.sort-comparator chaining:::");
		Collections.sort(list, Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getName));
		list.stream().forEach(r -> System.out.println(r));
		System.out.println("After Sorting the list by id using custom class.sort-comparator:::");
		Collections.sort(list, new MyComparator());
		list.stream().forEach(r -> System.out.println(r));
	}

}

class Employee implements Comparable {

	int empId;
	String name;

	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class MyComparator implements Comparator<Employee> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}
