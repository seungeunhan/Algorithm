import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int a,b,c,money, maxValue;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maxValue = Math.max(a, Math.max(b, c));
		if (a==b && b==c) {
			money = 10000+(a*1000);
		}else if (a==b || a==c) {
			money = 1000+(a*100);
		}else if (b==c) {
			money = 1000+(b*100);
		}else {
			money = maxValue*100;
		}
		System.out.println(money);
	}
}
