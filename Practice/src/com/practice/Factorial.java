package com.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = scanner.nextInt();
		
		for (int i =1;i<=a;i++) {
			fact = fact * i;
			
			
		}
		System.out.println("Factorial of number n is " + fact);
		

	}

}
