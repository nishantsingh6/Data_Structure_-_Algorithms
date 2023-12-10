package Lec_14;

public class Matrix_Search_BruteForce {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(Search(arr, 50));
	}

	public static int Search(int[][] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == item) {
					return 1;
				}
			}
		}
		return 0;
	}
}
