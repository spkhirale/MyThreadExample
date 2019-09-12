package com.jbk;

public class ThreadsInJava3 {

	public static void main(String[] args) {
		final Shared s= new Shared();
		Thread t1 = new Thread()
		{ 
			public void run() {
			  s.methodOne();
		    }
		};
		
		Thread t2 = new Thread()
		{   
		
			public void run()
			{
				s.methodTwo();
			}
		};	
		
		t1.start();
		t2.start();
			
	}

}
