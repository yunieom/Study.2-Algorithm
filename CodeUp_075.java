package codeUp;

import java.util.Scanner;

public class CodeUp_075 {

	public static void main(String[] args) {
		
		char a;
		Scanner sc = new Scanner(System.in);
		
		
 		
		while(true) {
			a = sc.next().charAt(0);
			if(a=='q')
				break;
			System.out.println(a);
		}
		System.out.println("q");
		
		sc.close();
	}	
}