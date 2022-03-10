package com.dailybyte.questions;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		ReversePolishNotation reversePolishNotation = new ReversePolishNotation();		
		System.out.println(reversePolishNotation.evalRPN(new String [] {"2", "1", "+", "3", "*"}));
		System.out.println(reversePolishNotation.evalRPN(new String [] {"4", "13", "5", "/", "+"}));
		System.out.println(reversePolishNotation.evalRPN(new String [] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
		
	}

	
	 public int evalRPN(String[] tokens) {
		 Stack<Integer> s = new Stack<Integer>();
		 for(int i=0; i<tokens.length; i++){
			 if("+-*/".contains(tokens[i])){
				 if(s.isEmpty()){
					 return -1;
				 }
				 int l1 = s.pop();
				 if(s.isEmpty()){
					 return -1;
				 }
				 int l2 = s.pop();
				 if(tokens[i].equals("+")){
					 s.push(l2+l1);
				 }else if(tokens[i].equals("-")){
					 s.push(l2 - l1);
				 }else if(tokens[i].equals("*")){
					 s.push(l2* l1);
				 }else{
					 s.push(l2/l1);
				 }
				 
			 }else{
				 s.push(Integer.parseInt(tokens[i]));
			 }
		 }
		 return s.pop();
	  }
}
