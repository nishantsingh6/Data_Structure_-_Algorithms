package Lec_13;

import java.util.*;

public class Jagged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Row
		int[][] arr = new int[n][];
		// For Input

		for (int i = 0; i < arr.length; i++) {
			int c = sc.nextInt(); // Column
			arr[i] = new int[c];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Print
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
	}

}
