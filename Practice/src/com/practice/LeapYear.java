package com.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int y = sc.nextInt();
		
	if(y%100==0) {
		if(y%400==0) {
			System.out.println("Leap year 1");
		}
	}else if(y%4==0) {
		System.out.println("Leap year");
	}else {
		System.out.println("not leap year");
	}
	}

}
