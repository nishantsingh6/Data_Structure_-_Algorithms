package Lec_20;
import java.util.*;
public class Print_Increasing_Order {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
PI(n);
		
	}
public static void PI(int n) {
	//Base Case
	if(n==0) {
		return ;
	}
	PI(n-1);
	System.out.println(n);
}
}
