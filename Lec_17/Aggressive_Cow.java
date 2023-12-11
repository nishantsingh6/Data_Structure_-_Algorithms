package Lec_17;
import java.util.*;
public class Aggressive_Cow {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int t=sc.nextInt();
while(t-- >0) {
	int nos=sc.nextInt();   //Number Of Stall 
	int noc=sc.nextInt();   //Number Of Cows
	int[] stall=new int[nos];
	for(int i=0; i<stall.length; i++) {
		stall[i]=sc.nextInt();
	}
	Arrays.sort(stall);
	System.out.println(LargestDistance(stall, noc));
}
	}
	public static int LargestDistance(int[] stall,int noc) {
		int lo=0;
		int hi=stall[stall.length-1]-stall[0];   //9
		int ans=0;
		while(lo<=hi) {
			int mid =(lo+hi)/2;
			if(isitpossible(stall,mid,noc)==true) {
				ans=mid;
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		return ans;
	}
public static boolean isitpossible(int[] stall,int mid,int noc) {
	int cows=1;  //Count Of Cows
	int position=stall[0];
	int i=0;
	while(i<stall.length) {
		if(stall[i]-position >= mid) {
			cows++;
			position=stall[i];
		}if(cows==noc) {
			return true;
		}
		i++;
	}
	return false;
}
}
