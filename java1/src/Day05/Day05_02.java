package Day05;

import java.util.Scanner;

public class Day05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(조건), while(논리), do ~ while(먼저 실행 후 검사를 진행, 무조건 1번 실행)
		
		//for문
		for(int i=0;i<10;i++) {
			System.out.println(i);
			//1. 초기값 검사 2. 조건문 검사 3. 코드 실행
			// 증감식 => 조건문 검사[T] => 코드 실행
			// 증감식 => 조건문 검사[F] => 반복문 탈출
		}
		
		//예제1 : 1~50까지 출력
		for(int i=1;i<=50;i++) System.out.println(i);

		//1~50까지 3씩 증가
		for(int i=1;i<=50;i+=3) System.out.println(i);
		
		//예제3 : 1~50까지 누적합계
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum+=i;
		}
		System.out.println("1~50 누적 합계 : "+sum);
		
		//예제4 1~50까지 3배수의 누적합계
		sum=0;
		for(int i=3;i<=50;i+=3) {
			sum+=i;
		}
		System.out.println("1~50까지 3배수의 합 : "+sum);
		
		//구구단
		for(int i=2;i<=9;i++) {
			System.out.println("===== "+i+"단 =====");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		
		
		//예제7
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("*");
		}
		
		//예제8 : 입력한 정수만큼 * 출력
		
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println("");
			}
		}
		System.out.println("");
		
		//예제9
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//예제 10
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//예제11:
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=num;j++) {
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		
		//예제12:
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num;j++) {
				if(j<=i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		
		
//		//예제13: 피라미드
//		num=5;
//		int start = (int)num/2+1;
//		int end=start;
//		for(int i=1;i<=num;i++) {
//			if(end>num || start<1) break;
//			
//			for(int j=1;j<=num;j++) {
//				if(j==start || (j>=start &&j<=end)) System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println("");
//			start--;
//			end++;
//		}
		
		num=5;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=num-i;b++) System.out.print(" ");
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		num=9;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=num-i;b++) System.out.print(" ");
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(i);
			}
			System.out.println("");
			
		}
		
		num=9;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=i-1;b++) System.out.print(" ");
			for(int j=1;j<=num-i;j++) {
				System.out.print(i);
			}
			for(int b=1; b<=i-1;b++) System.out.print(" ");
			System.out.println("");
			
		}
		
		
//		
//		
//		//예제14
//		num=13;
//		start = (int)num/2+1; 
//		end=start;
//		for(int i=1;i<=num;i++) {
//			if(end>num || start<1) break;
//			
//			for(int j=1;j<=num;j++) {
//				if(j==start || (j>=start &&j<=end)) System.out.print(i);
//				else System.out.print(" ");
//			}
//			System.out.println("");
//			start--;
//			end++;
//			
//		}
//		
//		//예제15 : 역피라미드
//		num=13;
//		
//		for(int i=0;i<num;i++) {
//			for(int k=1; k<=i;k++){
//				System.out.println(" ");
			//}
//			for(int j=1;j<=num-i;j++) {
//				System.out.println(i);
//			}
//			System.out.println("");
//			
//		}
//		
		
		//에제16 다이아몬드
		
		
		
		
		//예제17 X모양
		
	}

}
