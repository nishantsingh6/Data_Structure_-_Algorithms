package Lec_30;

public class StringBuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder("Hello");
//16+5(String length)=21
//System.out.println(sb.capacity());
//StringPrint();
StingBuilder();
	}
	public static void StringPrint() {
		String s="";
		for(int i=1; i<= 10000; i++) {
			s=s+i;
		}
		System.out.println(s);
	}
	
	public static void StingBuilder() {
		StringBuilder s=new StringBuilder();
		for(int i=1; i<=10000; i++) {
			s=s.append(i);
		}
		System.out.println(s);
	}

}
