package com.simplilearn.operators;

public class Lab2 {

	public static void main(String[] args) {
	
		// Increment Operators 
		
		int a = 10;
		
		//int c = a+1; // 11
		
		int c = a++; // 10
		
		System.out.println(c); 
	
		// a+1 is not equal to a++ = true

		// difference between a+1 and a++
		System.out.println("*********************************");
		
		byte b=10+1;
		System.out.println(b);
		
		short s1= 10+1;
		System.out.println(s1);
		
		int i1= 10+1;
		System.out.println(i1);
		
		long l1= 10+1;
		System.out.println(l1);
		
		System.out.println("*********************************");
		
		byte b1 = 10;
		byte b2 = b1++;
		System.out.println(b2);
		
		short s2 = 10;
		short s3 = s2++;
		System.out.println(s3);
		// First print then increment 
		
		
		int i2 = 10;
		int i3 = i2++;
		System.out.println(i3);
		
		long l2 = 10;
		long l3 = l2++;
		System.out.println(l3);
		
		
		
		
	}

}
