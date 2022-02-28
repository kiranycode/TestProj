package com.arrays;

import java.util.Arrays;


public class InsertionSort {

	public static void main(String[] args) {
		
		int num [] = {20,35,-15,7,55,1,-22};
		insertionSort(num);

	}

	private static void insertionSort(int[] num) {
		
		//i<num.length as it needs to reach till end
		for(int i=1; i<num.length; i++) {
			int maxValue= num[i];
			int j;//declare out of the loop so that it will be available after end of loop
			for(j=i; j>0 && num[j-1]>maxValue ;j--) {
					num[j]=num[j-1];
			}
			num[j]=maxValue;
		}
		
		
		System.out.println(Arrays.toString(num));
	}

}
