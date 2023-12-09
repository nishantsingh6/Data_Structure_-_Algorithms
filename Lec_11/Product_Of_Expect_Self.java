package Lec_11;
import java.util.*;
public class Product_Of_Expect_Self {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[] arr=new int [n];
		  for(int i=0; i<arr.length; i++) {
			  arr[i]=sc.nextInt();
		  }
int[] ans=productArray(arr);
for(int i=0; i<ans.length; i++) {
	System.out.print(ans[i]+" ");
}
	}
	public static int[] productArray(int[] arr) {
	int	n=arr.length;
	//Create two array to store our left side multiples and right side multiples 
		int[] left=new int[n];  
		int[] right=new int[n];
		left[0]=1;
		for(int i=1; i<n; i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int i=n-2; i>=0; i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0; i<right.length; i++) {
			arr[i]=left[i]*right[i];
		}
		return arr;
	}

}
