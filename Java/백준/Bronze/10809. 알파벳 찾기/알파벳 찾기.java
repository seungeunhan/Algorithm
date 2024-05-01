import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(); //문자열 입력받음
		String alpa = "abcdefghijklmnopqrstuvwxyz"; //a~z까지 존재 여부 확인을 위한 문자열
		
		//알파벳 개수만큼 반복
		for (int i = 0; i < 26; i++) {
			int n = s.indexOf(alpa.charAt(i)); //알파벳 0번부터 문자를 출력해 s에 있으면 인덱스값, 없으면 -1 출력
			System.out.print(n + " "); //한줄에 공백을 기준으로 출력        
		}
	
		br.close();
	}//--main

}//--class
