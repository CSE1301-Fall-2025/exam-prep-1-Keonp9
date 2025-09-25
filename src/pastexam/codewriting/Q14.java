package pastexam.codewriting;

import java.util.Scanner;

public class Q14 {

	/*
	 * We wish to write a program that will create 
	 * mirrored arrays. For example, if you were given
	 * the following array:
	 * 
	 * 		1 2 3
	 * 
	 * then your program should create an array that
	 * contains [1, 2, 3, 3, 2, 1].
	 * 
	 * Complete the code below to compute the sum of the columns 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains. It is not necessary
	 * to print the result, creating the appropriate array is enough.
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some data
		//to make sure your solution
		//works properly.
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		int[] mirror = new int[2*data.length];
		int x = data.length-1;

		for (int i = 0; i < mirror.length; i++){
			if (i > data.length-1){
				mirror[i] = data[x];
				x--;
			} else {
				mirror[i] = data[i];
			}
		}
		
	}
}
