package programmers;

import java.util.Scanner;

public class Programmers_Lv1_033 {
	public static void main(String[] args) {
		
		// 직사각형 별찍기

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
