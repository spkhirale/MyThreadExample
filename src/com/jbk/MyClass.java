package com.jbk;

public class MyClass implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: "+t.getName());
		try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended: "+t.getName());
	}
	

}
