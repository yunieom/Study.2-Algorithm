package programmers;

import java.util.Stack;

public class Programmers_Lv2_004 {
	public static void main(String[] args) {
		
		// 올바른 괄호
		
		boolean answer = true;
		String s= "() )(  ))";
		
		Stack<Character> stack = new Stack<Character>();
	
		
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            }else{
                if(stack.isEmpty()) { //첫코드가 ')' 이거나 '()'이후에 또 ')'이것이 나왔을때
                    answer = false; 
                    System.out.println(answer);
                    break;        //return answer;       
                }else // '('이후에 ')'나오면 지우기
                    stack.pop();
            }
        }

        answer = (stack.isEmpty()) ? true : false; // 포문을 돌면서 처리한 스택이 비어있으면 true, 남아있다면 false
		System.out.println(answer);
	}
}	
