package Day18;

import java.util.Scanner;

public class Day18_02 {

	public static int[] waitList = new int[10];
	public static void main(String[] args) {
		/*
		 * 대기명단 프로그램 1. 배열[10] : 최대 10xla 2. 메뉴 1대기명단추가 대기명단삭제
		 * 
		 * 예외처리 1 배열에 메모리가 부족할경우
		 * 
		 */

		while (true) {
			try {
				Start();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("----> 관리자에게 문의");
			}

		}

	}

	public static void Start() {

		while (true) {
			Scanner scan = new Scanner(System.in); // 오류처리 : scanner에 있는 문자를 다시 초기화
			System.out.println("===== 대기명단 =====");
			//대기팀 수
			int waitTeam = 0;
			for(int i =0;i<10;i++) {
				if(waitList[i] !=0 ) {
					waitTeam++;
				}
			}
			
			
			//대기명단 출력
			for(int i=0;i<waitTeam;i++) {
				if(waitList[i]==0) {
					System.out.println("----> 현재 대기명단이 비어있습니다.");
					
				}else {
					System.out.println((i+1)+"번째 팀 대기인원 : "+waitList[i]+"명");
				}
			}
			
			
			System.out.println("1대기명단추가 2대기명단삭제");
			System.out.print("선택 : ");
			int select = 0;
			try {
				select = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("----> 숫자만 입력가능합니다.");
			}

			if (select == 1) {
				System.out.println("----> 대기명단 추가");
				for(int i = 0 ; i<10;i++) {
					if(waitList[i] == 0) {
						System.out.print("인원 : ");
						waitList[i] = scan.nextInt();
						System.out.println("대기번호 : "+(i+1)+"\n\n");
						break;
						
					}
					if((i+1)==10) {
						System.out.println("----> 대기줄 부족 [기다려주세요]");
					}
				}
				
			}else if(select == 2) {
				
				for(int i=0;i<10;i++) {
					
					if((i+1) == 10) {
						waitList[i] = 0;
						break;
					}
					
					//한칸씩 당기기
					waitList[i] = waitList[i+1];
					
				}
				
				
				
			}else if(select == 3) {
				return;
			}

		}

	}

}
