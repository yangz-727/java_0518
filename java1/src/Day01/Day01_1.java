package Day01;

import java.util.Scanner;

public class Day01_1 {

	
	
	public static void main(String[] args) {
		
		//syso ctrl + space
		//run ctrl + F11
		System.out.println("java");
		System.out.println(10);
		
		//1. 출력하기 : System 이용한 콘솔에 출력하기
		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요10");
		System.out.println("안녕하세요"+10);
		System.out.println("안녕하세요"+"java 입니다.");
		System.out.println(10+10);
		
		System.out.print("안녕하세요\n");
		System.out.print("안녕하세요10\n");
		
		System.out.printf("\t안녕하세요 %d\n",10);
		System.out.printf("%d + %d\n",10,10);
		System.out.printf("%d\n", 10+10);
		
		//예제1 println
		System.out.println("========== 출석부1 ==========");
		System.out.println("성명\t1교시\t2교시\t4교시");
		System.out.println("유재석\t출석\t결석\t출석");
		System.out.println("강호동\t결석\t출석\t출석");
		System.out.println("============================");
		
		//예제2 print
		System.out.print("=========== 출석부2 ==========\n");
		System.out.print("성명\t1교시\t2교시\t4교시\n");
		System.out.print("유재석\t출석\t결석\t출석\n");
		System.out.print("강호동\t결석\t출석\t출석\n");
		System.out.print("============================\n");
		
		//예제3 printf
		System.out.printf("%s","=========== 출석부3 ==========\n");
		System.out.printf("%s","성명\t1교시\t2교시\t4교시\n");
		System.out.printf("%s","유재석\t출석\t결석\t출석\n");
		System.out.printf("%s","강호동\t결석\t출석\t출석\n");
		System.out.printf("%s","============================\n");
		
		System.out.printf("\n%s\n","================ 회원목록 ================");
		System.out.printf("%s\t%s\t%s\t%s\n","아이디","비밀번호","이름","주민등록번호");
		System.out.printf("%s\t%s\t%s\t%s\n","kgs2072","1523","김현수","123456-1545452");
		System.out.printf("%s\t%s\t%s\t%s\n","asdasd","1567","유재석","434352-2463547");
		System.out.printf("%s\n","========================================");
		
		//2. 입력하기 : Scanner 이용한 콘솔에 입력하기
		
		
	}//main

}
