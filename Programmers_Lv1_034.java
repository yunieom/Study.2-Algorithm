package programmers;

public class Programmers_Lv1_034 {
	public static void main(String[] args) {
		
		// 콜라츠 추측

		long num = 626331;
		int answer =0;
		
		while(answer >=0) {
			if(num%2 == 0) {
				num = num/2;
				answer++;
			}else if( num == 1){
				System.out.println(answer);
				break;
			}else {
				num = num*3+1;
				answer++;
			}
			
			if( answer >= 500){
				answer = -1;
				System.out.println(answer);
				break;
			}
		}	
	

		
	}
}
