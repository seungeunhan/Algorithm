import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
			int sum=0;
			StringTokenizer st;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			while (true) {
				st = new StringTokenizer(br.readLine());
				
				sum = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
				if (sum == 0) {
					break;
				}
				
				bw.write(sum + "\n");
			}
			
			bw.flush();
			bw.close();
	}
}
