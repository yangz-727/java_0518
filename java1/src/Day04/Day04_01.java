package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if : 제어문
		
//		int score = 90;
//		String s = "여자";
//		
//		if( score>= 80) {
//				if(s.equals("여자"))System.out.println("A반 합격");
//				else System.out.println("B반 합격");
//			}
//		else if(score>=70) System.out.println("보류");
//		else System.out.println("불합격");
		
		
		//예제1 : 가위바위보 게임
			//1. 두 사용자에게 각 입력 받기
			//2. 비교해서 이기는 수 판단 (if)
		System.out.println("가위 바위 보 [끝내기=end] 게임");
		
		Scanner scan = new Scanner(System.in);
		String userA;
		//String userB;
		int userAA = 3;
		int userBB = 3;
		
		//승리수
		int userAC = 0;
		int userBC = 0;
		
		//판수
		int count = 0;
		
		while(true) {
			
			System.out.print("플레이어 A : ");
			userA = scan.next();
				if(userA.equals("가위")) userAA = 0;
				else if(userA.equals("바위")) userAA=1;
				else if(userA.equals("보")) userAA=2;
				else if(userA.equals("end")) {
					//최종승리 판단
					System.out.println("총 "+count+"판 "+"플레이어A : "+userAC+" 플레이어B(컴퓨터) : "+userBC);
					if(userAC>userBC) System.out.println("최종 승리 플레이어A ["+userAC+"]");
					else if (userAC<userBC) System.out.println("최종 승리 플레이어B(컴퓨터) ["+userBC+"]");
					else if(userAC==userBC) System.out.println(" 무승부 ");
					break;
				}
				else System.out.println("잘못 입력했습니다.");
				
			
			//컴퓨터 난수 생성
			Random random  = new Random();
			userBB = random.nextInt(3); //0~2까지 난수 발생
			if(userBB == 0) System.out.println("플레이어B(컴퓨터) : 가위");
			else if(userBB==1)System.out.println("플레이어B(컴퓨터) : 바위");
			else System.out.println("플레이어B(컴퓨터) : 보");
			
			
			
			
			//승리판단
			if(userAA == 0) {
				if(userBB == 0) System.out.println("무승부입니다.");
				else if(userBB == 1) {
					System.out.println("플레이어B(컴퓨터) 승리!");
					userBC++;
				}
				else {
					System.out.println("플레이어 A 승리!");
					userAC++;
				}
			}else if(userAA==1) {
				if(userBB == 1) System.out.println("무승부입니다.");
				else if(userBB == 2) {
					System.out.println("플레이어B(컴퓨터) 승리!");
					userBC++;
				}
				else {
					System.out.println("플레이어 A 승리!");
					userAC++;
				}
			}else if(userAA == 2){
				if(userBB == 2) System.out.println("무승부입니다.");
				else if(userBB == 0) {
					System.out.println("플레이어B(컴퓨터) 승리!");
					userBC++;
				}
				else {
					System.out.println("플레이어 A 승리!");
					userAC++;
				}
			}else {
				count--;
				System.out.println("잘목 입력된 값이 있습니다.");
			}
			
			count++;
			System.out.println("==============================");
		}//while end
	}
	
}
