package programmers;

import java.util.ArrayList;

public class Programmers_Lv1_024 {
	public static void main(String[] args) {
		
		// 평균 구하기

		int[] arr = {1,2,3,4};
	
		double answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
		
        answer = answer/arr.length;
        //System.out.println(answer);
		
	}
}
