package com.begining.DS.chapter1;

public class BinaryToDecimalNumber {

	public static void main(String[] args) {
		String binnaryNumber ="10110";
		int pow=1;
		int value=0; 
		for(int i=1;i<=binnaryNumber.length();i++ ){
			if(binnaryNumber.charAt(binnaryNumber.length()-i)=='1'){
				value = value +pow;
			}
			
			pow = pow*2;
			
		}
		System.out.println("value : "+value);
	}

}
