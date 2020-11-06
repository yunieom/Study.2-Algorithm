package codeUp;

import java.util.Scanner;

public class CodeUp_062 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", (a>b ? b:a) > c ? c : (a>b ? b:a));		
	}	
}		