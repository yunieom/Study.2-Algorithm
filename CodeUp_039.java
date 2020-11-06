package codeUp;

import java.util.Scanner;

public class CodeUp_039 {

	public static void main(String[] args) {
		
		long a;
		long b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		b = sc.nextLong();
		sc.close();
		
		long total = a+b;
		System.out.println(total);

	}

}