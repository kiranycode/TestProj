package com.hundreadquestions;
//Question 6 : Find first non repeated character in String in java?
public class FirstNonRepeatedCahracter {

	public static void main(String[] args) {
		String str= "kk";
		System.out.println(findNonRepeatedCharacter(str));

	}

	private static Character findNonRepeatedCharacter(String str) {
				for(int i=0; i<str.length();i++){
					if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
						return str.charAt(i);
					}
				}
		
		return null;
	}

}
