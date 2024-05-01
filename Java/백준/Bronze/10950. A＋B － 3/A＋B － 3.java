import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int t, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
	}
}
