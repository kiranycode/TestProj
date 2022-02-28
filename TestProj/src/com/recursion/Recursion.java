package com.recursion;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(recursion(5));

	}

	private static int recursion(int i) {
		if(i==0) {
			return 1;
		}
			return i*(recursion(i-1));
		
		
	}

}
