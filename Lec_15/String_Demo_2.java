package Lec_15;

public class String_Demo_2 {

	public static void main(String[] args) {
		String str="hello";
		String str1="hello";
		String st=new String("hello");
		String st1=new String("hello");
		System.out.println(str==st); //Compare Address
		//.equals() method is used to compare value in string;
		System.out.println(str.equals(st1));
		
		System.out.println(str==str1);
		System.out.println(st==st1);

	}

}
