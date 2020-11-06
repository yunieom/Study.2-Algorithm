package codeUp;

import java.util.Scanner;

public class CodeUp_092 {

	public static void main(String[] args)  {
		int a, b, c;
		int day = 1;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		
		while(day%a !=0 || day%b !=0 || day%c !=0) // 셋 다 day 나누기 a,b,c가 0이 되는날 멈춤. -> 그 날을 리턴.
					day++;
				System.out.printf("%d", day);

		
	}	
}