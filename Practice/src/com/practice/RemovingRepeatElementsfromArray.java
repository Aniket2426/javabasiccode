package com.practice;

import java.util.Arrays;

public class RemovingRepeatElementsfromArray {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,4,3,5,6,6,9};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int[] temp = new int[a.length];
		int j = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != a[i+1]) {
				
			}
		}
	}

}
