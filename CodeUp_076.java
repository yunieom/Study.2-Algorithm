package codeUp;

import java.util.Scanner;

public class CodeUp_076 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
 		
		for(char a='a'; a<=c; a++) {
			System.out.print(a+" ");
		}
		sc.close();
	}	
}