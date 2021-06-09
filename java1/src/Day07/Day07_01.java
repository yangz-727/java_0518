package Day07;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day07_01 {
	
	public static void main(String[] args) {
		
		//학생 점수 관리 프로그램
			//1. 1차원 배열 사용
			//2. 메뉴 
				//1. 학생 수
				//2. 점수 입력
				//3. 통계 => 1등 학생, 평균, 내림차순 정렬 출력
				//4. 종료 => 무한종료
		Scanner scan = new Scanner(System.in);
		Integer[] score = null;
		
		while(true) {
			System.out.println("1. 학생 수 2. 점수 입력, 3. 통계 4. 종료");
			System.out.print("메뉴를 입력해주세요 : ");
			int menu = scan.nextInt();
			
			if(menu==1) {
				System.out.print("학생 수를 입력해주세요 : ");
				int stuCount = scan.nextInt();
				score = new Integer[stuCount];
				
			}else if(menu == 2) {
				if(score==null) {
					System.out.println("학생 수를 입력해주세요");
				}else {
					for(int i=0;i<score.length;i++) {
						System.out.print(i+1+"번 학생의 점수를 입력해주세요 : ");
						score[i]=scan.nextInt();
					}
				}
				
			}else if(menu==3) {
				int max=0;
				int sum=0;
				for(int i=0;i<score.length;i++) {
					if(max<score[i]) {
						max = score[i];
					}
					sum+=score[i];
				}
				System.out.println("가장 높은 점수 : "+max);
				System.out.println("평균 : "+(sum/score.length));
				
				//Arrays : 배열 클래스
				// .sort(배열명) : 정렬(오름차순) 메소드
				//Collections.reverseOrder() => 클래스만 가능 (int -> intger)
				Arrays.sort(score, Collections.reverseOrder());
				for(int i=0;i<score.length;i++) {
					System.out.println(i+1+"번 학생의 점수 : "+score[i]);
				}	
				
			}else if(menu==4) {
				System.out.println("======> 종료");
				break;
			}else {
				System.out.println("없는 메뉴 입니다. 다시 입력해주세요.");
			}
			
			
		}
		
		
	}
	
	
}
