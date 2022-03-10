package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		//int numbers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//int numbers[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//int numbers[][] ={{6,4,7}};
		int numbers [][] ={{7},{9},{6}};
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		spiralMatrix.spiralOrder(numbers);
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> spiralOrderList = new ArrayList<Integer>();

		if(matrix.length<=0)
			return spiralOrderList;
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		
		
		while (left <= right && top <= bottom) {
			for (int column = left; column <= right;column++) {
				spiralOrderList.add(matrix[top][column]);
				System.out.print(matrix[top][column] + " ");
			}
			top++;
		
				for (int row = top; row <= bottom; row++) {
					spiralOrderList.add(matrix[row][right]);
					System.out.print(matrix[row][right] + " ");
				}
		
			right--;

			if (top <= bottom ) {
				for (int column = right; column >= left; column--) {
					spiralOrderList.add(matrix[bottom][column]);
					System.out.print(matrix[bottom][column] + " ");
				}
			}

			bottom--;
			if (left <= right) {
				for (int row= bottom; row >= top; row--) {
					spiralOrderList.add(matrix[row][left]);
					System.out.print(matrix[row][left] + " ");
				}
			}
			left++;
		}
		return spiralOrderList;
	}

}
