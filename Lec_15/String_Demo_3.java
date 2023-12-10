package Lec_15;

public class String_Demo_3 {
public static void main(String[] args) {
	String str="Nishant";
	
//.charAt(i) method is used to find index value in String.
	System.out.println(str.charAt(0));

//.substring(i,j) method is used to find string in range.
	//i=starting index;
	//j=ending index;
	System.out.println(str.substring(0,4));
	
//.substring(i) method is used to print all value to after the given index value;
	System.out.println(str.substring(4));
	
	System.out.println(str.substring(1,1)); //Nothing Print.
	
	String s1=str.substring(0, 4);
	//.concat() method is used to add the value in string.
	System.out.println(str.concat(s1));
	String s2="ab";
	//.compareTo() method is used to compare string dictionary wise.
	System.out.println(str.compareTo(s2));
}
}
