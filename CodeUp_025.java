package codeUp;

import java.util.Scanner;

public class CodeUp_025 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		String[] c = b.split(":");
	
		System.out.printf("%d", Integer.parseInt(c[1]));

	}

}