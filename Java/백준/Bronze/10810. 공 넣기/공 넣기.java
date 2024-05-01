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
		
		int n = Integer.parseInt(st.nextToken()); // 바구니 수
		int m = Integer.parseInt(st.nextToken()); //공 넣는 횟수
		
		
		int arr[] = new int[n]; //배열 n만큼 선언
		
		//배열의 모든 값을 0으로 초기화
		for (int a = 0; a < arr.length; a++) {
			arr[a] = 0;
		}
		
		//바구니에 공 넣기
		//첫번째 for문 : 총 공 넣는 횟수(m)
		//두번째 for문 : i~j번 바구니에 k번 공 넣는 코드
		for (int line = 0; line < m; line++) {
			st = new StringTokenizer(br.readLine());
 			int i = Integer.parseInt(st.nextToken());//시작 바구니 번호
			int j = Integer.parseInt(st.nextToken());//마지막 바구니 번호
			int k = Integer.parseInt(st.nextToken());//공 번호
			
			for (int basket = i-1; basket <= j-1; basket++) {
				arr[basket] = k; //해당 바구니에 k값 넣기
			}//--두번째 for문
			
		}//--첫번째 for문
		
		//결과값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}//--main

}//--class
