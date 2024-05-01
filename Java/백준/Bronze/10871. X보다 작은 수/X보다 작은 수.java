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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //입력받을 총 개수
		int x = Integer.parseInt(st.nextToken()); // 기준이 될 정수
		
		int[] arr = new int[n]; //입력받을 총 개수만큼 배열 생성
		
        //공백을 기준으로 한줄에 입력받은 정수들을 배열에 저장
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
        //기준이 될 x값을 배열 값과 하나씩 비교해 x보다 작으면 한줄에 출력하라
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				bw.write(arr[i] + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}

