package com.questions;

public class LongestFibonacciSubsequence {

	public static void main(String[] args) {
		int nums[] = { 3, 4, 5, 6, 7, 8, 11, 12, 16, 17, 19, 20 };

		LongestFibonacciSubsequence longestFibonacciSubsequence = new LongestFibonacciSubsequence();
		// System.out.println(longestFibonacciSubsequence.lenLongestFibSubseq(nums));
		System.out.println(longestFibonacciSubsequence
				.lenLongestFibSubseq(new int[] { 2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50 }));

	}

	public int lenLongestFibSubseq(int[] A) {
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			int startNum = A[i];
			int j = i + 1;
			boolean cnJLoop = true;
			// while (cnJLoop) {
			int tempCnt = getLongestFibSeq(A, startNum, j, cnt);
			if (tempCnt > cnt) {
				cnt = tempCnt;
			}
			// }
		}
		return cnt;
	}

	private int getLongestFibSeq(int[] a, int startNum, int secIndex, int cnt) {
		int j =secIndex;
		while (j < a.length) {
			System.out.println(startNum + "              " + a[j]);
			int checkNumer = startNum + a[j];
			if (a[j] == checkNumer) {
				if (cnt == 0) {
					cnt = 3;
				} else {
					cnt++;
				}
				getLongestFibSeq(a, a[secIndex], j, cnt);
			} else if (a[j] > checkNumer) {
				getLongestFibSeq(a, startNum, j++, 0);
			} else {
				j++;
			}
		}
		return cnt;
	}

}
