package programmers;

public class Programmers_Lv1_038 {
	public static void main(String[] args) {
		
		//  이상한 문자 만들기
		
		String s = "try hello world";		
		int index = 0;
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				answer += ' ';
				index =0;
			}else {
				index ++;
				if(index%2 != 0) {
					answer += s.toUpperCase().charAt(i);
					//Character.toUpperCase(s.charAt(i));
				}else {
					answer += s.toLowerCase().charAt(i);
					//Character.toLowerCase(s.charAt(i));
				}
			}
		} 
		System.out.println(answer);
	}
}
