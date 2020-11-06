package codeUp;

import java.util.Scanner;

public class CodeUp_068 {

	public static void main(String[] args) {
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		sc.close();
		
		
			if (score >= 90) {
				System.out.println("A");
			}else if (score >= 70   ) {
				System.out.println("B");
			}else if (score >= 40) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
 	
	}	
}		