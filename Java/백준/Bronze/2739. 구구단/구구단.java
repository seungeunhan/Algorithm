import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int result=0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			result = num*i;
			System.out.println(num + " * " + i + " = " + result);
		}
	}
}
