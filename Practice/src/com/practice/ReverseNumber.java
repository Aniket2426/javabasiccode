package com.practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the nunber :");
		int a = scanner.nextInt();
		int temp = a;
		int rev=0,rem;
		
		while (temp > 0) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp =temp/10;
		}
		System.out.println("Reverse number is :" + rev);
		
	}

}
