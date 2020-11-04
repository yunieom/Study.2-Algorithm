package codeUp;

import java.util.Scanner;

public class CodeUp_058 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a&b);		
	}	
}		