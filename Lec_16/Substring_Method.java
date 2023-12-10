package Lec_16;
import java.util.*;
public class Substring_Method {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String str=sc.next();
printsubstring(str);
	}
public static void printsubstring(String str) {
	for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j<=str.length(); j++) {
			System.out.println(str.substring(i, j));
		}
	}
}
}
