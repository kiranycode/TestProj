package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BoyerMoore {

	public static void main(String[] args) {
		BoyerMoore boyerMoore = new BoyerMoore();
		//System.out.println(boyerMoore.majorityElement("SURANA", "WELCOMETOSURANACOLLEGE"));
		System.out.println(boyerMoore.majorityElement("AAB", "ACAABCAAB"));

	}

	private Object majorityElement(String pattern, String content) {
		Map<Character, Integer> badCharTable = new HashMap<Character, Integer>();
		
		for(int i=0; i<pattern.length()-1; i++){
			badCharTable.put(pattern.charAt(i), pattern.length()-1-i);
		}
		badCharTable.put(pattern.charAt(pattern.length()-1), pattern.length());
		badCharTable.put('*', pattern.length());
		
		
		
		
		int skip=1;
		List<Integer> counts = new ArrayList();
		for(int i=0; i<=content.length()-pattern.length(); i=i+skip){
			boolean ismatch=true;
			for(int j=pattern.length()-1; j>=0; j--){
				if(content.charAt(i+j)!= pattern.charAt(j)){
					ismatch=false;					
					skip =	(badCharTable.get(content.charAt(i+j))==null)? badCharTable.get('*'):badCharTable.get(content.charAt(i+j));
					break;
				}
			}
			if(ismatch){
				counts.add(i);
				skip = badCharTable.get('*');
			}
			
		}
		
		return counts;
	}

	

}
