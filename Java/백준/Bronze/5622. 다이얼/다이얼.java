import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
					//A B C D E F G H I J K L M N O P Q R S T U V W  X  Y  Z
		int [] num = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		int sum = 0;
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i)-65;//A=65이므로 알파벳 순으로 배열 0부터 접근이 가능
			sum += num[n]; //num배열의 n인덱스 값을 sum에 누적
		}
		
		System.out.println(sum);
	}// --main

}// --class
