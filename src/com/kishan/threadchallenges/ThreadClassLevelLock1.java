/**
 * 
 */
package com.kishan.threadchallenges;

/**
 * @author Kishankumar
 * Mar 1, 2020 
 */
public class ThreadClassLevelLock1 implements Runnable { 
	
	@Override
    public void run() 
    { 
        Lock(); 
    } 
  
    public void Lock() 
    { 
        System.out.println(Thread.currentThread().getName()); 
        synchronized(ThreadClassLevelLock1.class) 
        { 
            System.out.println("in block " 
                + Thread.currentThread().getName()); 
            System.out.println("in block " 
                + Thread.currentThread().getName() + " end"); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        ThreadClassLevelLock1 g1 = new ThreadClassLevelLock1(); 
        Thread t1 = new Thread(g1); 
        Thread t2 = new Thread(g1); 
        ThreadClassLevelLock1 g2 = new ThreadClassLevelLock1(); 
        Thread t3 = new Thread(g2); 
        t1.setName("t1"); 
        t2.setName("t2"); 
        t3.setName("t3"); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
} 
