package com.tnsif.scannerclass;
import java.util.Scanner;
public class personexce 
{
	 public static void main(String[] args) 
	    {
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("Enter the persons name ");
		    	String name = sc.nextLine();
		    	System.out.println("Enter person income ");
		    	int income = sc.nextInt();
		    	
		    	Personsincome pp = new Personsincome();
		    	pp.setName(name);
		    	pp.setIncome(income);
		    	
		    	Taxcalculation t = new Taxcalculation();
		    	
		    	t.calculatetax(pp);	            
		    	System.out.println("after modification");
		    	System.out.println(pp);
		    	
		}
}
