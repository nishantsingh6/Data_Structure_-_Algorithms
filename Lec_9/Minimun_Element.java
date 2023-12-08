package Lec_9;

public class Minimun_Element {

	public static void main(String[] args) {
int[] arr= {10,50,-41,20,-84,90,-45,-11};
System.out.println(minimum(arr));
	}
public static int minimum(int[] arr){
	int min=arr[0];        //Take first index value as minimum value 
	for(int i=1; i<arr.length; i++) {    //We starting loop to 1 because our first value is minimum value  
		if(arr[i]<min) {          // We compare here   -5 < 10 condition true then we update min value
			min=arr[i];
		}
	}
	return min;       //If condition is false then we print min value 
}
}
