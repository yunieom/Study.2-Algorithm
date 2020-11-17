package programmers;

import java.util.Arrays;

public class Programmers_Lv1_017 {
	public static void main(String[] args) {
		
		// 배열의 회전 
		
		int [] arrA = {4,1,2,3};
		int [] arrB = {3,4,1,2};
		boolean answer = false;
		
		// 길이가 같지 않으면 바로 false
		if(arrA.length != arrB.length) {
			answer=false;	
		}else {
			for(int i =0; i<arrA.length; i++) {
	           //배열 순회하기 
	           int first = arrA[0]; //{4,1,2,3} -> {1,2,3,4} -> {2,3,4,1}
	            //한바퀴 돌때까지 순회
	           for(int j=0; j<arrA.length-1; j++) {
	                arrA[j] = arrA[j+1]; //{1,2,3,3} -> {2,3,4,4} -> {3,4,1,1} 
	            } 
	            arrA[arrA.length-1] = first; //{1,2,3,4} ->{2,3,4,1} -> {3,4,1,2}
	            //arrA랑 arrB랑 같아지면 break
	            if(Arrays.equals(arrA, arrB)) {
	                answer = true;
	                break;
	            }
			}
		}	
		System.out.println(answer);
 
    }
}
