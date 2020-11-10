package kakao;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeFun_03 {

	public static void main(String[] args) {
		String s = "abebeaedeac";
		char [] alpha = new char[s.length()];
		
		
		for(int i=0; i<s.length(); i++) {
			alpha[i] = s.charAt(i);
		}
		
		//map으로 배열에 나와있는 이름 : 중복된 숫자를 키와 밸류로 저장하기
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char key : alpha) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		int answer = 0;
		//map의 밸류값 가져오기
		for (Character mapkey  : map.keySet()){
	        System.out.println("key:"+mapkey+", value:"+map.get(mapkey));
	        	//value 의 값 %2 != 0 이 아니라면
	        if( (Integer.parseInt(map.get(mapkey).toString()) )%2 != 0) {
	        	//System.out.println(Integer.parseInt(map.get(mapkey).toString()));
	        	answer++;
	        }
	    }
		System.out.println(answer);

	}
}
