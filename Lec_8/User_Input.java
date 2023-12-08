package Lec_8;
import java.util.*;
public class User_Input {

	public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
	int n=sc.nextInt();  // n is size of array
	int[] arr=new int[n];  //Create an array of n size
	for(int i=0; i<arr.length; i++) {     //Create a loop for travel all index
		arr[i]=sc.nextInt();       // Put the value in array
	}
	for(int i=0; i<arr.length; i++) {
	System.out.print(arr[i]+" ");
		}
	}
}
