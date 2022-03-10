package com.hundreadquestions;
/*
 * Question 3 : Write a program to check if String has all unique characters in java?
 * 
 */
public class UniqueCharacters {

	public static void main(String[] args) {
		String str="Kiran";
		System.out.println(checkIsUnique(str.toLowerCase()));

	}

	private static boolean checkIsUnique(String str) {
		boolean isUnique= true;
		int words[] = new int[256];
		for(int i=0; i<str.length(); i++){
			words[str.charAt(i)] =words[str.charAt(i)] +1;
		}
		for(int i=0; i<words.length; i++){
			if(words[i]>1){
				return false;
			}
		}
		return isUnique;
	}

}
