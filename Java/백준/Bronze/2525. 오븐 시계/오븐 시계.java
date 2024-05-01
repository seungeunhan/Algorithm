import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int h, m, t, quot;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		
		if ((0 > h || h > 23) || (0 > m || m > 59)) { //시간 범위를 벗어나면 출력
			System.out.println("시간 범위를 벗어났습니다.");
		}
		
		h += ((m + t) / 60);  //((m + t) / 60) -> 몫을 현재 시간과 더함
		m = (m + t) % 60;  //나머지를 분에 저장
	
		if(h > 23 ) { //만약 24가 되면 시간을 24와 나눈 나머지를 출력함
			h %= 24;
		}
		
		System.out.println(h + " " + m);
	}
}
