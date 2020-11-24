package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_Lv1_029 {
	public static void main(String[] args) {
		
		// 제일 작은 수 제거하기

		int arr [] = {10};
	
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			temp.add(arr[i]);
		}
		
		for(int i=0; i<temp.size(); i++) {
			if(temp.get(i) == min) {
				temp.remove(i);
			}
			if(temp.isEmpty()) {
				temp.add(0);
			}
		}
		
		System.out.println(temp.isEmpty());
		int answer [] = new int [temp.size()];

		for(int i=0; i<temp.size(); i++) {
			answer[i] = temp.get(i);
			if(temp.get(i)==0) {
				answer[i]=-1;
			}
		}
		System.out.println(Arrays.toString(answer));
		
		
	}
}
