package com.hundreadquestions;
//Question 4 : How to check if one String is rotation of another String in java?
public class StringRotation {

	public static void main(String[] args) {
		String str1 ="javablog";
		String str2 ="blogjava";
		System.out.println(isStringRotated(str1, str2));
	}

	private static boolean isStringRotated(String str1, String str2) {
		if(str1.length()==str2.length()){
			String str3 = str1+str2;
			if(str3.contains(str2)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}

}
