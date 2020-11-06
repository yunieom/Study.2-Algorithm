package codeUp;

import java.util.Scanner;

public class CodeUp_034 {

	public static void main(String[] args) {
		
		int n;
		String b;
		
		Scanner sc = new Scanner(System.in);
		b = sc.nextLine();
		n = Integer.valueOf(b, 8); 
		sc.close();
		
		System.out.printf("%d",n);

	}

}