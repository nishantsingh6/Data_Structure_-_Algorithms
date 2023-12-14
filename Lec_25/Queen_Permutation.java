package Lec_25;

public class Queen_Permutation {

	public static void main(String[] args) {
//we take a board of boolean in which have by default false value.
		boolean[] board = new boolean[4];
		int n = 2; // Number of queen
		Queen(board, n, 0, "");
	}

	public static void Queen(boolean[] board, int tq, int qpsf, String ans) {
		// tq--total queen
		// qpsf--Queen place so far
		// Base case
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Queen(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
				board[i] = false; // undo
			}
		}
	}

}
