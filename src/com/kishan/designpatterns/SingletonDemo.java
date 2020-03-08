package com.kishan.designpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Kishankumar
 * Feb 20, 2020 
 */
public class SingletonDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("Calling 1:: "+ Singleton.getInstance() + ", hashCode::"+Singleton.getInstance().hashCode());
		System.out.println("Calling 2:: "+ Singleton.getInstance() + ", hashCode::"+Singleton.getInstance().hashCode());
		System.out.println("=======================");
		
		System.out.println("=======================");
		System.out.println("Calling 1:: "+ SingletonEager.getInstance() + ", hashCode::"+SingletonEager.getInstance().hashCode());
		System.out.println("Calling 2:: "+ SingletonEager.getInstance() + ", hashCode::"+SingletonEager.getInstance().hashCode());
		System.out.println("=======================");
		
		System.out.println("=======================");
		System.out.println("Calling 1:: "+ SingletonLazyInitialized.getInstance() + ", hashCode::"+SingletonLazyInitialized.getInstance().hashCode());
		System.out.println("Calling 2:: "+ SingletonLazyInitialized.getInstance() + ", hashCode::"+SingletonLazyInitialized.getInstance().hashCode());
		System.out.println("=======================");
		
		System.out.println("=======================");
		System.out.println("Calling 1:: "+ SingletonStaticBlock.getInstance() + ", hashCode::"+SingletonStaticBlock.getInstance().hashCode());
		System.out.println("Calling 2:: "+ SingletonStaticBlock.getInstance() + ", hashCode::"+SingletonStaticBlock.getInstance().hashCode());
		System.out.println("=======================");	
		
		 Class cs = Class.forName("com.kishan.designpatterns.Singleton");
		 Constructor[] crr = cs.getDeclaredConstructors();
		 crr[0].setAccessible(true);
		 Singleton s = (Singleton) crr[0].newInstance();
		 
		 System.out.println("=======================");
			System.out.println("Calling 1:: "+ SingletonStaticBlock.getInstance() + ", hashCode::"+SingletonStaticBlock.getInstance().hashCode());
			System.out.println("Calling 2:: "+ s + ", hashCode::"+s.hashCode());
			System.out.println("=======================");	
		 
	}

}

class Singleton {
	/* Creational design pattern - creating and giving the object 
	* Should have a private constructor
	* Should have static volatile Object as some threads can read partial object during locks
	* Should have static method to get instance, 
	* Should have synchronized block of this class (Class object level lock)
	* To avoid this extra overhead every time, double checked locking principle is used
	* Should be lazy loaded as best practice */
	
	public static volatile Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}	
}

class SingletonEager {
    
    private static final SingletonEager instance = new SingletonEager();
    
    //private constructor to avoid client applications to use constructor
    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}

class SingletonLazyInitialized {

    private static SingletonLazyInitialized instance;
    
    private SingletonLazyInitialized(){}
    
    public static SingletonLazyInitialized getInstance(){
        if(instance == null){
            instance = new SingletonLazyInitialized();
        }
        return instance;
    }
}

class SingletonStaticBlock {

    private static SingletonStaticBlock instance;
    
    private SingletonStaticBlock(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new SingletonStaticBlock();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static SingletonStaticBlock getInstance(){
        return instance;
    }
}
