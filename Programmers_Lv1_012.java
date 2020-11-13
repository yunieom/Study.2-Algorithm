package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_Lv1_012 {
	public static void main(String[] args) {
		
		// 나누어 떨어지는 숫자 배열

		
		int[] arr= {5,9,7,10};
		int  divisor = 5;
		int[] answer = {};
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
		
		if (temp.isEmpty()) {
			temp.add(-1);
		}
		
		answer = new int [temp.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = temp.get(i);
		}
		Arrays.sort(answer);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		

	}

}
