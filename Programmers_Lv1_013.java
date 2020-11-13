package programmers;

public class Programmers_Lv1_013 {
	public static void main(String[] args) {
		
		// 두 정수 사이의 합
		
		int a = 3;
		int b = 3;
		
		long answer = 0;
        
        if (a>b) {
            for(int i=b; i<=a; i++){
                answer += i;
            }
        }else {
            for(int i=a; i<=b; i++){
                answer += i;
            }
        }
        System.out.println( answer);
    }
}
