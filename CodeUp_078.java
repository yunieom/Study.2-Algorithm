package codeUp;

import java.util.Scanner;

public class CodeUp_078 {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(16);
		sc.close();
		
		for( i=1; i<16; i++) {
			System.out.printf("%X*%X=%X \n", n, i, n*i);
		}
		
	}	
}