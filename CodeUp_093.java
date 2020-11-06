package codeUp;

import java.util.Scanner;

public class CodeUp_093 {

	public static void main(String[] args)  {
		int n,t;
		int[] a = new int[24];
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			t = sc.nextInt();
			a[t] = a[t]+1;
		}
		for(int i=1; i<=23; i++) {
			System.out.printf("%d ", a[i]);
		}
		sc.close();
		
	}	
}