package com.dailybyte.questions;

import java.awt.print.Printable;

public class LCS {

	public static void main(String[] args) {
		String s1 = "stone";
		String s2 = "longest";
		int [][] matix= new int [s1.length()+1][s2.length()+1];
		createMatrix(matix,"0"+s1,"0"+s2);
		print(matix);
		
	}

	private static void print(int[][] matix) {
		for(int i=0;i<matix.length; i++){
			for(int j=0; j<matix[0].length;j++){
				System.out.print(matix[i][j]+",");
			}
				System.out.println();
		}
		System.out.println();
		
	}

	private static void createMatrix(int [][] matix, String s1, String s2) {
		for(int i=0; i<s1.length(); i++){
			for(int j=0; j<s2.length(); j++){
				
				if(i==0 ||j==0){
					matix[i][j]=0;
				}else if(s1.charAt(i)==s2.charAt(j)){
					matix[i][j]= 1+matix[i-1][j-1];
				}else{
					matix[i][j]=Math.max(matix[i-1][j], matix[i][j-1]);
				}
								
			}
		}		
		getLCSValue(matix,s1,s2);
	}

	private static void getLCSValue(int[][] matix, String s1, String s2) {
		int maxLCS = matix[s1.length()-1][s2.length()-1];
		StringBuilder s = new StringBuilder();
		int i=s1.length()-1;
		int j =s2.length()-1;
		while(i>0 && j>0){			
			if(maxLCS==matix[i][j-1]){
				if(matix[i][j-1] ==matix[i-1][j]){
					i--;
				}else{
					j--;
				}
			}else{
				s.append(s2.charAt(j));
				i--;
				j--;
				maxLCS = matix[i][j];
			}
		}
		System.out.println(s.reverse().toString());
		
	}

}
