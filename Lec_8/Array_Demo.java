package Lec_8;

public class Array_Demo {

	public static void main(String[] args) {
  int [] arr=new int[5];
  System.out.println(arr);
  
 //Get
  System.out.println(arr[0]);
  System.out.println(arr[1]);
  System.out.println(arr[2]);
  System.out.println(arr[3]);
  System.out.println(arr[4]);
  
  
 // Set
  arr[0]=10;
  arr[1]=20;
  arr[2]=30;
  arr[3]=40;
  arr[4]=50;
  System.out.println(arr[0]);
  System.out.println(arr[1]);
  System.out.println(arr[2]);
  System.out.println(arr[3]);
  System.out.println(arr[4]);
  
  for(int i=0; i<arr.length; i++) {
	  System.out.print(arr[i]+" ");
  }
  System.out.println(); //For next line
	}

}
