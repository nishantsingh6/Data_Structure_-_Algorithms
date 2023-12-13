package Lec_23;

public class Permutation_Without_Duplicate {

	public static void main(String[] args) {

		String str = "abca";
		NoDuplicate(str, "");
	}

	public static void NoDuplicate(String ques, String ans) {
		// Base Case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			boolean flag = true;
			char ch = ques.charAt(i);
			for (int j = i + 1; j < ques.length(); j++) {
				if (ch == ques.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				String ros = (ques.substring(0, i) + ques.substring(i + 1));
				NoDuplicate(ros, ans + ch);
			}
		}
	}
}
