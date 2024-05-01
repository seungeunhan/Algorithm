import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 총 길이 30개 생성
		int arr[] = new int[30];
		
		//과제 제출한 28명 입력
		//28개 입력을 위해 총 배열길이(30)-2
		for (int i = 0; i < arr.length-2; i++) {
			int num = Integer.parseInt(br.readLine())-1; //배열이 0부터 시작하므로 -1
			arr[num] = 1; // 구분을 위해 입력된 번호는 1을 저장
		}
		
		//과제 제출 여부 확인을 위해 배열을 반복문으로 돌림
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {           //만약 해당 배열의 값이 0이면
				System.out.println(j+1); //콘솔 출력, 배열이 0부터 시작하므로 +1하여 번호 출력
			}
		}
		br.close();
	}//--main
}//--class
