package com.hundreadquestions;
//Question 9 : Write a program to print all permutations of String in java?
public class StringPermutations {

	public static void main(String[] args) {
		String str ="ABC";
		findAllPermutations(str, "");
	}


	private static void findAllPermutations(String str, String suffix) {
		if(str.equals("")){
			System.out.println(suffix);
			return;
		}
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			String res= str.substring(0,i)+str.substring(i+1);
			findAllPermutations(res , suffix+c);
		}
		
	}
}