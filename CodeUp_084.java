package codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CodeUp_084 {

	public static void main(String[] args) throws IOException {
		int cnt = 0;
		int r, g, b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken()); 
		g = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		String s ="";
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<g; j++) {
				for(int k=0; k<b; k++) {
					s = i + " " + j + " " + k + "\n";
					bw.write(s);
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));
		bw.close();
	}	
}