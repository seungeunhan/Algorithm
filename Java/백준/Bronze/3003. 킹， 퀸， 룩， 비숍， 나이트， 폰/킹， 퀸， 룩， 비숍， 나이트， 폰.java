import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] piece = {1,1,2,2,2,8};
		
		for (int i = 0; i < piece.length; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (piece[i] >= num) {
				int n = piece[i]-(num);
				bw.write(n + " ");
			}else if (piece[i] < num) {
				int n = (num-piece[i])*-1;
				bw.write(n + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}// --main

}// --class
