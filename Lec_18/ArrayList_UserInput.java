package Lec_18;

import java.util.*;

public class ArrayList_UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
//For Input 
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		// For Print
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
