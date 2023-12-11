package Lec_18;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		Integer a = 100; // Integer is here Wrapper Class
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Short s1 = 78;
		Byte b1 = 90;
		System.out.println(s1);
		System.out.println(b1);
//AutoBoxing -When we put data type to wrapper class    
		a = a1;
		System.out.println(a);

//Unboxing - Wrapper class to date type
		Integer ii = 100;
		int i = 50;
		i = ii;
		System.out.println(i);

//Important 

		Integer n1 = 19;
		Integer n2 = 19;
//Print true because Integer Cache the range  of it -128-127 , 19 in the range so it's locate on same address then it print  true;  
		System.out.println(n1 == n2);

		Integer n3 = 190;
		Integer n4 = 190;
		System.out.println(n3 == n4);// Out of range so both are create on another another address

	}

}
