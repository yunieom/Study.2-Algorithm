package baekjoon;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_Lv1_004 {
	public static void main(String[] args) {
		
		// 문자열 내 마음대로 정렬하기

		String [] strings = {"sun", "bed", "car"};
		int n = 1;
		
		ArrayList<String> newArr = new ArrayList<String>();
		
		for(int i=0; i<strings.length; i++) {
			newArr.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(newArr);
		System.out.println(newArr);
		
		String [] answer = new String [newArr.size()];
		
		for(int i=0; i<newArr.size(); i++) {
			answer[i] = newArr.get(i).substring(1,newArr.get(i).length());
		}
	}

}
