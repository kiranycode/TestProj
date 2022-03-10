package com.dailybyte.questions;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceWordsWithPrefix {

	public static void main(String[] args) {
		String []  prefixes = {"cat", "catch", "Alabama"};
		String sentence = "The cats were catching yarn";
		ReplaceWordsWithPrefix replaceWordsWithPrefix =  new ReplaceWordsWithPrefix();
		System.out.println(replaceWordsWithPrefix.replacePreFix(prefixes, sentence));
		

	}

	private String replacePreFix(String[] prefixes, String sentence) {
		Arrays.sort(prefixes);
		HashMap<String,String> map = new HashMap();
		for(String p:prefixes){
			map.put(p, p);
		}
		StringBuilder sb = new StringBuilder();
		String [] tokens =sentence.split(" ");
		for(String token: tokens){
			
			sb.append(checkToken(token ,map)+" "); 
			
		}
		
		return sb.toString().trim();
		
	}

	private String checkToken(String token, HashMap<String, String> map) {
		String s= token;
		for(String key :map.keySet()){
			if(s.contains(key)){
				s=key;
				break;
			}
		}
		return s;
	}

}
