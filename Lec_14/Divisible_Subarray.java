package Lec_14;
import java.util.*;
public class Divisible_Subarray {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-- >0) {
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(Goodsubarray(arr));
}
	}
	public static long Goodsubarray(int[] arr) {
		int n=arr.length;
		int[] freq=new int[n];
		freq[0]=1;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			sum=sum%n;
			if(sum<0) {
				sum=sum+n;
			}
			freq[sum]=freq[sum]+1;
		}
		long ans=0;
		for(int i=0; i<arr.length; i++) {
			if(freq[i]>=2) {
				ans=ans+(freq[i]*(freq[i]-1))/2;
			}
		}
		return ans;
	}

}
