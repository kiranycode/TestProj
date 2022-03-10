package com.dailybyte.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int numbers [] ={2,7,11,15};
		TwoSum twoSum = new TwoSum();
		
		//print(twoSum.twoSum(numbers, 9));
		int nums [] ={1, 2, 3, 8};
		
		System.out.println(twoSum.isTwoSum(numbers, 9));
		System.out.println(twoSum.isTwoSum(nums, 10));
		
	}
	
	 private static void print(int[] twoSum) {
		for(int i :twoSum){
			System.out.print(i +",");
		}
		System.out.println();
	}

	public int[] twoSum(int[] nums, int target) {
		 int result []= new int[2];
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i=0; i<nums.length; i++){
			 int element= target-nums[i];
			 if(map.containsKey(element)){
				 result[0]=i;
				 result[1]=map.get(element);
				 return result;
			 }else{
				 map.put(nums[i], i);
			 }
		 }
		 return result;
	  }
	
	public boolean isTwoSum(int[] nums, int target) {		
		int left=0;
		int right = nums.length-1;
		boolean result = false;
		
		while(left<right){
			if(nums[left]+nums[right]==target){
				return true;
			}else if (nums[left]+nums[right]>target){
				right--;
			}else{
				left++;
			}
		}		
		return result;
	}
		 
}
