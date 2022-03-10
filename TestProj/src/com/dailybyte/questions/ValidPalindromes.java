package com.dailybyte.questions;

public class ValidPalindromes {

	public static void main(String[] args) {
		
		ValidPalindromes validPalindromes = new ValidPalindromes();
		System.out.println(validPalindromes.isPalindromes("Race Car"));
	}

	public boolean isPalindromes(String s) {
		s = s.toLowerCase();
		boolean palindrome=true;
		char c[] = s.toCharArray();
		int i=0;
		int j=c.length-1;
		
		while(i<j){
			if(((c[i]>=48 && c[i]<=57) || (c[i]>=97 && c[i]<=122 ))){ 
				if(((c[j]>=48 && c[j]<=57) || (c[j]>=97 && c[j]<=122 ))){
					
					if(c[j] !=c[i]){
						palindrome =false;
						break;
					}else{
						i++;
						j--;
					}
				}else{
					j--;
				}
			}else{
				i++;
			}
			
		}
		
		
		return palindrome;
	}

}
