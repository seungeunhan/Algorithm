import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //입력받을 숫자 길이 
		String s = sc.next(); //숫자를 문자열 취급하여 한줄로 입력
		String[] arr = s.split(""); //'공백없음'을 기준으로 배열에 저장
		
		//배열의 길이가 t(입력받을 숫자 길이)를 넘어서면 수행
		if (arr.length != t) {
			System.out.println("입력받을 숫자 길이를 벗어났습니다.");
			return;
		}
		
		//배열에 있는 값을 정수로 변환하여 합 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum); //합계 출력	
	}//--main

}//--class
