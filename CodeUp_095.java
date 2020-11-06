package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_095 {

	public static void main(String[] args)  {
		int n;
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int[] a = new int[n+1]; // 0번 인덱스부터 시작하므로 다 저장하려면 +1 을 해줘야 ArrayIndexOutOfBoundsException 에러 막을 수 있음
		
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[1]);
		
		sc.close();
		
	}	
}