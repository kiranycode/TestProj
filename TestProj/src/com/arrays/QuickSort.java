package com.arrays;

public class QuickSort {

	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		quickSort(num,0,num.length-1);

	}

	private static void quickSort(int[] num,int start, int end) {
		int partionIndex =partion(num, start,end);
		quickSort(num, start, partionIndex-1);
		quickSort(num, partionIndex+1,end);		
	}

	private static int partion(int[] num, int start, int end) {
		int pivoitIndex=start;
		int left =start;
		int right =end;
        while(left<right){
			
		}
		return pivoitIndex;
	}

}
