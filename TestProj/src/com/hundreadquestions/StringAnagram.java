package com.hundreadquestions;
/*
* Question 2 : Write a java program to check if two Strings are anagram in java?
* Solution: Two string are anagrams if they have same characters but in different order. For example: Angel and Angle are anagrams
* There are few ways to check if Strings are anagrams. Some of them are:
 */
public class StringAnagram {

	public static void main(String[] args) {
		String str1 ="Angel";
		String str2 ="Angle"; 
		System.out.println(isAnagram(null,str2));

	}

	private static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = true;
		int refrence [] = new int[256];
		
		
		if(str1 == null && str2 == null){
			return true;
		}
	
		
		
		
		if(str1!=null && str2!=null && str1.length()==str2.length()){
			
			for(int i=0; i<str1.length();i++){
				refrence[str1.charAt(i)]=refrence[str1.charAt(i)]+1;
			}
			
			for(int i=0; i<str2.length();i++){
				refrence[str2.charAt(i)]=refrence[str2.charAt(i)]-1;
			}
			
			for(int i=0; i<refrence.length;i++){
				if(refrence[i]!=0){
					return false;
				}
			}
		}else{
			return false;
		}
		return isAnagram;
		
	}

}
