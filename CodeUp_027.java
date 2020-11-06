package codeUp;

import java.util.Scanner;

public class CodeUp_027 {

	public static void main(String[] args) {
		
		String a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine();
		sc.close();
		String[] date = a.split("[.]");
		System.out.format("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]),Integer.parseInt(date[0]));

	}

}