package baekjoon;

import java.util.ArrayList;

public class Programmers_Lv1_006 {
	public int[] solution(int[] answers) {
		
		// 모의고사
		
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3]; // 채점을 위해 크기가 3인 배열 생성 (인덱스는 0,1,2) 
        
        for (int i=0; i<answers.length; i++) { 
        	if(answers[i] == person1[i%person1.length]) count[0]++; 
        	//  정답 배열의 [i]번째 인덱스와 수포자1 답안지배열의 [i] 번째를 비교. 반복이 되기 때문에 배열의 길이만큼 나눠준 값의 나머지값으로 배열 인덱스를 정하면 됨. 답이 일치할 경우 count 채점지에 카운팅 된다. 
        	if(answers[i] == person2[i%person2.length]) count[1]++;
        	if(answers[i] == person3[i%person3.length]) count[2]++;        	
        }
        
        int max = Math.max(Math.max(count[0], count[1]), count[2]); // 최고점수구하기 
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max == count[0]) list.add(1); //높은점수 값이 수포자 1번 값과 같다면 가장 높은 점수면 리스트에 1번을 넣음 
        if (max == count[1]) list.add(2); 
        if (max == count[2]) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

}
