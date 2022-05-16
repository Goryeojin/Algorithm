package backjon.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2675 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());	// 케이스 개수
		StringTokenizer st;
		
		for(int i=0; i<num; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int cnt = Integer.parseInt(st.nextToken());
			String value = st.nextToken();
			
			int idx = 0;
			
			for(int j=0; j<value.length(); j++) {
				
				for(int k=0; k<cnt; k++) {
					bw.write(value.charAt(idx));
				}
				idx++;
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}
