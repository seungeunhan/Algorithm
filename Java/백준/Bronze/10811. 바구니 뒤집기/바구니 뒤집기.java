import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()); //바구니 수와 입력 라인 수를 한줄에 입력
		int n = Integer.parseInt(st.nextToken()); //바구니 수
		int m = Integer.parseInt(st.nextToken()); //라인 수
		
		List<Integer> liBasket = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) { //각 바구니에 1~n만큼 입력
			liBasket.add(i);
		}
		
		// 라인 수(m)만큼 반복
		for (int line = 0; line < m; line++) {
			st = new StringTokenizer(br.readLine()); //한줄 입력
			int start = Integer.parseInt(st.nextToken())-1; //시작값
			int last = Integer.parseInt(st.nextToken()); //reverse 갯수
			Collections.reverse(liBasket.subList(start, last)); //뒤집기
		}
		
		//최종 출력
		for (int result : liBasket) {
			System.out.print(result + " ");
		}
		
        br.close();
	}//--main

}//--class
