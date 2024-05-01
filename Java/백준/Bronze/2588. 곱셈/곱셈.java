import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum=0;
		int mul = 0;
		int num =1;

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num2>0) {
			list.add(num2%10);
			num2 /= 10;
		}
		
		for (int i = 0; i < list.size(); i++) {
			mul = list.get(i)*num1;
			System.out.println(mul);
			sum += (mul*num);
			num*=10;
		}
		
		System.out.println(sum);
		
		}
	}

