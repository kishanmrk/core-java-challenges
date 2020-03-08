/**
 * 
 */
package com.kishan.threadchallenges;

/**
 * @author Kishankumar Mar 1, 2020
 */
public class ThreadObjectLevelLock1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Kishan", 100);
		MyThread t1 = new MyThread(e1);
		t1.start();
		// t1 acquired lock on e1
		MyThread t2 = new MyThread(e1);
		t2.start();
	}
}

class MyThread extends Thread {

	private Employee emp;

	MyThread(Employee emp) {
		this.emp = emp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}

	public synchronized void display() {
		for (int i = 0; i < 10; i++) {
			this.emp.count++;
			System.out.println(emp);
		}
	}

}

class Employee {
	int id;
	String name;
	int count;

	Employee(int id, String name, int count) {
		this.id = id;
		this.name = name;
		this.count = count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", count=" + count + "]";
	}

}