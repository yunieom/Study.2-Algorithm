package codeUp;

import java.util.Scanner;

public class CodeUp_045 {

	public static void main(String[] args) {
		
		int a,b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		c = (double)a/b;
		

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f",c);
	}	
}