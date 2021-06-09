package Day02;

import java.util.Scanner;

public class Day02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제2 : 2명의 학생의 수학, 영어, 국 점수를 입력받아 출력
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("첫번째 학생명 : ");
//		String stu1 = scan.next();
//		
//		System.out.print("첫번째 학생의 국어 점수 : ");
//		int class1_1 = scan.nextInt();
//		
//		System.out.print("첫번째 학생의 수학 점수 : ");
//		int class1_2 = scan.nextInt();
//		
//		System.out.print("첫번째 학생의 영어 점수 : ");
//		int class1_3 = scan.nextInt();
//		
//		System.out.print("두번째 학생명 : ");
//		String stu2 = scan.next();
//		
//		System.out.print("두번째 학생의 국어 점수 : ");
//		int class2_1 = scan.nextInt();
//		
//		System.out.print("두번째 학생의 수학 점수 : ");
//		int class2_2 = scan.nextInt();
//		
//		System.out.print("두번째 학생의 영어 점수: ");
//		int class2_3 = scan.nextInt();
//		
//		int stu1all = class1_1+class1_2+class1_3;
//		double stu1avg = stu1all/3;
//		int stu2all = class2_1+class2_2+class2_3;
//		double stu2avg = stu2all/3;
//		
//		System.out.println("==================== 점수표 ====================");
//		System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
//		System.out.println(stu1+"\t"+class1_1+"\t"+class1_2+"\t"+class1_3+"\t"+stu1all+"\t"+stu1avg);
//		System.out.println(stu2+"\t"+class2_1+"\t"+class2_2+"\t"+class2_3+"\t"+stu2all+"\t"+stu2avg);
//		System.out.println("==============================================");
		
		String[] name = new String[2];
		int [][] score = new int[2][3];
		
		System.out.println("======================================");
		
		for(int i=0; i<2;i++) {
			System.out.print((i+1)+"번 학생명 : ");
			name[i] = scan.next();
			
			System.out.print((i+1)+"번 학생의 국어 점수 : ");
			score[i][0] = scan.nextInt();
			
			System.out.print((i+1)+"번 학생의 수학 점수 : ");
			score[i][1] = scan.nextInt();
			
			System.out.print((i+1)+"번 학생의 영어 점수 : ");
			score[i][2] = scan.nextInt();
		}
		int[] total = new int[2];
		double[] avg = new double[2];
		
		for(int k=0;k<2;k++) {
			total[k] = score[k][0]+score[k][1]+score[k][2];
			avg[k] = total[k]/3;
		}
		
		System.out.println("==================== 점수표 ====================");
		System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
		System.out.println(name[0]+"\t"+score[0][0]+"\t"+score[0][1]+"\t"+score[0][2]+"\t"+total[0]+"\t"+avg[0]);
		System.out.println(name[1]+"\t"+score[1][0]+"\t"+score[1][1]+"\t"+score[1][2]+"\t"+total[1]+"\t"+avg[1]);
		System.out.println("==============================================");
		
		scan.close();
		
		//과제1 : 급여 명세표
		// 입력받기 : 기본급, 수당
		// 실수령액 = 기본급 + 수당 - 세금 [기본급10%]
		
		//과제2 지폐수 세기
		// 십만원 : n장 등등
	}

}
