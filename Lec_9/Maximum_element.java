package Lec_9;
import java.util.*;
public class Maximum_element {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
   int[] arr=new int[n];
   for(int i=0; i<arr.length; i++) {
	   arr[i]=sc.nextInt();
   }
   System.out.println(maxvalue(arr));

}
public static int maxvalue(int[] arr) {
	int max=arr[0];
for(int i=1; i<arr.length; i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
return max;
}
}
