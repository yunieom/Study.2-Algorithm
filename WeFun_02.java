package kakao;

import java.util.Arrays;
import java.util.Comparator;

public class WeFun_02 {

	public static void main(String[] args) {
		int p[][] = {{1,3}, {3,5}, {2,5}, {5,2},{3,5},{3,1}, {5,4},{4,5},{5,7},{5,6},{7,5},{2,7},{7,3},{7,2},{110, 111},{4,6}}; 
		
		//System.out.println("배열 비교를 하기위해 무조건 작은숫자가 앞으로 가게 만들기");
		for (int i=0; i<p.length; i++) {
			for(int j=0; j<p[i].length; j++) {
				int temp1 = p[i][j];
				int temp2 = p[i][1];
				if(temp1 > temp2) {
					p[i][j] = temp2;
					p[i][1] = temp1;
				}
				//System.out.print(p[i][j]);
			}
			//System.out.println( );
		}
		
		//오름차순 정렬
		Arrays.sort(p, new Comparator<int []>() {
			@Override
			public int compare(int [] t1, int[] t2) {
				return t1[0] - t2[0];
			}
		});
		Arrays.sort(p, new Comparator<int []>() {
			@Override
			public int compare(int [] t1, int[] t2) {
				return t1[1] - t2[1];
			}
		});
		
		int cnt = 0;
		/*
		System.out.println("오름차순 정렬 후");
		for(int i=0; i<=p.length-1; i++) {
			for(int j=0; j<p[i].length; j++) {
				System.out.print(p[i][j]);
			}
			System.out.println();
		}
		*/
		
		//System.out.println("앞배열[i]배열과 그다음[i+1] 배열 같은지 비교해주기");
		for(int i=0; i<p.length-1; i++) {
			if(Arrays.equals(p[i], p[i+1])) {
				cnt++;
			}
		}
		System.out.println("답 "+cnt);
		
	}
}
