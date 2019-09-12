package com.jbk;

import java.util.Date;

public class Thread_Ex4 {
	int wait=0;
	Date dt;
	
	@SuppressWarnings("deprecation")
	void ThreadActivity()
	{
		dt = new Date();
		System.out.println("Before Threading");
		System.out.println(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
		
		try {
			while(wait<=10);
			{
				Thread.sleep(100);
				wait++;
			}
			
		} catch (Exception e) {
			
			System.out.println("Error: "+e.toString());
		}
		finally {
			
			dt=new Date();
			System.out.println("\n After Threading");
			System.out.println(dt.getHours() +":"+dt.getMinutes()+ ":" +dt.getSeconds());
		}
	}

}
