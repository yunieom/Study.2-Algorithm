package codeUp;

import java.util.Scanner;

public class CodeUp_096 {

	public static void main(String[] args)  {
		int n,x,y;
		int[][] a = new int[20][20];
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			x= sc.nextInt();
			y= sc.nextInt();
			a[x][y] = 1;
		}
		for (int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println("");
		}
		
		sc.close();
		
	}	
}