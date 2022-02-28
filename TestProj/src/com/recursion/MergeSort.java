package com.recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int num [] = {20,35,-15,7,55,1,-22};
		mergeSort(num, 0, num.length);
		System.out.println(Arrays.toString(num));
	}

	private static void mergeSort(int[] num, int start, int end) {
		
		
		if(end -start<2) {
			return;
		}
		int mid = (end+start)/2;
		mergeSort(num, start,mid);
		mergeSort(num,mid,end);
		merge(num,start,mid,end);
		
	}

	private static void merge(int[] num, int start, int mid, int end) {
		int tempArray [] = new int [end-start] ;
		int lp=start;
		int rp=mid;
		int t=0;
		while(lp<mid && rp<end) {
			
			if(num[lp]>num[rp]) {
				System.out.println(num[start]+"         "+num[mid]);
				tempArray[t++]=num[rp];
				rp++;
			}else {
				tempArray[t++]=num[lp];
				lp++;
			}
		}
		while(lp<mid) {
			tempArray[t++]=num[lp++];
		}
		while(rp<end) {
			tempArray[t++]=num[rp++];
		}
		for(int i=0; i<tempArray.length;i++) {
			num[start++]=tempArray[i];
		}
	}

}
