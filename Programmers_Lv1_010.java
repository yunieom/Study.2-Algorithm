package programmers;

public class Programmers_Lv1_010 {
	public static void main(String[] args) {
		
		// 가운데 글자 가져오기

		String s = "qwer";
		String answer = "";
	
	
		if (s.length() % 2 == 0) {
			//String answer1 = input.substring(inputLength/2); => 나눈값의 인덱스 부터 4/2 는 2 즉 2번째 인덱스부터 단 인덱스 시작은 0 // nice -> ce, iphone -> one
			//String answer2 = input.substring(inputLength/2-1); => 나눈값의 인덱스 -1 부터 4/2 는 2 에 -1그니까 1번째 인덱스 부터 // nice -> ice, iphone -> hone
			//String answer3 = input.substring(inputLength/2+1); => 나눈값의 인덱스 +1 부터 4/2 는 2에 +1 그니까 3번째 인덱스 부터 // nice -> e, iphone -> ne
			answer = s.substring(s.length()/2-1, s.length()/2+1);	
		} else {
			answer = Character.toString(s.charAt(s.length()/2));
		}
		System.out.println(answer);

	}

}
