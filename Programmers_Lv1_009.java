package programmers;

import java.util.Arrays;

public class Programmers_Lv1_009 {
	public static void main(String[] args) {
	
		//완주하지 못한 선수
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"marina", "josipa", "nikola", "filipa"};
		
		
		String answer = "";
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }
        
        System.out.println(answer);;


	}

}
