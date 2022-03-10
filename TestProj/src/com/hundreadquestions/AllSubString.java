package com.hundreadquestions;

import java.util.ArrayList;
import java.util.List;

//Question 7 : Find all substrings of String in java?
public class AllSubString {

	public static void main(String[] args) {
		String str= "Kiran";
		
		List<String > list = findAllSubString(str);
		System.out.println(list);

	}

	private static List<String> findAllSubString(String str) {
		List<String> result = new ArrayList<String>();
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
				result.add(str.substring(i,j));
			}
		}
		return result;
	}

}
