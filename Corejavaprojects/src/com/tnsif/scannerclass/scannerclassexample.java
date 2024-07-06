package com.tnsif.scannerclass;
import java.util.Scanner;

public class scannerclassexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = sc.next();
		
		System.out.println("Enter your roll number ");
		int roll = sc.nextInt();
		
		System.out.println("Your name is "+name+"\nYour roll is "+roll);
	}
}
