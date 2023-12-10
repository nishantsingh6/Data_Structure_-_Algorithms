package Lec_14;

public class Matrix_Search_Optimized {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
System.out.println(Search(arr, 88));
	}
public static int Search(int[][]arr,int item) {
	int row=0;
	int col=arr[0].length-1;
	while(col >=0 && row<arr.length) {
		if(arr[row][col]==item) {
			return 1;
		}else if(arr[row][col] > item) {
			col--;
		}else {
			row++;
		}
	}
	return 0;
}
}
