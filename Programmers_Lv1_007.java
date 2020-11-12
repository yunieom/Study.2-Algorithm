package baekjoon;

import java.util.Scanner;

public class Programmers_Lv1_007 {
	public static void main(String[] args) {
		
		// 문자열 다루기 기본
		
		boolean answer = true;
		String s ="1234";

		if (s.length() != 4 && s.length() !=6) 
			answer = false;

		
		for(int i=0; i<s.length(); i++) {
			char splitS = s.charAt(i);
			if(splitS < '0' || splitS > '9') {
				answer = false;
			}			
		}
		System.out.println(answer);
		 
	
		
	}

}
