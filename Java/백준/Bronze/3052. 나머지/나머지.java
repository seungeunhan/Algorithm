import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력 받을 갯수(10)만큼  배열 생성
		int arr[] = new int[10];
		
		//배열 길이(10)만큼 입력받고, 42로 나눈 나머지를 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num%42;
		}
		
		//배열에 저장된 나머지 값 중 중복된 요소 제거
		arr = Arrays.stream(arr).distinct().toArray();
		
		//배열 총 길이
		System.out.println(arr.length);
        
        br.close();
	}//--main

}//--class
