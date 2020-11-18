package programmers;

import java.util.Scanner;

public class Programmers_Lv1_018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextLine()));
		sc.close();
	}
	
	public static int solution(String plain) {
		int len = plain.length();
		if(len == 1) {
			return len;
		}else {
			for(int i=0;i<len;i++) {
				if(isPalindrome(plain.substring(i))) 
					return i + len;
			}
			return len << 1; //비트연산자 == len * 2
		}	
	}
	
	private static boolean isPalindrome(String plain) {
		boolean chk = true;
        int len = plain.length();
        if (len == 1) {
        	chk = true;
        }else {
        	for (int i =0; i < len; i++) {
                if (plain.charAt(i) != plain.charAt(len - i - 1)) 
                    chk = false;                
            }
        }
        return chk;
	}
}
