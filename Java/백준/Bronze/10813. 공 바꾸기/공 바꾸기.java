import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //바구니 수
		int m = Integer.parseInt(st.nextToken()); //입력 라인 수
		
		int arr[] = new int[n]; //입력된 바구니 수만큼 배열로 선언
		
		//각 바구니에 1~n번 공을 넣는다.
		for (int ballNum = 0; ballNum < arr.length; ballNum++) {
			arr[ballNum] = ballNum+1;
		}
		
		//입력한 라인 수(m) 만큼 반복
		for (int line = 0; line < m; line++) {
			
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1; //i번 바구니 값 저장, 배열 인덱스는 0부터 시작하므로 -1
			int j = Integer.parseInt(st.nextToken())-1; //j번 바구니 값 저장, 배열 인덱스는 0부터 시작하므로 -1
			
            //arr[i], arr[j]의 값을 교환하기 위해 임시 변수 a를 만듦
			int a = arr[i]; //임시 변수(a)에 arr[i]번 값 대입
			arr[i] = arr[j]; // arr[i]에 arr[j] 값 대입
			arr[j] = a; // 임시 변수(a)의 값을 arr[j]에 대입	
		}
		
		//배열 값 출력
		for (int k = 0; k < arr.length; k++) {
			bw.write(arr[k] + " ");
		}
			
		bw.flush();
		bw.close();
		br.close();
	}//--main

}//--class
