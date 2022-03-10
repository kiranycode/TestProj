package com.questions;

public class RemoveDuplicates {

	// Given a sorted array nums, remove the duplicates in-place such that each
	// element appears only once and returns the new length.
	// Do not allocate extra space for another array, you must do this by
	// modifying the input array in-place with O(1) extra memory.

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2 };

		RemoveDuplicates removeDuplicates = new RemoveDuplicates();

		System.out.println(removeDuplicates.removeDuplicates(numbers));
	}

	public int removeDuplicates(int[] nums) {

		int cnt = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[cnt]) {
				cnt++;
				nums[cnt] = nums[i];
			}
		}
		return cnt + 1;
	}

}
