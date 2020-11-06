package codeUp;

import java.util.Scanner;

public class CodeUp_089 {

	public static void main(String[] args)  {
		int a, d, n;
		int[] ans = new int[100];
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		sc.close();
	
		for(int i=0; i<100; i++) {
				ans[i] = a;
				if(i!=0) {
					a=a+d;
					ans[i] = a;
				}
		}
		System.out.printf("%d ", ans[n-1]);
	}	
}