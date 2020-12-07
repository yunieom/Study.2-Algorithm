package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_Lv2_003 {
	public static void main(String[] args) {
		
		// 가장 큰 수
		
		int numbers [] = {6,10,2};
		String str [] = new String[numbers.length];
        String answer = new String();
		
		for(int i=0; i<str.length; i++) {
			str[i] = numbers[i]+"";
		}
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});

		if(str[0].startsWith("0")) {
			answer +="0";
		}else {
			for(int i=0; i<str.length; i++) {
				answer += str[i];
			}
		}
		
		System.out.println(answer);
		
	}
}	
