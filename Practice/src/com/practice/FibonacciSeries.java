package com.practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a,b,c,n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a :");
		a = scanner.nextInt();
		System.out.println("Enter b :");
		b = scanner.nextInt();
		System.out.print("Enter number n :");
		 n = scanner.nextInt();
		 
	 	System.out.print(a+" "+b);
	 	
	 	for(int i=2; i<n; i++) {
	 		c = a+b;
	 		System.out.print(" "+c);
	 		a=b;
	 		b=c;
	 		
	 		
	 	}
		
		
		
	}

}
