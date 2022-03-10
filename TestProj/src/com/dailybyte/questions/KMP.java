package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.List;

public class KMP {

	
	
	public static void main(String[] args) {
		KMP kmp = new KMP();
		//System.out.println(kmp.match("ababcabcabababd","ababd"));
		System.out.println(kmp.match("ababcabcabaaabcadaabebabd","aabcadaabe"));	
		
		//System.out.println(kmp.match("ababcabcabababd","abcaba"));	
	}

	private List<Integer> match(String T, String P) {
		List<Integer> counts = new ArrayList<Integer>();
		int LPS[] = new int[P.length()];
		int j=0;
		int i = j+1;
		char PC[] =P.toCharArray();
		char TC[] =T.toCharArray();
		
		while(i<P.length()){
			if(PC[i]==PC[j]){
				LPS[i]=j+1;
				j++;
				i++;
			}else{
				if(j!=0){
					j=LPS[j-1];
					
				}else{
					LPS[i]=0;
					i++;
				}
				
			}
			
		}
		for(int k:LPS){
			System.out.print(k+",");
		}
		
		int patternIndex=0;
		for(int k=0; k<T.length(); k++){
			if(PC[patternIndex] == TC[k]){
				if(patternIndex==P.length()-1){
					counts.add(k-patternIndex);
					patternIndex=0;
				}
				patternIndex++;
			}else{
				if(patternIndex!=0){
					patternIndex= LPS[patternIndex-1];
					if(patternIndex!=0){
						k--;
					}
				}
			}
		}
		
		return counts;
		
	}

}
