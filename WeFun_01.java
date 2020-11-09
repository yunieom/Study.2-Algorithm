package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WeFun_01 {

	public static void main(String[] args) {
		String movie[] = {"spy", "ray", "spy", "room", "once", "ray", "spy", "once", "once", "once", "spy", "spy"};
		Map<String, Integer> movieList = new LinkedHashMap<String, Integer>();
		
		
		//map으로 배열에 나와있는 이름 : 중복된 숫자를 키와 밸류로 저장하기
		for(String key : movie) {
			movieList.put(key, movieList.getOrDefault(key, 0)+1);
		}
		System.out.println(movieList);

		
		// value 내림차순  정렬, value가 같으면 key 값 오름차순으로 정렬하기 위해서 list 만들기
		List<Map.Entry<String, Integer>> list = new ArrayList<>(movieList.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int comparision = (o1.getValue() - o2.getValue()) * -1;
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            }
        });
        
        //System.out.println(list + "list");
       // System.out.println(list.get(0).getKey());
        
        // value 내림차순으로 된 리스트에서 key값만 배열로 담아주기
        String [] answer = new String[list.size()];
        
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i).getKey();
        }
        System.out.print("{ " + answer[0] + ", " + answer[1] + ", " + answer[2] + ", " + answer[3] + " }"  );
	
	}
}
