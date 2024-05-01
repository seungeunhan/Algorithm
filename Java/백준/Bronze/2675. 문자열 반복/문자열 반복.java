import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()); //입력받을 라인 수 
        
		//입력받은 라인 수만큼 반복
		for (int line = 0; line < t; line++) { 
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); //문자 반복 횟수
			String s = st.nextToken(); //반복할 문자
            
            //문자열 길이만큼 반복
			for (int i = 0; i < s.length(); i++) {
                //n만큼 각 문자 반복
				for (int j = 0; j < n; j++) {
					System.out.print(s.charAt(i)); //공백없이 각 문자를 한줄에 출력
				}//--3번 for문
			}//--2번 for문
			System.out.println(""); //다음 라인 입력 시 개행 역할
		}//--1번 for문
		
        br.close();
	}//--main

}//--class
