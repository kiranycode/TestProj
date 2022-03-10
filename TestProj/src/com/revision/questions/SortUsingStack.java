package com.revision.questions;

import java.util.Stack;

//Sort an stack using another stack


public class SortUsingStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(67);
		s.add(89);
		s.add(34);
		s.add(27);
		s.add(86);		
		Stack result= sort(s);
		
		System.out.println(result.toString());
	}

	private static Stack sort(Stack<Integer> s) {
		Stack<Integer> result = new Stack<>();
		while(!s.isEmpty()){
			int currentData=s.pop();
			while(!result.isEmpty() && result.peek()>currentData){
				s.push(result.pop());
			}
			result.push(currentData);
		}
		return result;
	}

}
