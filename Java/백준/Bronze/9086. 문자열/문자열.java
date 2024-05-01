import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //테스트 횟수
		
		for (int i = 0; i < t; i++) {
			String s = sc.next(); //문자열 입력
			System.out.print(s.charAt(0)); //첫번째 문자열 출력
			System.out.println(s.charAt(s.length()-1)); //마지막 문자열 출력
		}
		
        sc.close();
	}//--main

}//--class
