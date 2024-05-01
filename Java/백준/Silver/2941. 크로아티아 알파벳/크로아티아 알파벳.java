import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); //입력받기
		
		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; //크로아티아 알파벳 배열로 초기화
		

		for (int i = 0; i < arr.length;i++) { //배열 개수만큼 반복
			if (s.contains(arr[i]) == true) { //arr(i)번째 문자가 포함되어 있으면 '?'로 치환
				s = s.replace(arr[i], "?");
			}
		}//--for문

		System.out.println(s.length()); //배열에 포함되지 않은 문자와 치환된 '?'문자 개수의 총합
	
	}// --main
}// --class
