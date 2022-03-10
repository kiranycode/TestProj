package com.dailybyte.questions;

public class CoinChange {

	public static void main(String[] args) {
		int amount = 5;
		int coins[] = { 1, 2, 5 };
		int[][] matrix = new int[coins.length + 1][amount + 1];
		creatematrix(matrix, coins, amount);
		printMatrix(matrix);
		System.out.println("max ways is " + matrix[coins.length][amount]);

	}

	private static void printMatrix(int[][] matrix) {
		int columns = matrix[0].length;
		int rows = matrix.length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private static void creatematrix(int[][] matrix, int[] coins, int amount) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = 1;
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (j - coins[i - 1] >= 0) {
					matrix[i][j] = matrix[i - 1][j] + matrix[i][j - coins[i - 1]];
				} else {
					matrix[i][j] = matrix[i - 1][j];
				}

			}
		}

	}

}
