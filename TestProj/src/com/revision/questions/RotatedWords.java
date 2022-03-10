package com.revision.questions;

/*
 * Write a function for finding the index of the "rotation point," which is where I started working
 *  from the beginning of the dictionary. 
 */
public class RotatedWords {

	public static void main(String[] args) {
		//String[] words = new String[] { "ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage", };
		
		//String[] words = new String[] {"Z" };
		//String[] words = new String[] {"Z","C" };
		String[] words = new String[] {"Z","Y","X", "W", "V","U","T", "A","B","C" };
		int index = findTheRotation(words, 0, words.length-1);
		
		System.out.println(index);
	}
	
	
	public static int findTheRotation(String[] str,int start,int end){
		// No rotation point will return -1
		if(start > end){
			return -1;
		}
		if(start == end) {
			return end;
		}
		
		
		int mid = (start+end)/2;
		
		//The rotation point is found at mid+1
		if(mid < end && str[mid].compareTo(str[mid+1]) > 0){
			return mid+1;
		}
		
		if(start < mid && str[mid-1].compareTo(str[mid]) > 0){
			return mid;
		}
		
		//if Rotation point lies on left side
		if(str[mid].compareTo(str[end]) < 0){
			return findTheRotation(str, start, mid-1);
		}
		//Otherwise will check right array
		return findTheRotation(str, mid+1, end);
	}

	

}
