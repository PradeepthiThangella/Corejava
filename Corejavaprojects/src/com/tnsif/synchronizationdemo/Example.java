package com.tnsif.synchronizationdemo;

public class Example {
	synchronized public static void display()
    {
    	Thread g = Thread.currentThread();
//    	synchronized(this) 
    	{
    		for(int i = 0; i<= 3; i++)
        	{
        		try
        		{
        			Thread.sleep(1000);
        			System.out.println(g.getName()+" "+i);
        		}
        		catch(Exception e)
        		{
        			
        		}
        	}
    	}
    }
}
