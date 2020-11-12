package baekjoon;
class Programmers_Lv1_001 {
	public static void main(String[] args) {
		
		// 최대공약수와 최소공배수

		int n = 2;
		int m = 5;
        int[] answer = new int[2];
        
        if (n<m) {
            for(int i=1; i<=m; i++) {
                if(n%i == 0 && m%i == 0){
                    answer[0]=i;
                    answer[1]=m*n/i;
                }
            }
        }else{
            for(int i=1; i<=n; i++) {
                if(n%i == 0 && m%i == 0){
                    answer[0]=i;
                    answer[1]=m*n/i;
                }
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}