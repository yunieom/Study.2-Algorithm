package codeUp;

import java.util.Scanner;

public class CodeUp_019 {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine();
		String[] date = a.split("[-]");
		System.out.print(date[0]+date[1]);
	}

}
