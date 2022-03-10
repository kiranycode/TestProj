package com.hundreadquestions;

public class SearchMatrix {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 6, 10, 12, 20 }, { 4, 8, 15, 22, 25 }, { 5, 20, 35, 37, 40 }, { 10, 28, 38, 45, 55 } };
		int target = 10;
	//	search(matrix, target, 0, matrix.length, 0, matrix[0].length);

	}

	/*private static void search(int[][] matrix, int target, int startRow, int rowEnd, int startColumn, int endColumn) {
		int rowMid = (startRow + rowEnd) / 2;
		
		if (startRow < rowEnd && startColumn < endColumn) {
			if (matrix[rowMid][columnMid] == target) {
				System.out.println(rowMid + "  " + columnMid);
			} else if (matrix[rowMid][columnMid] < target) {
				search(matrix, target, rowMid + 1, rowEnd, columnMid, rowEnd);
			} else {
				search(matrix, target, startRow, rowMid - 1, startColumn, columnMid);
			}
		} else {
			// System.out.println("Not Found");
		}
	}*/

	private static void searchElementInSortedMatrix(int[][] sortedMatrix, int X) {
		int R = sortedMatrix.length;
		int C = sortedMatrix[0].length;
		int r = 0, c = C - 1;

		// We can go either left or down
		// left => decrement in columns, 0 will be the bound
		// down => increment in row, R-1 will be the bound
		while (r <= R - 1 && c >= 0) {
			if (sortedMatrix[r][c] == X) {
				// Found the element
				System.out.println("Element found at r =" + r + " c=" + c);
				return;
			}
			if (X < sortedMatrix[r][c]) {
				// move left
				c = c - 1;
			} else {
				// move down
				r = r + 1;
			}
		}
		System.out.println("Element is not found in sorted matrix");
	}

}
