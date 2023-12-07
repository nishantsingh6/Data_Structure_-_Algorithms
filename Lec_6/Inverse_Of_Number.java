package Lec_6;
import java.util.*;
public class Inverse_Of_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int ans=0;
  int pos=1;
  while(n>0) {
	  int rem=n%10;
	  ans=(int)(ans+pos*(Math.pow(10, rem-1)));
	  n/=10;
	  pos++;
  }
  System.out.println(ans);
	}

}
