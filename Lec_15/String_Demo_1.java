package Lec_15;

public class String_Demo_1 {

	public static void main(String[] args) {
   String str="hello"; //Create in Heap memory but inside the StringPool OR InternPool 
   String str1="hello"; //Locate same address in InternPool
		System.out.println(str);
		String s=new String("hello");  //Create in Heap memory but outside the StringPool 
		String st=new String ("hello"); // Create new address in Heap memory outside the Pool
		System.out.println(st);
		String s1=str+"bye";  //Create in Heap Memory outside the pool
		System.out.println(s1);
	}

}
