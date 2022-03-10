package com.dailybyte.questions;

import java.util.Stack;

public class RemoveAdjusantDuplicates {

	public static void main(String[] args) {
		String s = "abbaca";
		RemoveAdjusantDuplicates removeAdjusantDuplicates = new RemoveAdjusantDuplicates();
		System.out.println(" Input: abbaca       Output: "+removeAdjusantDuplicates.removeDuplicates(s));

	}

	public String removeDuplicates(String str) {		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++){
			if(stack.isEmpty()){
				stack.push(str.charAt(i));
			}else{
				if(stack.peek()==str.charAt(i)){					
					stack.pop();
				}else{
					stack.push(str.charAt(i));
				}
			}
		}		
		return getFromStack(stack);
	}

	private String getFromStack(Stack<Character> stack) {
		StringBuilder s = new StringBuilder();
		while(!stack.isEmpty()){
			s.append(stack.pop());
		}
		return s.reverse().toString();
	}
}

