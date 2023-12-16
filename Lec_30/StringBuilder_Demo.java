package Lec_30;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
//To add any string
		sb.append("Hello");
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(2,5));
		System.out.println(sb);
		System.out.println(sb.length());
		sb=sb.reverse();
		System.out.println(sb);
		sb.append("Hellooo");
		sb.append("HelloHelloHelloooo");
		System.out.println(sb.length());
		//StringBuilder To String
		String s=sb.toString();
		System.out.println(sb.capacity());
	}

}
