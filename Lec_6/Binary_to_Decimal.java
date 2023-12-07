package Lec_6;

public class Binary_to_Decimal {
public static void main(String[] args) {
	int n=10010;
	int mult=1;
	int ans=0;
	while(n>0) {
		int rem=n%10;
		ans=ans+rem*mult;
		mult=mult*2;
		n/=10;
	}
	System.out.println(ans);
}
}
