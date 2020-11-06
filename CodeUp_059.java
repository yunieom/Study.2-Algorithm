package codeUp;

import java.util.Scanner;

public class CodeUp_059 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", ~a);		
	}	
}		