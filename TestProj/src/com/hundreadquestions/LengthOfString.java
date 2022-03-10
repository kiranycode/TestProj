package com.hundreadquestions;
//Question 8 : Find length of String without using any inbuilt method in java?
public class LengthOfString {

	public static void main(String[] args) {
		String str= "sandhyakiran";
		System.out.println(findLengthOfString(str));
		
	}

	private static int findLengthOfString(String str) {
		int totalLength=0;
		char cArray [] = str.toCharArray();
		for(char c : cArray){
			totalLength++;
		}
		
		return totalLength;
	}
	
	private static int findLengthOfString1(String str) {
		int totalLength=0;
		char c [] = str.toCharArray();
		try{
			while(true){
				System.out.println(c[totalLength]);
				totalLength++;
			}
		}catch(Exception e){
			return totalLength;
		}
		
	}
	
	

}
