package pastexam.codewriting;

import java.util.Scanner;

public class Q01 {

	/*
	 * Linear algebra often uses �triangular� arrays. 
	 * An upper triangular array is a square 2D
	 * array with zero values below the diagonal 
	 * and non-zero values at and above it, like:
	 * 
	 *    1 1 1 1 1
	 *    0 1 1 1 1
	 *    0 0 1 1 1
	 *    0 0 0 1 1
	 *    0 0 0 0 1
	 *    
	 * Provide code that will create an n x n
	 * upper triangular array with all non-zero
	 * elements initialized to 1.0.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Array size: ");
		int n = in.nextInt();
		in.close();
		int[][] arr = new int[n][n];
		int y = 0;

		for (int i = 0; i < arr.length; i++){
			for (int x = y; x < arr[0].length; x++){
				arr[i][x] = 1;
			}
			y++;
		}
		for (int i = 0; i < arr.length; i++){
			for (int x = 0; x < arr[0].length; x++){
				System.out.print(arr[i][x]);
			}
	}
}
}
