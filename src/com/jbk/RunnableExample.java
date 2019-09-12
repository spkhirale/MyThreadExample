package com.jbk;

public class RunnableExample {

	public static void main(String[] args) {
		Count1 obj = new Count1();
		try {
			while(obj.mythread.isAlive())
			{
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
			
		} catch (InterruptedException e) {
			
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread's run is over");
		
	}

}
