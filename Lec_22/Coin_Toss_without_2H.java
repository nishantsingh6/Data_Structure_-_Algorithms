package Lec_22;

public class Coin_Toss_without_2H {

	public static void main(String[] args) {
int n=3;
	CoinToss(n,"");	
	}
public static void CoinToss(int n,String ans) {
	if(n==0) {
	System.out.println(ans);
	return;
	}
if(ans.length()==0 || ans.charAt(ans.length() - 1) != 'H') {
	CoinToss(n-1, ans+"H");
}
CoinToss(n-1, ans+"T");
}
}

