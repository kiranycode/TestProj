package com.dailybyte.questions;

public class StringReverse {

	public static void main(String[] args) {
		
		
		
		reverseString("Cat".toCharArray());
		reverseString("The Daily Byte".toCharArray());
		reverseString("civic".toCharArray());
		
		 
	}

	public static void reverseString(char[] c) {
		int j= c.length-1;		
		int i=0;
		while(i<j){
			char temp  =c[i];
			c[i]=c[j];
			c[j]=temp;
			j--;
			i++;
		}
		
	}
}
