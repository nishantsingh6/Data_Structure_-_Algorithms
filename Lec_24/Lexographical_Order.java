package Lec_24;

public class Lexographical_Order {

	public static void main(String[] args) {
		int n = 100;
		Lexo(0, n);
	}

	public static void Lexo(int curr, int end) {
		// Base Case
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Lexo(curr * 10 + i, end);
		}
	}
}
