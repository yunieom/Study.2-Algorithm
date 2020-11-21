package programmers;

import java.util.Arrays;

public class Programmers_Lv1_025 {
	public static void main(String[] args) {
		
		// 문자열 내림차순으로 배치하기

		String s = "Zbcdefg";
		String answer ="";
		char [] arr = new char [s.length()];
		
		for (int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for (int i=arr.length-1; i>=0; i--) {
			answer += Character.toString(arr[i]);
		}
		System.out.println(answer);
		
	}
}
