package Lec_3;

import java.util.Scanner;

public class Pattern_13 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int row=1;
	int star=1;
	while(row<=n*2-1) {
		//star
		int i=1;
		while(i<=star) {
			System.out.print("*"+" ");
			i++;
		}
		//next row
		//mirror
		if(row<n) {
			star++;
		}else {
			star--;
		}
		row++;
		System.out.println();
		
	}
}
}
