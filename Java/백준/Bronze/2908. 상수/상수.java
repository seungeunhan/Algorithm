import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); //한줄에 숫자 입력 -> 734 893
		StringBuilder s1 = new StringBuilder(st.nextToken()); //공백기준 첫번째 숫자 대입 734
		StringBuilder s2 = new StringBuilder(st.nextToken()); //공백기준 두번째 숫자 대입 893
		
		int n = Integer.parseInt(String.valueOf(s1.reverse())); //s1을 뒤집어 int형으로 변환
		int m = Integer.parseInt(String.valueOf(s2.reverse())); //s2를 뒤집어 int형으로 변환
		
		int result = n>m ? n : m; //삼항연산자(n>m이 참이면 n, 거짓이면 m)

		System.out.println(result);
		
	}// --main

}// --class
