package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String s ="anii";
//		String rev = "";
//		
//		for(int i=s.length()-1; i>=0; i--) {
//			rev += s.charAt(i);
//		}
//		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	
	}

}
