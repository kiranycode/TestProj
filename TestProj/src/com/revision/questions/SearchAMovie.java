package com.revision.questions;

import java.util.HashMap;
import java.util.Map;

import com.begining.DS.chapter1.Point;

public class SearchAMovie {

	public static void main(String[] args) {
		Map<String, Point> abcMap = new HashMap<String, Point>();
		abcMap.put("A", new Point(0,0));
		abcMap.put("B", new Point(0,1));
		abcMap.put("C", new Point(0,2));
		abcMap.put("D", new Point(0,3));
		abcMap.put("E", new Point(0,4));
		abcMap.put("F", new Point(1,0));
		abcMap.put("G", new Point(1,1));
		abcMap.put("H", new Point(1,2));
		abcMap.put("I", new Point(1,3));
		abcMap.put("J", new Point(1,4));
		abcMap.put("K", new Point(2,0));
		abcMap.put("L", new Point(2,1));
		abcMap.put("M", new Point(2,2));
		abcMap.put("N", new Point(2,3));
		abcMap.put("O", new Point(2,4));
		abcMap.put("P", new Point(3,0));
		abcMap.put("Q", new Point(3,1));
		abcMap.put("R", new Point(3,2));
		abcMap.put("S", new Point(3,3));
		abcMap.put("T", new Point(3,4));		
		abcMap.put("U", new Point(4,0));
		abcMap.put("V", new Point(4,1));
		abcMap.put("W", new Point(4,2));
		abcMap.put("X", new Point(4,3));
		abcMap.put("Y", new Point(4,4));
		abcMap.put("Z", new Point(5,0));
		//searchMovie(abcMap,  "BHE");
	}

	private String searchMovie(Map<String, Point> abcMap, String movieName) {
		char c [] = movieName.toUpperCase().toCharArray();
		//int i=0;
		StringBuilder result=new StringBuilder();
		Point currentPosition= new Point(0,0);
		boolean isinvalidCharector=false;
		for(char s:c){
			Point togo = (Point)abcMap.get(s+"");
			if(togo!=null){
				while(togo.x > currentPosition.x){
					result.append("RIGHT, ");
				}
					
				currentPosition =togo;
			}else{
				isinvalidCharector= true;
				break;
			
				
			}
				
			
		}
		return result.toString();
	}

}
