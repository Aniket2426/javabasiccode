package com.practice;

import java.util.Scanner;

public class IntegerPlindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		
		int temp = a;
		int rev=0,rem;
		
		while(temp != 0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a == rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
	}

}
