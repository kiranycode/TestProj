package com.questions;

public class JewelsInStones {
	
	
	public static void main(String[] args) {
		JewelsInStones jewelsInStones =new  JewelsInStones();
		System.out.println(jewelsInStones.numJewelsInStones("ebd", "bbb"));
		
	}
	
	public int numJewelsInStones(String J, String S) {
        char [] c  = S.toCharArray();
        int cnt=0;
        
        for(int i=0; i<c.length; i++){
        	int index = J.indexOf(c[i]); 
        	if(index>=0){
        		cnt++;
        	}        	
        }
        return cnt;
    }
	
	
	

}
