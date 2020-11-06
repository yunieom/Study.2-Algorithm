package codeUp;

import java.util.Scanner;

public class CodeUp_086 {

	public static void main(String[] args)  {
		long r,g,b;
		float memory = 0;
		Scanner sc = new Scanner(System.in);
		r = sc.nextLong();
		g = sc.nextLong();
		b = sc.nextLong();
		sc.close();
		
		memory = r*g*b;
		System.out.printf("%.2f MB", memory/(8*1024*1024)); // 8bit = 1byte, 1024byte = 1KB, 1024KB = 1MB 

	}	
}