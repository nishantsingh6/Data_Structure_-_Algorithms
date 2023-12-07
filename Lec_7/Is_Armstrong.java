package Lec_7;
import java.util.*;
public class Is_Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
System.out.println(isArmastrong(n));
	}
	public static int  countdigit(int n) {
		int count =0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}
public static boolean isArmastrong(int n) {
	int d=countdigit(n);
	int ans=0;
	int temp=n;
	while(n>0) {
		int rem=n%10;
		ans+=Math.pow(rem, d);
		n/=10;
	}if(ans==temp) {
		return true;
	}else {
		return false;
	}
}
}
