package codeUp;

import java.util.Scanner;

public class CodeUp_018 {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine();
		String[] date = a.split("[.]");
		System.out.format("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]),Integer.parseInt(date[2]));
	}

}
