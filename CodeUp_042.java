package codeUp;

import java.util.Scanner;

public class CodeUp_042 {

	public static void main(String[] args) {
		
		long n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		sc.close();

		System.out.printf("%d", ++n);
	}

}