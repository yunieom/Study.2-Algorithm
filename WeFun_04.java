package kakao;

public class WeFun_04 {

	public static void main(String[] args) {
		int day = 6;
		int [] daysOfMonth = new int[12];
		
		
		for (int i=0; i<daysOfMonth.length; i++) {
			if(i == 3 || i == 5 || i == 8 || i == 10) {
				daysOfMonth[i] += 30;
			}else if ( i == 1) {
				daysOfMonth[i] += 28;
			}else {
				daysOfMonth[i] += 31;
			}
			//System.out.println(daysOfMonth[i]);
		}

		
		 int k = 1;
		 int[] ans = new int[daysOfMonth.length];
		 ans[0] =k;
		 ans[1] =k +daysOfMonth[0];

		 // k + 지난 달들의 일수 (d-day개념같이)
		 for(int i=0; i<12; i++) {
			 ans[i]=k;
			 for(int j=0; j<i; j++) {
				 ans[i] += daysOfMonth[j];
			 }
			// System.out.println(ans[i]);
		 }
		 /*
		 ans[0] = k;
		 ans[1] = k+daysOfMonth[0];
		 ans[2] = k+daysOfMonth[0]+daysOfMonth[1];
		 ans[3] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2];
		 ans[4] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3];
		 ans[5] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4];
		 ans[6] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5];
		 ans[7] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5]+daysOfMonth[6];
		 ans[8] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5]+daysOfMonth[6]+daysOfMonth[7];
		 ans[9] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5]+daysOfMonth[6]+daysOfMonth[7]+daysOfMonth[8];
		 ans[10] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5]+daysOfMonth[6]+daysOfMonth[7]+daysOfMonth[8]+daysOfMonth[9];
		 ans[11] = k+daysOfMonth[0]+daysOfMonth[1]+daysOfMonth[2]+daysOfMonth[3]+daysOfMonth[4]+daysOfMonth[5]+daysOfMonth[6]+daysOfMonth[7]+daysOfMonth[8]+daysOfMonth[9]+daysOfMonth[10];
		 */
		 
		 for(int i=0; i<ans.length; i++) {
			 if(ans[i]%7 == 0 || ans[i]%7 ==1) {
				 ans[i]=1;
			 }else {
				 ans[i]=0;
			 }
			 System.out.println(ans[i]);
		 }
		 
	}
}
