package codeUp;

import java.util.Scanner;

public class CodeUp_058 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a==0 && b==0) {
			System.out.println(1);
		}else {
			System.out.println(0);	
		}
	}	
}		