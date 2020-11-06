package codeUp;

import java.util.Scanner;

public class CodeUp_066 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		int[] n = {a,b,c};
		
		for (int i=0; i<n.length; i++) {
			if(n[i]%2 ==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
		
		/*
		if(a%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
			
		if(b%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
			
		if(c%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		*/

	}	
}		