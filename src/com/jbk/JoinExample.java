package com.jbk;

public class JoinExample {

	public static void main(String[] args) {
		Thread th1 = new Thread(new MyClass(), "th1");
		
		Thread th2 = new Thread(new MyClass(), "th2");
		
		Thread th3 = new Thread(new MyClass(), "th3");
		
        th1.start();
        try {
        	th1.join();
        	
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        th2.start();
        try {
        	th2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        th3.start();
        try {
        	th3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("All three threads have finished execution");
        
	}

}
