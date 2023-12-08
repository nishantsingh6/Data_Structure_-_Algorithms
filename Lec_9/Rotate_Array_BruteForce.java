package Lec_9;

public class Rotate_Array_BruteForce {

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
	for(int j=1; j<=k; j++) {
	int temp=arr[arr.length-1];
	for(int i=arr.length-2; i>=0; i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
}
}
}
