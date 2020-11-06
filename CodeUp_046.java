package codeUp;

import java.util.Scanner;

public class CodeUp_046 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		double d = (double)(a+b+c)/3;

		System.out.println(a+b+c);
		System.out.printf("%.1f", d);
	}	
}