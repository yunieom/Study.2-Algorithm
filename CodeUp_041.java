package codeUp;

import java.util.Scanner;

public class CodeUp_041 {

	public static void main(String[] args) {
		
		char s;
		
		Scanner sc = new Scanner(System.in);
		s = sc.next().charAt(0);
		sc.close();
		char d = (char) (s+1);
		
		System.out.println(d);
		

	}

}