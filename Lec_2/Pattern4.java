package Lec_2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int ns = n - 1; // Number of Space
		while (row <= n) {
			// Space
			int i = 1;
			while (i <= ns) {
				System.out.print("  ");
				i++;
			}
			// Star
			int j = 1;
			while (j <= nst) {
				System.out.print("*" + " ");
				j++;
			}
			ns--;
			nst++;
			row++;
			System.out.println();
		}
	}

}
