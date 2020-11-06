package codeUp;

import java.util.Scanner;

public class CodeUp_091 {

	public static void main(String[] args)  {
		long a, r, d;
		int n;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		r= sc.nextLong();
		d= sc.nextLong();
		n = sc.nextInt();
		sc.close();
		long[] ans = new long[n];
	
		for(int i=0; i<n; i++) {
				ans[i] = a;
				if(i!=0) {
					a=a*r+d;
					ans[i] = a;
				}
		}
		System.out.println(ans[n-1]);
		
	}	
}