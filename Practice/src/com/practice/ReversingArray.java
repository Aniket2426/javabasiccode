package com.practice;

public class ReversingArray {
	public static void main(String[] args) {
		int[] ar = new int []{1,3,4,5,6,7,8,9,10,11};
		
		System.out.println("Original Ayrray :");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		System.out.println("reverse Ayrray :");
		
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
			
		}
		
	}

}
