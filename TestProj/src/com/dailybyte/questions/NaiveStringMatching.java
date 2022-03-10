package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.List;

public class NaiveStringMatching {
	
	
	public List<Integer> match(String P, String T) {
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		for(int i=0; i<T.length()-P.length()+1; i++){
			boolean hasPattern = true;
			for(int j=0; j<P.length(); j++){
				if(P.charAt(j)!=T.charAt(i+j)){
					hasPattern=false;
					break;
				}
			}
			if(hasPattern){
				resultList.add(i);
			}
		}
		return resultList;
		
	}

	
	
	public static void main(String[] args) {
		NaiveStringMatching naiveStringMatching = new NaiveStringMatching();
		System.out.println(naiveStringMatching.match("AAB", "ACAABCAAB").toString());

	}

}
