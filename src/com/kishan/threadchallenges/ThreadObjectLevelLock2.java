package com.kishan.threadchallenges;

/**
 * @author Kishankumar Mar 1, 2020
 */
public class ThreadObjectLevelLock2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(1, "Kishan", 100);
		MyThread1 t1 = new MyThread1(e1, "Thread1");
		t1.start();
		// t1 acquired lock on e1
		MyThread1 t2 = new MyThread1(e1, "Thread2");
		t2.start();
		// but t2 can execute other non sync methods simultaneously
	}
}

class MyThread1 extends Thread {

	private Employee1 emp;
	private String threadName;

	MyThread1(Employee1 emp, String threadName) {
		this.emp = emp;
		this.threadName = threadName;
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
		print();
	}

	public synchronized void display() {
		for (int i = 0; i < 10; i++) {
			this.emp.count++;
			System.out.println(this.emp);
		}
	}
	
	public void print() {
		System.out.println("MyThread is::" + this.threadName);
	}

}

class Employee1 {
	int id;
	String name;
	int count;

	Employee1(int id, String name, int count) {
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