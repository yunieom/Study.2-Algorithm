package codeUp;

import java.util.Scanner;

public class CodeUp_028 {

	public static void main(String[] args) {
		
		double d;
		Scanner sc = new Scanner(System.in);
		d = sc.nextDouble();
		sc.close();
		
		System.out.println(String.format("%.11f", d));

	}

}