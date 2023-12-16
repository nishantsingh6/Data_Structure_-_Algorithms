package Lec_28;

import java.util.Scanner;

public class Rat_Chases_its_cheese {
  static boolean f=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] maze=new char[n][m];
		for(int i=0; i<maze.length; i++){
			String str=sc.next();
			for(int j=0; j<str.length(); j++){
		   maze[i][j]=str.charAt(j);
			
		}
		}
		int[][] ans=new int[n][m];
		Path(maze,0,0,ans);
      if( f==false) {
       System.out.println("NO PATH FOUND");
      }
}

	public  static void Path(char[][] maze, int cr, int cc, int[][] ans) {
		
		if(cc==maze[0].length-1 && cr==maze.length-1) {
			if(maze[cr][cc]=='O') {
				f=true;
			ans[cr][cc]=1;
			display(ans);
			ans[cr][cc]=0;
			}
			return;
		}
		if(cc <0 || cc >= maze[0].length || cr<0 || cr>=maze.length || maze[cr][cc]=='X' ) {
			return ;
		}
		int[] r= {0,-1,0,1};
		int[] c= {1,0,-1,0};
		//Mark visited
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		for(int k=0; k < c.length; k++) {
			Path(maze, cr+r[k], cc+c[k], ans);
		}
		//Backtrack here
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	public static void display(int[][] ans) {
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}