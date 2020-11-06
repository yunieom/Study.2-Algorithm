package codeUp;

import java.util.Scanner;

public class CodeUp_087 {

	public static void main(String[] args)  {
		int n,i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		for(i=0; i<n; i++) {
			sum+=i;
			if(sum>=n)
				break;
			if(n==1) {
				sum = 1;
				break;
			}
				
		}
		System.out.println(sum);
	}	
}