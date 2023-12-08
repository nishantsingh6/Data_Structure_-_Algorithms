package Lec_8;

public class Global_Variable {
static int val=20;
	public static void main(String[] args) {
		System.out.println("HII");
		int x=23;
		System.out.println(val);
		fun(x);
		System.out.println(val);

	}
	public static void fun(int x) {
		int a=90;
		val=45;
		System.out.println(a);
		System.out.println(val);
	}

}
