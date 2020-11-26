package programmers;

import java.util.Arrays;

public class Programmers_Lv1_032 {
	public static void main(String[] args) {
		
		// 정수 내림차순으로 배치하기
		
		long n = 118372;
		String s = n+"";
		long arr [] = new long [s.length()];
		
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i)-48;
		}
		Arrays.sort(arr);
		
		String temp = "";
		for(int i=arr.length-1; i>=0; i--) {
			temp += arr[i];
			System.out.println(arr[i]);
		}
		long answer = Long.parseLong(temp);
		System.out.println(answer);
		
	}
}
