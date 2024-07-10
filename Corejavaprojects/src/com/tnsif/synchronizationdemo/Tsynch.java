package com.tnsif.synchronizationdemo;

public class Tsynch {
	  public static void main(String[] arg)
	    {
//	    	Example ex = new Example();
	    	T t1 = new T(); //T t1 = new T(ex);
	    	T t2 = new T(); //T t2 = new T(ex);
	    	T t3 = new T(); //T t3 = new T(ex);
	    	
	    	t1.start();
	    	t2.start();
	    	t3.start();
	    }
}
