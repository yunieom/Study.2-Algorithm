package codeUp;

import java.util.Scanner;

public class CodeUp_022 {

	public static void main(String[] args) {
		
		String a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine();
		sc.close();
		String[] time = a.split("[.]");
		System.out.println(Integer.parseInt(time[0]));
		System.out.println(Integer.parseInt(time[1]));
	}

}
