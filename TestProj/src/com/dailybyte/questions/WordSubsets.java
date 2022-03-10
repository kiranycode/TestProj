package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {

	public static void main(String[] args) {
		WordSubsets wordSubsets = new WordSubsets();
		System.out.println(wordSubsets.wordSubsets(new String [] {"amazon","apple","facebook","google","leetcode"}, new String [] {"e","o"}));
		System.out.println(wordSubsets.wordSubsets(new String [] {"amazon","apple","facebook","google","leetcode"}, new String [] {"l","e"}));
		System.out.println(wordSubsets.wordSubsets(new String [] {"amazon","apple","facebook","google","leetcode"}, new String [] {"e","oo"}));
		System.out.println(wordSubsets.wordSubsets(new String [] {"amazon","apple","facebook","google","leetcode"}, new String [] {"lo","eo"}));
		System.out.println(wordSubsets.wordSubsets(new String [] {"amazon","apple","facebook","google","leetcode"}, new String [] {"ec","oc","ceo"}));

	}

	
	 public List<String> wordSubsets1(String[] A, String[] B) {
	   List<String> resultList = new ArrayList<String>();
	   for(int i=0; i<A.length; i++){
		   boolean isusbset=false;
		   for(int j=0; j<B.length; j++){
			   if(checkSubSet(A[i],B[j])){
				   isusbset= true;
			   }else{
				   isusbset=false;
				   break;
			   }
		   }
		   if(isusbset){
			   resultList.add(A[i]);
		   }
		   
	   }
		 
		 return resultList;
	  }


	private boolean checkSubSet(String word, String subset) {
		boolean isSubset =false;
		char c[] =subset.toCharArray();
		StringBuilder sb= new StringBuilder(word);
		for(int j=0; j<subset.length();j++){
			if(sb.indexOf(c[j]+"") >=0 ){
				sb.deleteCharAt(sb.indexOf(c[j]+""));
				isSubset= true;				
			}else{
				isSubset= false;
				break;
			}
		}
		return isSubset;
	}
	
	
	
	 public List<String> wordSubsets(String[] A, String[] B) {
		 List<String> resultList = new ArrayList<String>();
		 int superSubSet[] = new int [26];
		 
		 for(String str:B){
			 char c[] = str.toCharArray();
			 int tempSet[] = new int [26];
			 for(char t:c){
				tempSet[t-'a']++; 
			 }
			 
			 for(char t:c){
				 superSubSet[t-'a'] = Math.max(superSubSet[t-'a'], tempSet[t-'a']);
			 }
		 }
		 
		 for(String s: A){
			 char c[] = s.toCharArray();
			 int tempSet[] = new int [26];
			 for(char t:c){
					tempSet[t-'a']++; 
			 }			 
			 //check tempSet nad superSet or same
			 boolean isMatch=true;
			 for(int i=0; i<superSubSet.length; i++){				 
				 if(superSubSet[i]>tempSet[i]){
					 isMatch=false;
					 break;					 
				 }
			 }
			 if(isMatch){
				 resultList.add(s);
			 }
		 }
		 
		 
		 return resultList;
	 }
	
}
