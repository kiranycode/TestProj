package com.dailybyte.questions;

public class RotateArray {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate(nums, k);
		rotateArray.print(nums);
	}

	
	
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		
		reverseArray(nums, 0,nums.length-1);
		print(nums);
		reverseArray(nums, 0,k-1);
		print(nums);
		reverseArray(nums, k,nums.length-1);
		print(nums);
		
	}

	private void reverseArray(int[] nums, int i, int j) {
		
		while(i<j){
			int temp =nums[i];
			nums[i++]=nums[j];
			nums[j--]=temp;
		}
		
	}

	private void print(int[] nums) {
		for(int i=0;i<nums.length; i++){
			System.out.print(nums[i]+",");
		}
		System.out.println();
	}
}