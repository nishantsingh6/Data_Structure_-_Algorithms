package Lec_20;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//Bigger problem is find to n factorial
System.out.println(Fatorial(n));
	}
public static int Fatorial(int n) {
	//Base Case 
	if(n==1) {
		return 1;
	}
	//Smaller Problem is find factorial (n-1);
	int fn=Fatorial(n-1);
	return fn*n;
}
}
