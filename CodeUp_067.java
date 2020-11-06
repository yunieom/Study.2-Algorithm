package codeUp;

import java.util.Scanner;

public class CodeUp_067 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		

		if(a>0) {
			System.out.println("plus");
			if(a % 2 ==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("minus");
			if(a % 2 ==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		} 
		
	}	
}		