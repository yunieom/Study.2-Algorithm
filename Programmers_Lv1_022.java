package programmers;

public class Programmers_Lv1_022 {
	public static void main(String[] args) {
		
		// 핸드폰 번호 가리기
		
		String phone_number = "01033334444";
		String last = phone_number.substring(phone_number.length()-4);
		//System.out.println(last);
		String answer = "";
		
		for(int i=0; i<phone_number.length()-4; i++) {
			answer += "*";
		}
		answer += last;
		System.out.println(answer);
		
	}
}
