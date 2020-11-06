package codeUp;

import java.util.Scanner;

public class CodeUp_053 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		
		if(a==0) {
			System.out.println(1);
		}else {
			System.out.println(0);	
		}
	}	
}		