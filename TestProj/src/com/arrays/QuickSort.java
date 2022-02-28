package com.arrays;

public class QuickSort {

	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		quickSort(num,0,num.length);

	}

	private static void quickSort(int[] num,int start, int end) {
		int mid = (end+start)/2;
		int left =start;
		int right =end-1;
		int pivotIndex=start;
		int pivotElement=num[pivotIndex];
		
		
		while(pivotElement<num[left]) {
			num[left]=pivotElement;
			//jnm8ui
		}
		
	}

}
