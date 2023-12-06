package Lec_2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*" + " ");
				cst++;
			}
			nst = nst + 1;
			row++;
			System.out.println();
		}
	}

}
