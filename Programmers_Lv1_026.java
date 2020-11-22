package programmers;

public class Programmers_Lv1_026 {
	public static void main(String[] args) {
		
		//  시저 암호
		
		String s = "x";
		char [] arr = new char [s.length()];
		int n = 4;
		
		String answer = "";
		int sm = ' ';
		int lg = ' ';

		// 반복문을 돌면서 char의 형태로 변환
		for(int i=0; i<s.length(); i++) {
			sm =  (int)(s.charAt(i)+n); // 아스키코드 char 형태는 문자가 숫자화 되어있음 + n 을 해주면 n만큼 문자가 밀려남
			System.out.println(sm);
			lg = (int)(s.charAt(i)+n); // 아스키코드 char 형태는 문자가 숫자화 되어있음 + n 을 해주면 n만큼 문자가 밀려남

			if(s.charAt(i) == ' ') {
				arr[i] = s.charAt(i);
			}else if(s.charAt(i)<=122 && sm > 122) { //122 는 z, z보다 큰 수가 나올 경우엔 다시 a로 돌아간다.
				arr[i] = (char) (sm -26); // a는 97* a부터 세는 걸로 돌아가기 위해서 알파벳 개수 만큼 빼준다. 예) x = 120, n = 4 -> sm = 124, 124(sm)-26(알파벳개수) = 98 => 98 = b
			}else if (s.charAt(i)<=90 && lg > 90)  { // 90은 Z, Z 보다 큰 수가 나올 경우엔 다시 A로 돌아간다.
				arr[i] = (char) (lg -26); // A는 65* A부터 세는 걸로 돌아가기 위해서 알파벳 개수 만큼 빼준다. 예) X = 88, n = 4 -> lg = 92, 92(lg)-26(알파벳개수) = 66  => 66 = b
			}else {
				arr[i] = (char) (s.charAt(i)+n);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
		
	}
}
