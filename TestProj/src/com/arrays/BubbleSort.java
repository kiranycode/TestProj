package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		bubbleSort(num);

	}

	private static void bubbleSort(int[] num) {
		
		for(int lastUnsortedIndex=num.length-1; lastUnsortedIndex>0; lastUnsortedIndex-- ) {
			for(int j=0; j<lastUnsortedIndex;j++) {
				if(num[j]>num[j+1]) {
					int temp =num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		
	}

}
