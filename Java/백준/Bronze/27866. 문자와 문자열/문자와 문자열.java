import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //문자열 입력
		int n = sc.nextInt()-1; //추출할 정수 입력(문자열 인덱스가 0부터 시작하므로 -1)
		
		System.out.println(s.charAt(n)); //결과값 출력
	}//--main

}//--class
