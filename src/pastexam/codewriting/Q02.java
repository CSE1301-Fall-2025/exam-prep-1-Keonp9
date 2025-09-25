package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter width:");
		double w = in.nextDouble();
		System.out.println("Enter height:");
		double h = in.nextDouble();
		double area = w*h;
		System.out.println("Area is " + area);

		while (area != 0){
			System.out.println("Enter width:");
			w = in.nextDouble();
			System.out.println("Enter height:");
			h = in.nextDouble();
			area = w*h;
			System.out.println("Area is " + area);
		}

		
	}
}
