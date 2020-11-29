package programmers;

public class Programmers_Lv1_035 {
	public static void main(String[] args) {
		
		//  하샤드 수 
		
		int x = 13;
		boolean answer = true;
		int a = 0;
		
		String temp = x+"";
		char arr [] = new char[temp.length()];
		
		for (int i=0; i<temp.length(); i++) {
			arr[i]=temp.charAt(i);
			a += arr[i]-48;
		}
		if (x%a == 0) {
			answer = true;
		}else {
			answer = false;
		}
		System.out.println(answer);
		
	}
}
