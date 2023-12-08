package Lec_10;

public class Selection_sort {

	public static void main(String[] args) {
int[] arr= {50,62,47,5,24,16,98};
Sort(arr);
for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);
}
	}
public static void Sort(int[] arr) {
	for(int i=0; i<arr.length; i++) {
		int min=i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}		
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;

	}
}
}
