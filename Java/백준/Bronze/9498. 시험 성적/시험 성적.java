import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 100 || a < 0 ) {
				System.out.println("1~100 사이 숫자만 입력해주세요.");
		}else if (90 <= a) {
			System.out.println("A");
		}else if (80<=a) {
			System.out.println("B");
		}else if (70<=a) {
			System.out.println("C");
		}else if (60<=a) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}

