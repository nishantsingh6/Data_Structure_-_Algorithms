package Lec_23;

public class Keypad {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		String str = "12";
		Keypad(str, "");
	}

	public static void Keypad(String ques, String ans) {
		// Base Case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		// First we find what we want to press
		char ch = ques.charAt(0);
		// When we press then it will get in AASCI value so we change here into keypad
		// number
		String pressString = key[ch - 48];
		for (int i = 0; i < pressString.length(); i++) {
			Keypad(ques.substring(1), ans + pressString.charAt(i));
		}
	}
}
