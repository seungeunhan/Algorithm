import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, sum=0;
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum+=(a+b);
			System.out.println(sum);
			sum=0;
		}
	}
}

