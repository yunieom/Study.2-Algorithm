package codeUp;

import java.util.Scanner;

public class CodeUp_017 {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextLine();
		String[] time = a.split(":");
		 System.out.format("%d:%d\n", Integer.parseInt(time[0]), Integer.parseInt(time[1]));
	}

}
