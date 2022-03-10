package com.begining.DS.chapter1;

public class OctalToDecimal {

	public static void main(String[] args) {
		String octalNumber="15";
		System.out.println(getDecimaNumber(octalNumber));

	}

	
	public static int getDecimaNumber(String octalNumber){
		int value=0;
		int pow=1;
		for(int i=1; i<= octalNumber.length(); i++){
			int   c= octalNumber.charAt(octalNumber.length()-i) -'0' ;			 
			value = value+c*pow;
			pow= pow*8;
		}
		
		return value;
	}
}
