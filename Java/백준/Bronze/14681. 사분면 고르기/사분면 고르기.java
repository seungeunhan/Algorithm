import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int y = sc.nextInt();
		
		if(a==0 || y==0) {
			System.out.println("1000~-1000 사이의 숫자를 입력해주세요.");
		}else if ((a > 1000 || a < -1000) || (y > 1000 || y < -1000)) {
			System.out.println("1000~-1000 사이의 숫자를 입력해주세요.");
		}else if (a > 0 && y > 0 ) {
			System.out.println(1);
		}else if (a < 0 && y > 0) {
			System.out.println(2);
		}else if (a < 0 && y < 0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
}

