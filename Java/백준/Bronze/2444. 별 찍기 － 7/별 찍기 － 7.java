import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=0, num1=1, num2=1, num3=0;
		int n = (Integer.parseInt(br.readLine())*2)-1; //출력 라인 수 입력
		
		//반복할 총 라인 수
		for (int line = 0; line < n; line++) {
            //0~총 라인수의 2/1
			if (line <= n/2) {
				for (int i = n/2; i > num; i--) { //총 라인수-1 만큼의 공백 출력
					System.out.print(" ");
				}
				for (int j = 0; j < num1; j++) { //2개씩 증가하는 별 출력
					System.out.print("*");
				}
				System.out.println(""); //개행
				num++; // 공백은 1씩 줄어듦, num의 값을 1씩 늘려 이전 라인보다 -1만큼의 공백 출력
				num1+=2; // 별은 2씩 증가함
				num3=num1-4; //첫번째 if문 -> 두번째 if문으로 넘어가 별 출력하기 위해 사용, 마지막 라인 출력 후 num1+=2 하므로 초기값을 -4를 한 값으로 지정
			}//--1번 if
			
            //(총 라인수의 2/1)+1 ~ 총 라인 수까지
			if (line >= (n-(n/2))) {
				for (int k = 0; k < num2; k++) { //공백 1씩 증가하므로 +1 만큼의 공백 출력
					System.out.print(" ");
				}
				for (int m = num3; m > 0; m--) { //별은 2씩 줄어듦, num3의 초기값은 1번 if문의 마지막 라인 별의 개수-4를 함
					System.out.print("*");
				}
				System.out.println(""); //개행
				num2++; //공백 1씩 증가하므로 +1
				num3-=2; //별은 2씩 감소하므로 -2
			}//-2번 if
            
		}//--1번 for
		
		br.close();
	}// --main
}// --class
