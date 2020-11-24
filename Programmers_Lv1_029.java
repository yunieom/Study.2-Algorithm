package programmers;

public class Programmers_Lv1_029 {
	public static void main(String[] args) {
		
		// 자릿수 더하기

		long n = 987;	
		int answer = 0;
		String s = n+"";
		int arr [] = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i)-48;
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
