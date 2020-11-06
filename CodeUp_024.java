package codeUp;

import java.util.Scanner;

public class CodeUp_024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		for (int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			System.out.println("'"+c+"'");
		}
	}

}
