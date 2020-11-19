package programmers;

import java.util.ArrayList;

public class Programmers_Lv1_018 {
	public static void main(String[] args) {
		
		// 같은 숫자는 싫어
		
		int [] arr = {1,1,3,3,0,1,1};
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		int temp = 10;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != temp) {
				array.add(arr[i]);
				temp = arr[i];
			}
		}
		System.out.println(array);
		int [] answer = new int[array.size()];
		for(int i=0; i<array.size(); i++) {
			answer[i] = array.get(i);
			System.out.println(answer[i]);
		}

		
 		
		
		/*
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
				array.add(i, arr[i]);
		}
		
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) == array.get(i+1)) {
				array.remove(i);
			}
		}
		
		
		
		for(int j=0; j<array.size()-1; j++) {
			if(array.get(j) == array.get(j+1)) {
				array.remove(j);
			}
		}
		
		int [] answer = new int[array.size()];
		
		for (int i=0; i<array.size(); i++) {
			answer[i] = array.get(i);
			System.out.println(answer[i]);
		}
		*/
		



		

 
    }
}
