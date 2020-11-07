package codeUp;

import java.util.Scanner;

public class CodeUp_098 {

	public static void main(String[] args)  {
		int h,w;
		int n;
		int l,d,x,y;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		int[][] arr = new int[h+1][w+1]; //인덱스가 0부터 시작하므로 h,w 크기를 수용하려면 +1
		
		n = sc.nextInt();
		for(int i=1; i<=n; i++) { //반복문을 돌 횟수 : 막대과자 있는 만큼 (n) 예)n=3 이면 1,2,3 번 돌아야됨  
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (d==0) { // d == 0 이면 가로 ++ , 가로 좌표가 y (w라인)
				for(int j=0; j<l; j++) {
					arr[x][y+j] = 1;
				}
	
			}
			if (d==1) {  // d == 1 이면 세로 ++ , 세로 좌표가 x (h라인)
				for(int j=0; j<l; j++) {
					arr[x+j][y] = 1;
				}
			}
		}
		for (int i=1; i<=h; i++) { // 새로 설정해준 배열 돌차례
			for (int j=1; j<=w; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
		sc.close();
		
	}	
}