package codeUp;

import java.util.Scanner;

public class CodeUp_033 {

	public static void main(String[] args) {
		
		int n;
		String s;
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		n = Integer.valueOf(s, 16); 
		sc.close();
		
		System.out.printf("%o",n);

	}

}