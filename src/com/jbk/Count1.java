package com.jbk;

public class Count1 implements Runnable{
	 
	Thread mythread;
   
	public Count1() {
		mythread = new Thread(this,"my runnable thread");
	    System.out.println("my thread created  "+mythread);
        mythread.start();
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println("Printing the count "+i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println("my thread interrupted");
		}
		
		System.out.println("my thread run is over");
	}
	
	

}
