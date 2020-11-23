package programmers;import java.util.Arrays;

public class Programmers_Lv1_027 {
	public static void main(String[] args) {
		
		//  x만큼 간격이 있는 n개의 숫자
		
		long x = 2;
		int n = 5; 
		long temp[] = new long [n+1]; // 반복문 시작이 1이므로 1칸 배열 1칸 추가
		long answer[] = new long [n];
		
	
		for(int j=1; j<=n; j++) { // 1부터 배열의 인덱스는 n만큼이므로 n까지 돌기. 
			temp[j] = x*j; // 받은 값에 1부터 n까지 곱해주기
			for(int i=0; i<n; i++) {
				answer[i] = temp[i+1]; // temp 배열은 인덱스 1부터 시작, i는 0부터 시작 -> i+1
			}	
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
}
