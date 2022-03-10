package com.dailybyte.questions;

public class KnapsackAlog {

	public static void main(String[] args) {
		int [] weight={0,2,3,4,5};
		int [] profit={0,1,2,5,6};
		int maxWeight=8;
		
		
		
		int [] [] matrix= createMatrix( weight, profit, maxWeight);
		
		print(matrix);
		
		includedObjects(matrix,weight );

	}

	private static void includedObjects(int[][] matrix, int[] weight) {
		int i = matrix.length-1;
		int j = matrix[0].length-1;
		String result="";
		while(i>0 && j>0){
			if(matrix[i][j]!=matrix[i-1][j]){
				
				System.out.println(i+"is includes");
				result=i+","+result;				
				j=j-weight[i];
			}else{
				System.out.println(i+"the not includes");
				//result=i+","+result;
				i--;				
			}
		}
		System.out.println(result);
		
		
	}

	private static void print(int[][] matrix) {
		int columns = matrix[0].length;
		int rows = matrix.length;
		
		for(int i =0 ; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(matrix[i][j]+"  ");
			}	
			System.out.println();
		}		
	}

	private static int[][] createMatrix(int[] weight, int[] profit, int maxWeight) {
		int [] [] matrix= new int[weight.length][maxWeight+1];		
		for(int i=0; i<weight.length; i++){			
			for(int j=0; j<=maxWeight; j++){
				
				if(i==0 || j==0){
					matrix[i][j]=0;
				}else if(j>=weight[i]){
					matrix[i][j] = Math.max((profit[i]+matrix[i-1][j-weight[i]]), matrix[i-1][j]) ;
				}else{
					matrix[i][j]=matrix[i-1][j];
				}
			}
			
		}		
		return matrix;
	}

}
