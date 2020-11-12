package baekjoon;

public class Programmers_Lv1_005 {
	public static void main(String[] args) {
		
		// 문자열 내 p와 y의 개수

		String s = "ooyo";
		boolean answer = true;
		
		int cntp = 0;
		int cnty = 0;
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p') 
				cntp++;
			if(s.charAt(i) == 'y')
				cnty++;
	
		}
		//System.out.println(cnty);
		//System.out.println(cntp);
		
		if(cntp == cnty) {
			answer = true;
		}else {
			answer = false;
		}
		
		System.out.println(answer);
	}

}
