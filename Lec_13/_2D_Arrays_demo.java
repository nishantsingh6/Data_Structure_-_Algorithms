package Lec_13;
import java.util.*;
public class _2D_Arrays_demo {

	public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
		int [][] arr=new int[3][4];
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		int [][] brr=new int[3][];
		System.out.println(arr[2]);
		int[][] other=arr;
		System.out.println(other);
		
	//row
		System.out.println(arr.length);
		
		//col
		System.out.println(arr[0].length);
	}

}
