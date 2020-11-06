package codeUp;

import java.util.Scanner;

public class CodeUp_074 {

	public static void main(String[] args) {
		
		int a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
 		
		for(int i=0; i<=a; i++) {
			if(i%2 == 0) 
				sum=sum+i;
		}
		System.out.println(sum);
	}	
}