package Lec_9;

public class Rotate_Array_Reversal_Algo {

	public static void main(String[] args) {
int[] arr= {10,20,30,40,50,60,70};
int k=3;
Rotate(arr, k);
for(int i=0; i<arr.length; i++) {
	System.out.print(arr[i]+" ");
}
	}
	public static void Rotate(int[] arr, int k) {
		 k=k%arr.length;
		reverse(arr, arr.length-k , arr.length-1);
		reverse(arr, 0, arr.length-k-1);
		reverse(arr, 0, arr.length-1);
	}
public static void reverse(int[] arr,int i ,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
}
}
