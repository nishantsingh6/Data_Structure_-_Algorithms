package Lec_24;

public class Tower_of_Hanoi {

	public static void main(String[] args) {

		int n = 5; // Number Of Plates
		Tower(n, "A", "B", "C");
	}

	public static void Tower(int n, String s, String h, String d) {
		// Base case
		if (n == 0) {
			return;
		}
// Transfer n-1 disk source rod to helper rod using destination rod as a helper rod
		Tower(n - 1, s, d, h);
		// Here we transfer nth disk to source rod to destination rod and print moves
		System.out.println("Move " + n + " th Disk from " + s + " to " + d);
// Transfer n-1 disk helper rod to destination rod using source rod as a helper rod
		Tower(n - 1, h, s, d);
	}
}
