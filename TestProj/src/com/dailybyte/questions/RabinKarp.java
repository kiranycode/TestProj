package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {

	public static void main(String[] args) {
		RabinKarp rabinKarp = new RabinKarp();
		System.out.println(rabinKarp.majorityElement("AAB", "ACAABCAAB"));

	}

	private List<Integer>  majorityElement(String P, String T) {
		
		int tc=256;
		int pl =P.length()-1;
		double ph=0;
		double th=0;		
		char PC [] = P.toCharArray();
		char TC [] = T.toCharArray();
		 List<Integer> shifts = new ArrayList<>();
		for(int i=0; i<=pl; i++){
			ph = ph+(PC[i]*Math.pow(tc, i));
			th = th+(TC[i]*Math.pow(tc, i));
			
		}		
		for(int i=0; i<=TC.length-PC.length; i++){
			boolean isMatch=false;
			System.out.println(i+"  ph:"+ph+"         th:"+th);
			if(ph==th){				
				isMatch =true;				
				for(int j=0; j<=pl; j++){
					if(PC[j]!=TC[i+j]){
						isMatch =false;
						break;
					}
				}
			}	
			if(isMatch){
				shifts.add(i);
			}
			if(i+pl<TC.length-1){
				th=(th-TC[i]*(Math.pow(256,0)))/256;
				th =th+TC[i+pl+1]*(Math.pow(256, pl));
			}
		}
		
		
		//double hashcode = findHashCode(P);
		//System.out.println(hashcode);
		return shifts;
	}

	private double findHashCode(String p) {
		double result=0;
		char c []=  p.toCharArray();
		int length = c.length-1;
		for(int i=0; i<c.length; i++){
			result =c[i] * Math.pow(26, length);
		}
		return result;
	}

}
