package programmers;

import java.util.ArrayList;

public class Programmers_Lv1_020 {
	public static void main(String[] args) {
		
		// 약수의 합
		
		int n = 5;
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			answer += list.get(i);
		}
		System.out.println(answer);
		
	}
}
