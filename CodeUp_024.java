package codeUp;

import java.util.Scanner;

public class CodeUp_024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		sc.close();
		char[] c2 = new char[5];
		
		for(int i=0; i<b.length(); i++) {
			char c = b.charAt(i);
			c2[i]=c;
			}
		System.out.println("["+c2[0]+"0000"+"]");
		System.out.println("["+c2[1]+"000"+"]");
		System.out.println("["+c2[2]+"00"+"]");
		System.out.println("["+c2[3]+"0"+"]");
		System.out.println("["+c2[4]+"]");
		
	}

}
