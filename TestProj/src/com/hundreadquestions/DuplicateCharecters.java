package com.hundreadquestions;

import java.util.HashMap;
import java.util.Map;

//Question 5 : How to find duplicate characters in String in java?

public class DuplicateCharecters {

	public static void main(String[] args) {
		
		String str="sandhyakiran";
		findDuplicateCahrs(str);
	}

	private static void findDuplicateCahrs(String str) {
		char c [] =str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();  
		for(int i=0; i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i],map.get(c[i])+1);
			}else{
				map.put(c[i],1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}
		
	}

}
