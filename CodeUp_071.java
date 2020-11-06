package codeUp;

import java.util.Scanner;

public class CodeUp_071 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			a = sc.nextInt();
			
			if(a==0)
				break;
			System.out.println(a);
		}
		sc.close();
	}	
}		