package com.dailybyte.questions;

public class AddBinaryStrings {

	public static void main(String[] args) {
		
				/*Input: a = "11", b = "1"
				Output: "100"
				Example 2:

				Input: a = "1010", b = "1011"
				Output: "10101"
*/
		AddBinaryStrings addBinaryStrings = new AddBinaryStrings();
		System.out.println(addBinaryStrings.addBinary("11", "1"));

	}

	private String addBinary(String a, String b) {
		
		char c1[] =a.toCharArray();
		char c2[] =b.toCharArray();
		int i= a.length()-1;
		int j=b.length()-1;		
		int sum=0;
		StringBuilder sb = new StringBuilder();
		while(i>=0 || j>=0 ){			
			if(i>=0){
				sum =sum+c1[i--]-48;
			}
			if(j>=0){
				sum = sum+c2[j--]-48;
			}
			
			sb.append(sum%2);
			sum = sum/2;						
		}
		if(sum>0){
			sb.append(sum);
		}
		
		return sb.reverse().toString();
		
		
	}

}
