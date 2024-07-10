package com.tnsif.exceptiondemo;

public class Withexception {
public static void main(String[] args) {
	int d=0;
	try {
		int a=55/0;
		System.out.println("hello");
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception handling");
	}
}
}
