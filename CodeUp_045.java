package codeUp;

import java.util.Scanner;

public class CodeUp_045 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();

		System.out.printf("%d", a<<1 ); // a=1024 일시 2048 출력 
	}	
}