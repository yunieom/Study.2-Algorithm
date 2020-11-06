package codeUp;

import java.util.Scanner;

public class CodeUp_079 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0 ||  i%6==0 || i%9==0 ) {
				System.out.print("X ");
			}else {
				System.out.printf("%d ", i);
			}
		}
	}	
}