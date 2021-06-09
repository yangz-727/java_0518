package Day02;

import java.util.Scanner;

public class Day02_02 {
	
	public static void main(String[] args) {
		
		//예제 1 : 2명의 이름과 1교시 ~ 3교시 까지의 데이터를 입력 받아 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 학생명 : ");
		String stu1 = scan.next();
		
		System.out.print("첫번째 학생의 1교시 출석 여부 : ");
		String class1_1 = scan.next();
		
		System.out.print("첫번째 학생의 2교시 출석 여부 : ");
		String class1_2 = scan.next();
		
		System.out.print("첫번째 학생의 2교시 출석 여부 : ");
		String class1_3 = scan.next();
		
		System.out.print("두번째 학생명 : ");
		String stu2 = scan.next();
		
		System.out.print("두번째 학생의 1교시 출석 여부 : ");
		String class2_1 = scan.next();
		
		System.out.print("두번째 학생의 2교시 출석 여부 : ");
		String class2_2 = scan.next();
		
		System.out.print("두번째 학생의 2교시 출석 여부 : ");
		String class2_3 = scan.next();
		
		System.out.println("========== 출석부1 ==========");
		
		System.out.println("성명\t1교시\t2교시\t4교시");
		System.out.println(stu1+"\t"+class1_1+"\t"+class1_2+"\t"+class1_3);
		System.out.println(stu2+"\t"+class2_1+"\t"+class2_2+"\t"+class2_3);
		System.out.println("============================");
		
		scan.close();
	}
}
