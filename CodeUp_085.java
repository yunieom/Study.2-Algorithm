package codeUp;

import java.util.Scanner;

public class CodeUp_085 {

	public static void main(String[] args)  {
		long h, b, c, s;
		float memory = 0;
		Scanner sc = new Scanner(System.in);
		h = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		s = sc.nextLong();
		sc.close();
		
		memory = h*b*c*s;
		System.out.printf("%.1f MB", memory/(8*1024*1024)); // 8bit = 1byte, 1024byte = 1KB, 1024KB = 1MB 

	}	
}