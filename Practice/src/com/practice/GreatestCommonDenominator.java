package com.practice;

import java.util.Scanner;

public class GreatestCommonDenominator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number one :");
		int a = sc.nextInt();
		System.out.println("Enter Number two :");
		int b = sc.nextInt();
		
		int x,y,gcd = 1;
//		x = a/2;
//		y = b/2;
		
		for(int i= 1; i<=a && i<=b; i++) {
			if(a%i == 0 && b%i== 0) { 
				gcd = i;
				
			}	
			
			
		}
		System.out.printf("greatest common denominator is"+gcd);
		
		
		
	}
	}
