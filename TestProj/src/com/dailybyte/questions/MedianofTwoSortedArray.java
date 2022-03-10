package com.dailybyte.questions;

public class MedianofTwoSortedArray {

	public static void main(String[] args) {
		 int [] nums1 = {1};
		 int [] nums2 = {2,3};
		 MedianofTwoSortedArray medianofTwoSortedArray =  new MedianofTwoSortedArray();
		 System.out.println(medianofTwoSortedArray.findMedianSortedArrays(nums1, nums2));

	}

	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 double result =0;		 
		 double [] mergedArray = mergeArray(nums1, nums2);
		 if(mergedArray.length%2==0){
			 result =  (mergedArray[mergedArray.length/2]+mergedArray[(mergedArray.length/2) -1])/2;
		 }else{
			 result  = mergedArray[mergedArray.length/2];
		 }
		 
		 return result;
	        
	 }

	private double[] mergeArray(int[] nums1, int[] nums2) {
		int a1=0;
		int b1=0;
		int newLength = nums1.length+nums2.length;
		double [] tempaArray = new double[newLength];
		for(int i=0; i<=tempaArray.length/2; i++){
			if(a1<nums1.length &&(b1>=nums2.length || nums1[a1]<nums2[b1])){
				tempaArray[i]= nums1[a1++];
			}else{
				tempaArray[i]= nums2[b1++];
			}
		}
		return tempaArray;
	}
}
