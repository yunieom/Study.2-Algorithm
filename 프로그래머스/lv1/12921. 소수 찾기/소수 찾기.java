class Solution {
    public int solution(int n) {
       int [] arr = new int [n+1];
		
		for(int a=2; a<=n; a++) {
			arr[a] = a;
		}
		
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j=i+i; j<=n; j+=i) {
				arr[j]=0;
			}
		}
		
		int answer = 0;
		for(int i=2; i<=n; i++) {
			if(arr[i]!=0) {
				answer ++;
			}
		}
        
        return answer;
    }
}