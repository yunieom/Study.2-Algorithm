package codeUp;

import java.util.Scanner;

public class CodeUp_014 {

	public static void main(String[] args) {
		char x,y;
		Scanner sc = new Scanner(System.in);
		
		x = sc.next().charAt(0);
		y = sc.next().charAt(0);
		sc.close();
		System.out.printf("%c %c", y, x);
	}

}
