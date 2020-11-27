package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_Lv1_032 {
	public static void main(String[] args) {
		
		// 두 개 뽑아서 더하기
		
		int numbers [] = {5,0,2,7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				int a = numbers[i] + numbers[j];
				//indexOf method 공부하기 
				if (list.indexOf(a) <0) {
					list.add(a);
				}
			}
		}
		
		System.out.println(list);
		int answer [] = new int [list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		System.out.println(answer);
		
		
	}
}
