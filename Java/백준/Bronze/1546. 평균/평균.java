import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int m = Integer.parseInt(br.readLine()); //과목 수 입력
		int arr[] = new int[m]; //입력받은 과목만큼 배열로 선언
		
        
		//과목별 점수를 배열에 저장
		int max = 0;
		st = new StringTokenizer(br.readLine()); //한줄로 입력받음
		for (int in = 0; in < m; in++) {
			arr[in] = Integer.parseInt(st.nextToken()); //한줄로 입력받은 점수를 각 인덱스에 저장
			
            //배열에서 최대값을 max 변수에 저장
			if (arr[in] > max) { 
				max = arr[in];
			}//--if
		}//--for
		
        //각 점수마다 계산
		double avg = 0;
		for (int score : arr) {
			avg += ((double)score/max)*100;	
		}
        
		double result = avg/m; //총 점수를 과목수로 나누기
		System.out.println(result); //결과 출력
	
	}//--main

}//--class
