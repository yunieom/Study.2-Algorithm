package codeUp;

import java.util.Scanner;

public class CodeUp_099 {

	public static void main(String[] args)  {
		int arr[][] = new int[11][11];
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j]=sc.nextInt();
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		int x = 1;
		int y = 1;
		
		
		while( x < 10 && y < 10) {
			//시작점이 바로 먹이일 때.
			if (arr[1][1] == 2) {
				arr[1][1] = 9;
				break;
			// 아닌경우는 2*2 시작 부분 9로 잡아줌
			} else {
				arr[1][1] = 9;
			}
			
			// 아래 장애물이 없을 때 (아래로 한칸이 1이 아닌 경우)
			if(arr[x][y+1] == 0) {
				arr[x][y+1] = 9; // 아래로 한 칸 이동 하고 간 길을 9로 만들어주고
				y++; // 개미의 현재 칸 이동 (이걸 안하면 계속 제자리에 있음 움직인 만큼 +1)
			
			// 아래 장애물이 있고(아래로 한칸이 1이고) 오른쪽으로 장애물이 없을 때(오른쪽 한칸이 0인 경우) 
			}else if(arr[x][y+1] ==1 && arr[x+1][y] == 0) {
				arr[x+1][y] = 9; // 오른쪽으로 1칸 이동하고 간 길을 9로 만들어줌 
				x++; //개미의 현재 칸 이동 (이걸 안하면 계속 제자리에 있음 움직인 만큼 +1)
			
			// 아래로 이동하면 먹이
			}else if(arr[x][y+1] == 2) {
				arr[x][y+1] = 9; // 아래로 한 칸 이동 하고 간 길을 9로 만들어주고
				break; // 게임끝났으므로 함수 빠져나오기
			
			// 아래 장애물이 있고 오른쪽으로 이동하면 먹이
			}else if(arr[x][y+1] == 1 && arr[x+1][y] == 2) {
				arr[x+1][y] =9;  // 오른쪽으로 1칸 이동하고 간 길을 9로 만들어주고
				break;  // 게임끝났으므로 함수 빠져나오기
			
			// 아래 오른쪽 모두 장애물이 있을 때
			}else if(arr[x][y+1] == 1 && arr[x+1][y] ==1) {
				break; // 움직일 수 없으므로 9로 바꿔줄것도 없이 게임, 함수 끝 
			} 
		}
		
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		sc.close();
		
	}	
}