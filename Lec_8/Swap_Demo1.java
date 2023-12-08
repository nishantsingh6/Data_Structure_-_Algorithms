package Lec_8;

public class Swap_Demo1 {

	public static void main(String[] args) {
int[] arr= {10,20,30,40,50};
System.out.println(arr[0]+" "+arr[1]);
swap(0, 1);
System.out.println(arr[0]+" "+arr[1]);
	}
public static void swap(int i,int j) {
	int temp=i;
	i=j;
	j=temp;
}
}
