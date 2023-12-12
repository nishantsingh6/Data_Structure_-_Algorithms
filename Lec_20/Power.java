package Lec_20;

import java.util.*;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Power(a, b));
	}

	public static int Power(int a, int b) {
		// Base Case
		if (b == 0) {
			return 1;
		}
		// Smaller problem ->(a^b-1);
		int ans = Power(a, b - 1);
		return a * ans;
	}
}
