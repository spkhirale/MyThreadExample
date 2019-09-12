package com.jbk;

public class ThreadsInJava {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread1");
		t1.setPriority(2);
		t1.start();
		
		MyThread t2 = new MyThread("Thread2");
		t2.setPriority(1);
		t2.start();
		
         System.out.println(t1.getPriority());
         System.out.println(t2.getPriority());
	}

}
