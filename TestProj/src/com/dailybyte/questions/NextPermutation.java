package com.dailybyte.questions;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		NextPermutation nextPermutation = new NextPermutation();
		nextPermutation.nextPermutation(nums);
		print(nums);
	}

	private static void print(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ,");
		}

	}

	public void nextPermutation(int[] nums) {
		int k = nums.length - 2;
		while (k >= 0 && nums[k] >= nums[k + 1]) {
			k--;
		}
		if (k == -1) {
			reverse(nums, 0, nums.length - 1);
			return;
		}

		for (int l = nums.length - 1; l > k; --l) {
			if (nums[l] > nums[k]) {
				// swap
				int temp = nums[l];
				nums[l] = nums[k];
				nums[k] = temp;
				break;
			}
			
		}
		reverse(nums, k + 1, nums.length - 1);
	}

	private void reverse(int[] nums, int i, int j) {
		while (i < j) {
			int temp = nums[i];
			nums[i++] = nums[j];
			nums[j--] = temp;
		}
	}

}
