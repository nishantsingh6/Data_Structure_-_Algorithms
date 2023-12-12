package Lec_21;

public class First_Occurance_BruteForce {

	public static void main(String[] args) {
int[] arr= {10,20,7,5,6,8,8,7};
int element=7;
System.out.println(first(arr, element));
	}
	public static int first(int[] arr,int element) {
for(int i=0; i<arr.length; i++) {
	if(arr[i]==element) {
		return i;
	}
}
return -1;
	}

}
