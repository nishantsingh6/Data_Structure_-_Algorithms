package Lec_23;

public class Permutation {

	public static void main(String[] args) {
  String str="abc";
  PrintPermutation(str, "");
	}
public static void PrintPermutation(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return ;
	}
	for(int i=0; i<ques.length(); i++) {
		char ch=ques.charAt(i);
		String ros=ques.substring(0,i)+ques.substring(i+1);
		PrintPermutation(ros, ans+ch);
	}
}
}
