package com.tnsif.superkeyword;

public class SuperDemo extends superex {
	
	int a=7;
	
	void drinking() {
		System.out.println("tea");
	}
	
	void display() {
//		System.out.println(a);
//		System.out.println(super.a);
		drinking();
		super.drinking();
		
	}
	SuperDemo(){
	
		super();
}
	public static void main(String[] args) {
		SuperDemo d=new SuperDemo();
		
		d.display();
	}
}

