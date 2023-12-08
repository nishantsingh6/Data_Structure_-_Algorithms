package Lec_10;

public class Bubble_Sort {

	public static void main(String[] args) {
int[] arr= {10,50,66,47,3,14};
Sort(arr);
for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);
}
	}
     public static void Sort(int[] arr) {
    	 for(int pass=1; pass<arr.length; pass++) {
    		 for(int i=0; i<arr.length-pass; i++) {
    			 if(arr[i]>arr[i+1]) {
    				 int temp=arr[i];
    				 arr[i]=arr[i+1];
    				 arr[i+1]=temp;
    			 }
    			
    		 }
    	 }
     }
}
