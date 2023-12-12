package Lec_22;

public class Subseq_Count1 {
	static int count = 0;

	public static void main(String[] args) {
		String str = "abc";
		SubSeqCount(str, "");
		System.out.println(count);
	}

	public static void SubSeqCount(String ques, String ans) {
		// Base Case
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		SubSeqCount(ques.substring(1), ans);
		SubSeqCount(ques.substring(1), ans + ch);
	}
}
