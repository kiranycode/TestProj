package com.dailybyte.questions;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] a = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
		MaximumSubarray maxSubarray = new MaximumSubarray();
		//print(maxSubarray.maxSubarrayBrutForce(a));
		System.out.println(maxSubarray.maxSubarray(a,0,a.length-1));
	}

	private static void print(int[] maxSubarrayBrutForce) {
		for (int i = 0; i < maxSubarrayBrutForce.length; i++) {
			System.out.print(maxSubarrayBrutForce[i] + ",");
		}
	}

	private int[] maxSubarrayBrutForce(int[] number) {
		int subArrayStart = 0;
		int subArrayEnd = 0;
		int maxResult = Integer.MIN_VALUE;
		for (int i = 0; i < number.length; i++) {
			int sum = number[i];
			for (int j = i+1; j < number.length; j++) {

				sum = sum+number[j];//getSumOfArray(number, i, j);
				if (sum > maxResult) {
					maxResult = sum;
					subArrayStart = i;
					subArrayEnd = j;
				}
			}
		}

		return getSubArray(number, subArrayStart, subArrayEnd);
	}

	private int[] getSubArray(int[] number, int subArrayStart, int subArrayEnd) {
		int[] subArray = new int[subArrayEnd - subArrayStart + 1];
		int k = 0;
		for (int i = subArrayStart; i <= subArrayEnd; i++) {
			subArray[k++] = number[i];
		}
		return subArray;
	}

	
	
	
	private int maxSubarray(int[] numbers, int start, int end) {
		if(start ==end){
			return numbers[start];
		}		
		int mid= (end+start)/2;
		
		int  best = maxSubarray(numbers, start, mid);
		int  subRight = maxSubarray(numbers, mid+1, end);				
		int maxCrossSum = maxCrossSum(numbers, start, mid,end);
		if(subRight>best)
			best=subRight;
		return Math.max(best,maxCrossSum);
	}

	private int maxCrossSum(int[] numbers, int start, int mid, int end) {
		int leftSum=0;
		int sum=0;
		for(int i=mid;i>=0; i--){
			sum =sum+numbers[i];
			if(sum>leftSum){
				leftSum=sum;
			}
		}
		int rightSum=0;
		sum=0;
		for(int i=mid+1;i<=end; i++){
			sum =sum+numbers[i];
			if(sum>rightSum){
				rightSum=sum;
			}
		}
		return leftSum + rightSum;
	}

	
	

}
