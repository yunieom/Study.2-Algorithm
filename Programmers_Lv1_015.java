package programmers;

public class Programmers_Lv1_015 {
	public static void main(String[] args) {
		
		// 나머지 한 점
		
		int [][] v = {{1,4}, {3,4}, {3,10}};
		int x,y;
        
        if(v[0][0] == v[1][0]) {
            x = v[2][0];
        }else if(v[1][0] == v[2][0]) {
            x = v[0][0];
        }else {
            x = v[1][0];
        }
        
        if(v[0][1] == v[1][1]) {
            y = v[2][1];
        }else if(v[1][1] == v[2][1]) {
            y = v[0][1];
        }else {
            y = v[1][1];
        }
        
        int answer [] = {x,y};
        System.out.println(answer[0]); 
        System.out.println(answer[1]); 
        
    }
}
