package codeUp;

import java.util.Scanner;

public class CodeUp_063 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		if(a%2 == 0) 
			System.out.println(a);
		if(b%2 == 0)
			System.out.println(b);
		if(c%2 == 0)
			System.out.println(c);

	}	
}		