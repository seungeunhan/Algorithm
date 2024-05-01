import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int H , M;
		int h_m, m_h, m_m;
        
		Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
		M = sc.nextInt();
			if ((0>H || H > 23) || (0>M || M> 59)) {
				System.out.println("입력 시간 범위를 벗어낫습니다.");
				return;
			}else if (H == 0) {
				H = 24;
			}else if (M == 0) {
				M = 60;
				H -= 1;
			}
			
			h_m = ((H * 60) + M)-45;
			m_h = h_m / 60;
			m_m = h_m % 60;
			
			if (m_h == 24) {
				m_h = 0;
			}
			
			System.out.println(m_h + " " + m_m);
	}
}
