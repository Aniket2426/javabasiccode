package com.practice;



public class StringPalindrome {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the String : ");
//		
//		String str = scanner.nextString();
		String s = "omo";
		String rev = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			rev = rev + s.charAt(i);
			
			
		}
		
		
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
				
	}

}
