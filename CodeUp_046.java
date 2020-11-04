package codeUp;

import java.util.Scanner;

public class CodeUp_046 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		System.out.printf("%d", a<<b ); // << 가 기본적으로 2를 곱해주는데 2의 b승 값이 곱해진다. 예) a = 1 , b = 10; 1 * 2의 10승 = 1024 출력
	}	
}