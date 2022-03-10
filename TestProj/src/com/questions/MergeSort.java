package com.questions;

public class MergeSort {

	public static void main(String[] args) {
		int[] numbers = { 4, 5, 33, 17, 3, 21, 1, 16 };
		mergeSort(numbers, 0, numbers.length - 1);
		
		print(numbers);

	}
	
	

	private static void print(int[] numbers) {
		for(int i:numbers){
			System.out.print(i+",");
		}
		
	}



	private static void mergeSort(int[] numbers, int start, int end) {
		if(start<end){
			int mid = (start + end) / 2;
			mergeSort(numbers, start, mid);
			mergeSort(numbers, mid + 1, end);
			merge(numbers, start, mid, end);
		}
	}

	private static void merge(int[] numbers, int start, int mid, int end) {
		int left = start;
		 
		int right = mid+1;
		int tempArray[] = new int[end - start + 1];
		for (int k = 0; k < tempArray.length; k++) {
			if (left <= mid && (right > end || numbers[left] < numbers[right])) {
				tempArray[k] = numbers[left++]; 
			}else{
				tempArray[k] = numbers[right++];
			}
		}
		//copy
		for(int j=0; j<tempArray.length; j++){
			numbers[start++]=tempArray[j];
		}
	}

}
