package com.jbk;

public class ThreadEx2 implements Runnable{
	String text = null;
	Thread thread;
	public ThreadEx2(String str) {
		text = str;
		thread=new Thread(this);
		thread.start();
		
	}

	@Override
	public void run() {
		System.out.println(text);
		
	}
	
	

}
