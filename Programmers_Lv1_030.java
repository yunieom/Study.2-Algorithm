package programmers;

import java.util.Stack;

public class Programmers_Lv1_030 {
	public static void main(String[] args) {
		
		// 자연수 뒤집어 배열로 만들기

		long n = 12345;	
		int temp =0;
		String s = n+"";
		
		int answer [] = new int [s.length()];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=s.length()-1; i>=0; i--) {
			 temp =  s.charAt(i)-48;
			 stack.push(temp);
		}
		for (int i=0; i<stack.size(); i++) {
			answer[i] = stack.get(i);
 		}

		
		
		
	}
}
