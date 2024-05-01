import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
		
	public static void main(String[] args) throws IOException {
		int rCost, rCount, tCost=0;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		rCost = Integer.parseInt(br.readLine());
		rCount = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < rCount; i++) {
			st = new StringTokenizer(br.readLine());
			tCost += (Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
		}
		
		if (rCost == tCost) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		bw.flush();
		bw.close();
	}
}
