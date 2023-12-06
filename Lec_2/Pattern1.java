package Lec_2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n; // Number Of Star
		while (row <= n) {

			int cst = 1; // Count Of Star
			while (cst <= nst) {
				System.out.print("*" + " ");
				cst++;
			}
			row++;
			System.out.println();
		}
	}

}
