package Lec_4;
import java.util.concurrent.*;
public class Reverse {

	public static void main(String[] args) {
	int n=4563;
	int ans=0;
  while(n>0) {
	  ans=ans*10+n%10;
	  
	  n=n/10;
  }
  System.out.println(ans);
	}

}
