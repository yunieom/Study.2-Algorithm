package programmers;

public class Programmers_Lv1_014 {
	public static void main(String[] args) {
		
		// 짝수와 홀수
		
		int num = 3;
		String answer = "";
        
        if(num == 0){
            answer = "Even";
        } else if(num%2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        System.out.println(answer); 
        
    }
}
