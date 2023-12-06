package Lec_3;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int nst=1;
		while(row <= n) {
			//Space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			space--;
			row++;
			nst=nst+2;
			System.out.println();
		}

	}

}
