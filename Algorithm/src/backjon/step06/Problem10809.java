package backjon.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		char ch = 97;
		
		for(int i=0; i<26; i++) {
			int result = str.indexOf(String.valueOf((char)(ch + i)));
			
			bw.write(result + " ");
		}
		bw.flush();
		bw.close();
		
	}

}
