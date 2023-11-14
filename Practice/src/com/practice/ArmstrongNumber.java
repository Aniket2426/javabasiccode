package com.practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = scanner.nextInt();
		
		int temp = a;
		int temp1 = a;
		int sum = 0,rem=0,count=0,rem1=0;
		
		while(temp!=0) {
			rem = temp%10;
			count++;
			temp=temp/10;
		}
		
		while(temp1!=0) {
			rem1 = temp1%10;
			sum += Math.pow(rem1,count);
			temp1=temp1/10;
		}
		if(a == sum) {
			System.out.println("Number is Armstrong ");
			
		}else {
			System.out.println("Number is not Armstrong");
		}
		
	
		
	}

}
