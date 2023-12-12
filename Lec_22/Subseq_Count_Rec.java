package Lec_22;

public class Subseq_Count_Rec {

	public static void main(String[] args) {
String str="abc";
System.out.println("\n"+SubseqCount(str, ""));
	}
public static int SubseqCount(String str,String ans) {
	if(str.length()==0) {
		System.out.print(ans+" ");
		return 1;
	}
	char ch=str.charAt(0);
	int f1=SubseqCount(str.substring(1), ans);
	int f2=SubseqCount(str.substring(1), ans+ch);
	return f1+f2;
}
}
