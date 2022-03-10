package com.dailybyte.questions;

import java.util.Stack;

public class CompareKeystrokes {

	public static void main(String[] args) {
		
		
		System.out.println(compareStrokes("ABC#".toCharArray(), "CD##AB".toCharArray()));

	}

	private static boolean compareStrokes(char[] s, char[] t) {
		Stack<Character> stack1 = new Stack();
		Stack<Character> stack2 = new Stack();
		
		
		for(int i=0; i<s.length;i++){
			if(s[i]=='#'){
				if(!stack1.isEmpty()){
					stack1.pop();
				}
			}else{
				stack1.push(s[i]);
			}
		}
		
		for(int j=0; j<t.length; j++ ){
			if(t[j]=='#'){
				if(!stack2.empty()){
					stack2.pop();
				}
			}else{
				stack2.push(t[j]);
			}
		}
		
		return stack1.toString().equals(stack2.toString());
	}

}
