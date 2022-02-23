package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		bubbleSort(num);

	}

	private static void bubbleSort(int[] num) {
		
		for(int i=num.length-1; i>=0; i-- ) {
			
			for(int j=0; j<i;j++) {
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
