package Lec_16;
import java.util.*;
public class isPalindrome {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String str=sc.next();
printsubstring(str);

	}
public static void printsubstring(String str) {
	for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j<=str.length(); j++) {
			String s1=str.substring(i, j);
			if(ispalindrome(s1)==true) {
				System.out.println(s1);
			}
		}
	}
}
public static boolean ispalindrome(String s) {
	int si=0;
	int ei=s.length()-1;
	while(si<ei) {
		if(s.charAt(si)!=s.charAt(ei)){
			return false;
		}
		si++;
		ei--;
	}
	return true;
}
}
