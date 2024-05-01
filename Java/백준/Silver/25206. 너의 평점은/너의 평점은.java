import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double sumScore = 0; //학점
		double sumGradeScore = 0; //(학점 * 과목평점)의 합
		double gradeScore = 0; //학점 * 과목평점
        
        //과목수(20)만큼 반복
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine()); //(과목명, 학점, 등급)을 공백기준으로 한줄 입력
			String object = st.nextToken(); //과목명
			double score = Double.parseDouble(st.nextToken()); //학점
			String grade = st.nextToken(); //등급
			
			if (grade.equals("A+")) {
				gradeScore = 4.5 * score; //학점 * 과목평점
				sumGradeScore += gradeScore; //(학점 * 과목평점)의 합
			}else if (grade.equals("A0")) {
				gradeScore = 4.0 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("B+")) {
				gradeScore = 3.5 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("B0")) {
				gradeScore = 3.0 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("C+")) {
				gradeScore = 2.5 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("C0")) {
				gradeScore = 2.0 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("D+")) {
				gradeScore = 1.5 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("D0")) {
				gradeScore = 1.0 * score;
				sumGradeScore += gradeScore;
			}else if (grade.equals("F")) {
				gradeScore = 0 * score;
				sumGradeScore += gradeScore;
			}else { // 학점이 'P'일 때 무시
				continue;
			}
			
			sumScore += score; // 학점 총 합
		}//--for문
		
		double result = sumGradeScore / sumScore; //(학점 * 과목평점)의 합 / 학점 총 합
		
		System.out.printf("%.6f",result); //소수점 여섯째자리까지 출력
	}// --main

}// --class
