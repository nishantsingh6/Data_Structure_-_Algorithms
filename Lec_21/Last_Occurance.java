package Lec_21;

public class Last_Occurance {

	public static void main(String[] args) {
int [] arr= {10,70,30,50,60,30,40};
int n=30;
System.out.println(Last(arr,arr.length-1, n));
	}
public static int Last(int [] arr,int i,int n ) {
	if(i==arr.length) {
		return -1;
	}
	if(arr[i]==n) {
		return i;
	}
	return Last(arr,i-1,n);
}
}
