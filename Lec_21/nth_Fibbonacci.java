package Lec_21;

public class nth_Fibbonacci {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(Find(n));
	}

	public static int Find(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = Find(n - 1);
		int f2 = Find(n - 2);
		return f1 + f2;
	}
}
