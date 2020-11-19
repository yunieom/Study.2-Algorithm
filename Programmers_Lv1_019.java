package programmers;

public class Programmers_Lv1_019 {
	public static void main(String[] args) {
		
		// 수박수박수박수박수박수?
		
		String answer = "";
		int n = 10;
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				answer += "수";
			}else {
				answer += "박";
			}
		}
		System.out.println(answer);
 
    }
}
