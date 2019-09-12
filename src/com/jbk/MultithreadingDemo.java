package com.jbk;

public class MultithreadingDemo extends Thread {
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(i);
		}
		try {
			sleep(2000);
		} catch (Exception e) {
			
		}
		
		System.out.println("My thread is in running state");
	}

	public static void main(String[] args) {
		MultithreadingDemo obj = new MultithreadingDemo();
		obj.start();

	}

}
