package codeUp;

import java.util.Scanner;

public class CodeUp_041 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		long n = a%b;

		System.out.println(n);
		

	}

}