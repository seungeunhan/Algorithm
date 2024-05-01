import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int tnum = Integer.parseInt(br.readLine());
		int[] arr = new int[tnum];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < tnum; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int findNum = Integer.parseInt(br.readLine());
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (findNum==arr[i]) {
				cnt++;
			}
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
}

