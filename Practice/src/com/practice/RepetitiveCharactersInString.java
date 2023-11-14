package com.practice;

public class RepetitiveCharactersInString {

	public static void main(String[] args) {
		String s = "Hello";
		int count;
		
		char[] s1 = s.toCharArray();
		
		for(int i = 0;i<s1.length;i++) {
			for(int j = i+1;j<s1.length;j++) {
				if(s1[i]==s1[j]) {
					System.out.println(s1[i]);
					break;
					
				}
			}
		}
		System.out.println(s1);
		
		
	}

	
}
