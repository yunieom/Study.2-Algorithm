package codeUp;

import java.util.Scanner;

public class CodeUp_070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] c = new int[a];
	
		for(int i=0; i<a; i++) {
			c[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j]);
		}
	}	
}