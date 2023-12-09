package Lec_12;

public class Binary_Search {

	public static void main(String[] args) {
int[] arr= {14,17,19,20,23,25,27,30,33,35};
System.out.println(BinarySearch(arr, 33));
	}
public static int BinarySearch(int[] arr,int item) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==item) {
			return mid;
		}else if(arr[mid]>item){
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return -1;
}
}
