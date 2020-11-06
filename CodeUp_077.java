package codeUp;

import java.util.Scanner;

public class CodeUp_077 {

	public static void main(String[] args) {
		
		int n,m;
		int i,j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		for(i=1; i<=n; i++)
			for(j=1;j<=m; j++)
				System.out.printf("%d %d \n", i, j);
	}	
}