package programmers;

public class Programmers_Lv1_011 {
	public String solution(int a, int b) {
		
		// 2016년

        String answer = "";
        
        String day[] = new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int TotalDate = 0;
        int DaysOfMonth = 0;
        
        for(int i=1; i<a; i++) {
        	if(i == 4 || i == 6 || i == 9 || i == 11) {
        		DaysOfMonth = 30;
        	} else if(i == 2) {
        		DaysOfMonth = 29;
        	} else {
        		DaysOfMonth = 31;
        	}
        	TotalDate += DaysOfMonth;
        }
        TotalDate += b;
        
        switch(TotalDate % 7) {
        case 0: 
        	answer = day[3];
        	break;
        case 1:
        	answer = day[4];
        	break;
        case 2:
        	answer = day[5];
        	break;
        case 3:
        	answer = day[6];
        	break;
        case 4:
        	answer = day[0];
        	break;
        case 5:
        	answer = day[1];
        	break;
        case 6:
        	answer = day[2];
        }
        
        return answer;
    }
}
