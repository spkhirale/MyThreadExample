package com.jbk;

public class Thread_Ex1 extends Thread {
	 String text = null;
     public Thread_Ex1(String str) {
		  text=str;
		  start();
		 
	} 
     public void run()
     {
    	 System.out.println("I am in cool   "+text);
     }
}

