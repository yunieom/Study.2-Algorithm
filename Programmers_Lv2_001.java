package programmers;

import java.util.Stack;

public class Programmers_Lv2_001 {
	public static void main(String[] args) {
		
		// 짝지어 제거하기
		
		String s = "baabaa";
		Stack<Character> stack = new Stack<Character>();
	        
			for(char c : s.toCharArray()) { 
				if(!stack.empty() && stack.peek() == c) {
					System.out.println(stack.peek() + " peek");
					//System.out.println(c + " c");
					stack.pop();
				}else{
					stack.push(c);
					System.out.println(c + " else c");
				}
			}
			int solution = stack.empty() ? 1 : 0;
			System.out.println(solution);

	}
}
