package Lec_23;

public class MazePath {

	public static void main(String[] args) {
 int n=3;
 int m=3;
	MazePath(n-1, m-1, 0, 0, "");	
	}
public static void MazePath(int er,int ec,int cr,int cc,String ans) {
	//Base Case
	if(cc>ec || cr>er) {
		return;
	}
	if(cc==ec && cr==er) {
	System.out.print(ans+" ");
	return ;
	}
	MazePath(er, ec, cr, cc+1, ans+"H");

	MazePath(er, ec, cr+1, cc, ans+"V");
}
}
