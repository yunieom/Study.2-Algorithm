package programmers;

public class Programmers_Lv1_035 {
	public static void main(String[] args) {
		
		//  내적 
		
		int a [] = {-1,0,1};
		int b [] = {1,0,-1};
		int answer = 0;
		
		for(int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		
		System.out.println(answer);

		
	}
}
