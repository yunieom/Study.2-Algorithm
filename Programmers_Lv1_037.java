package programmers;

import java.util.Arrays;

public class Programmers_Lv1_037 {
	public static void main(String[] args) {
		
		// 예산
		
		int d [] = {2,2,3,3};
		int budget = 10;
		int answer =0;
		
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
				budget -= d[i];
				if(budget<0) {
					break;
				}else {
					answer++;
				}		
		}
		System.out.println(answer);
		
		
		
	}
}
