package com.dailybyte.questions;

public class ValidPalindromeWithRemoval {

	public static void main(String[] args) {
		ValidPalindromeWithRemoval validPalindromeWithRemoval = new ValidPalindromeWithRemoval();
		//System.out.println("abcba  "+validPalindromeWithRemoval.validPalindrome("abcba"));
		//System.out.println("abccb  "+validPalindromeWithRemoval.validPalindrome("abccb"));
		System.out.println("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga  "+validPalindromeWithRemoval.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
		

	}
	
	
	public boolean validPalindrome1(String s) {		 
		 return validPalindrome1(s.toCharArray(), 0);		
	 }
	
	 public boolean validPalindrome1(char c[] , int cntSkipped) {
		 boolean palindrome =true;
		 
		 int l=0;
		 int r=c.length-1;		 
		 while(l<r){			 
			 if(c[l] ==c[r]){
				 l++;
				 r--;
			 }else{
				 if(cntSkipped==0){
				//	 validPalindrome1()
				 }else{
					 return false;
				 }
			 }
		 }
		return palindrome;
	 }
	 
	 public boolean validPalindrome(String s) {
		 boolean palindrome =true;
		 char c []  = s.toCharArray();
		 return palindrome;
	 }
	 

}
