package Lec_26;

public class Coin_Combination {
public static void main(String[] args) {
	int[] coin= {2,3,5,6};
	int amount=10;
	PrintCombination(coin, amount, "",0 );
}
public static void PrintCombination(int[] coin,int amount,String ans,int idx) {
	//Base case 
	if(amount==0) {
		System.out.println(ans);
		return;
	}
	for(int i=idx; i<coin.length; i++) {
		if(amount>=coin[i]) {
			PrintCombination(coin, amount-coin[i], ans+coin[i], idx);
		}
	}
}
}
