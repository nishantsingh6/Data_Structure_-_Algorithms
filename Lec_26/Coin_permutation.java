package Lec_26;

public class Coin_permutation {
public static void main(String[] args) {
	int[] coin= {2,3,5,6};
	int n=10;
	Coin(coin, n, "");
}
public static void Coin(int[] arr,int ta,String ans) {
	if(ta==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0; i<arr.length; i++) {
		if(ta>=arr[i]) {
			Coin(arr, ta-arr[i], ans+arr[i]);
		}
	}
}
}
