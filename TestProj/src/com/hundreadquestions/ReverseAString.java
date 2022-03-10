package com.hundreadquestions;

//How to reverse a String in java? Can you write a program without using any java inbuilt methods?

public class ReverseAString {

	public static void main(String[] args) {
		String str= "Kiran";
		str = reverse(str);
		System.out.println(str);
	}

	private static String reverse(String str) {
		char c[] = str.toCharArray();
		int left =0;
		int right=c.length-1;
		while(left<right){
			char temp = c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;
			right--;
		}
		return String.valueOf(c);
	}

}
