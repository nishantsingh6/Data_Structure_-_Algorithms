package Lec_13;
import java.util.*;
public class Input_and_Output {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][] arr=new int[n][m];

//FOR INPUT

for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[0].length; j++) {
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[0].length; j++) {
		System.out.print(arr[i][j]+" ");
	}
}
System.out.println();	

	}

}
