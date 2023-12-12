package Lec_21;

public class First_Occurance {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 8, 6, 9, 54 };
		int item = 6;
		System.out.println(FirstOcc(arr, 0, item));
	}

	public static int FirstOcc(int[] arr, int idx, int item) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return FirstOcc(arr, idx + 1, item);

	}
}
