package com.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int b, flag = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		b = a / 2;

		if (a==0||a==1) {
			System.out.println("Not Prime Number");
		} else {

			for (int i=2; i<=b; i++) {
				if (a%i==0) {
					System.out.println("not Prime Number");
					flag = 1;
					break;
					

				}
			}

		
		if(flag == 0) {
			System.out.println("Prime Number");
		}
		}
	}

}
