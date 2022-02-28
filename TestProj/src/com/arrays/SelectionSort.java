package com.arrays;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		selectionSort(num);

	}

	private static void selectionSort(int[] num) {
		
		
		for(int unOrderedIndex=num.length-1; unOrderedIndex>0; unOrderedIndex--) {
			//always selecting 0th element as max
			int maxIndex=0;
			for(int j=1; j<=unOrderedIndex; j++) {
				if(num[j]>num[maxIndex]) {
					maxIndex=j;
				}
			}
			int temp = num[unOrderedIndex];
			num[unOrderedIndex]= num[maxIndex];
			num[maxIndex] = temp;
			//System.out.println(Arrays.toString(num));
		}	
		System.out.println(Arrays.toString(num));
	}
}
