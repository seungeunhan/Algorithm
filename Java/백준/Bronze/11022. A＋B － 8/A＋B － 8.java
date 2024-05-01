import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b, sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine()); //한줄에 들어온 문자열 나눔
			a= Integer.parseInt(st.nextToken());
			b= Integer.parseInt(st.nextToken());
			
			sum = a+b;
			
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}
}
