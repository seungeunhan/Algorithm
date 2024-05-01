import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countNum = 0, count;
		char result = ' ';
		
		//문자열 입력받은 후 대문자로 변경
		String s = br.readLine().toUpperCase();
		
		//문자열 존재 여부 확인하고 카운트 세기
		for (int i = 0; i < s.length(); i++) { //전체문자열 개수만큼 반복
			count = 0;
			for (int j = 0; j < s.length(); j++) { //s(i) 문자열 기준으로 인덱스가 증가하며 비교
				if (s.charAt(i)==s.charAt(j)) { //s(i)와 s(j)문자가 같으면 카운트 증가
					count++;
				}//--if
			}//--2번 for
			
			if (countNum < count) { //증가한 count 값이 countNum보다 크면
				result = s.charAt(i); //result 변수에 비교한 문자 저장
				countNum = count; //count 개수를 countNum에 저장
				}//--if
			else if (countNum == count) { //카운트 값이 같으면 
				result = '?'; //result에 ?문자 저장
			}//--elseif
			s = s.replace(Character.toString(s.charAt(i)), ""); //s 변수에 현재 비교했던 문자 제거
		}//--1번 for
		
		
		System.out.println(result); //결과 출력
		
	}// --main

}// --class
