package Lec_20;

public class Print_Dec_Order {

	public static void main(String[] args) {
int n=5;
PD(5);
	}
public static void PD(int n) {
	//Base case
	if(n==0) {
		return ;
	}
	System.out.println(n);
	PD(n-1);
	}
}

