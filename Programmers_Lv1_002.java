package baekjoon;

public class Programmers_Lv1_002 {
	public static void main(String[] args) {
		
		// 체육복
		
		int n = 10;
		
		int[] lost = new int[3];
		lost[0] = 1;
		lost[1] = 4;
		lost[2] = 8;

		int[] reserve = new int[2];
		reserve[0] = 2;
		reserve[1] = 4;
		
		int count = 0; // 체육복 빌려준 수 = 즉 체육복이 없었다가 생긴 사람
		int answer = 0;
		

		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if (lost[i]==reserve[j]) {
					count++;
					lost[i] = -1; // 다음 반복문에서 실행되지 않도록 -1 으로 조건에 안맞도록 만들기
					reserve[j] = -1; // 다음 반복문에서 실행되지 않도록 -1 으로 조건에 안맞도록 만들기
					break;
				}
			}
		}
		// 위 함수 돌고 나오면 여벌옷 가지고 있는 학생이 도난 당했을 경우 lost 배열에서도 -1, reserve 배열에서도 -1 이 된다.  
		// 원래자신이 가지고 있는 번호 상실 -> 그래야 반복문을 1번만 도니까. 
		
		for(int i=0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
					count++;
					reserve[j] = -1; // 다음 반복문에서 실행되지 않도록 -1 으로 조건에 안맞도록 만들기
					break;
				}
			}
		}
		// 위 함수 돌고 나오면 조건(여벌옷 가진 자의 앞번호 뒷번호 조건)이 맞는 사람이 체육복을 겟함.
		// 이 경우 체육복 빌려준 수가 올라가고 체육복을 빌려준 학생, 빌린 학생 모두 자기 배열에서 -1 값이 된다. 원래 자기가 가지고 있는 번호 상실
		
		answer = n - lost.length  + count;
		System.out.println(lost.length);
		System.out.println(count);
		System.out.println(answer);
		
	
		
	}
}
