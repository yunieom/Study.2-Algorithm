package codeUp;

import java.util.Scanner;

public class CodeUp_097 {

	public static void main(String[] args)  {
		int n,x,y;
		int[][] arr = new int[19][19];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<19; i++) { 
			for(int j=0; j<19; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		n= sc.nextInt();
		for (int i=0; i<n; i++) {
			x = sc.nextInt();
			
			for(int a=0; a<19; a++) {
				if(arr[x-1][a] == 0) {
					arr[x-1][a] = 1;
				}else {
					arr[x-1][a] = 0;
				}
			}
			y = sc.nextInt();
			
			for(int b=0; b<19; b++) {
				if(arr[b][y-1] == 0) {
					arr[b][y-1] = 1; 
				}else {
					arr[b][y-1] = 0;
				}
			}
		}
		
		for (int[] a : arr) {
			for(int b : a) {
				System.out.print(b + " ");
			} 
			System.out.println();
		}
		sc.close();
	
		
	}	
}