package Day04;

import java.util.Scanner;

public class Day04_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		
//		int a,b,c;
//		int min;
//		//가장 작은 수 출력
//		System.out.print("정수 A 입력 : ");
//		a = scan.nextInt();
//		System.out.print("정수 B 입력 : ");
//		b = scan.nextInt();
//		System.out.print("정수 C 입력 : ");
//		c = scan.nextInt();
//		
//		min = a;
//		if(min>b) min=b;
//		if(min>c) min=c;
//		
//		System.out.println("가장 작은 수 : "+min);
//		
//		//3정수를 오름 차순으로 출력
//		System.out.print("정수 A 입력 : ");
//		a = scan.nextInt();
//		System.out.print("정수 B 입력 : ");
//		b = scan.nextInt();
//		System.out.print("정수 C 입력 : ");
//		c = scan.nextInt();
//		
//		
//		if(a>b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
//		if(b>c) {
//			int temp = b;
//			b = c;
//			c = temp;
//		}
//		if(a>b) {
//			int temp = a;
//			a = b;
//			b = temp;		
//		}
//		
//		System.out.println("오름차순 정렬 :"+a+" "+b+" "+c);
//		
//		
		// 아이디 qwe105060 비밀번호 1234 회원 존재
		// 1. 아이디와 비밀번호가 동일한 경우 로그인 성공
		// 2. 동일한 아이디와  비밀번호가 아닐 경우 로그인 입력창 반복실행
		
//		String id;
//		String password;
//		
//		while(true) {
//			System.out.print("ID : ");
//			id = scan.next();
//			System.out.print("PASSWORD : ");
//			
//			password = scan.next();
//			
//			if(id.equals("qwe1234") && password.equals("1234")) {
//					System.out.println("====> 로그인 성공");
//					break;
//			}else {
//				System.out.println("====> 동일한 회원이 없습니다. [ 다시 입력해주세요 ]");
//				continue;
//			}
//		}//while end
		
		// 문제4: 자판기 만들기(콜라[10]=>500, 사이다[5]=>600, 환타[7]=>700)
		// 자판기 프로그램 무한루프
		// 사용자에게 금액 입력 받기
		// 입력받은 금액으로 제품 구매
			//1. 제품번호와 갯수
		// 최종 구매 => 제고 감수, => 매출 증가
		int cola=10, cider=5, fanta=7;
		
		while(true) {
			
			int colaCount=0, ciderCount=0, fantaCount=0;
			
			System.out.println("--------- 자판기 프로그램 ---------");
			System.out.print("금액을 넣어주세요 : ");
			int money = scan.nextInt();
			int result=0;
			
			while(true) {
				System.out.println("1.콜라[500] 2.사이다[600] 3.환타[700] 4.결제");
				System.out.print("메뉴를 선택해주세요 : ");
				int select = scan.nextInt();
				
				if(select==1) {
					System.out.println("콜라 제고 : "+cola+"개");
					System.out.print("구매할 콜라의 개수를 입력해주세요 : ");
					colaCount = scan.nextInt();
					if(colaCount>cola) {
						System.out.println("재고가 부족합니다.");
					}else if(money<(colaCount*500)) {
						System.out.println("금액이 부족합니다.");
					}else {
						if((result+colaCount*500) > money) System.out.println("금액이 부족합니다.");
						else {
							result+=colaCount*500;
							System.out.println("장바구니에 추가했습니다.");
						}
					}
				}else if(select == 2) {
					System.out.println("사이다 제고 : "+cider+"개");
					System.out.print("구매할 사이다의 개수를 입력해주세요 : ");
					ciderCount = scan.nextInt();
					if(ciderCount>cider) {
						System.out.println("재고가 부족합니다.");
					}else if(money<(ciderCount*600)) {
						System.out.println("금액이 부족합니다.");
					}else {
						
						if((result+ciderCount*600) > money) System.out.println("금액이 부족합니다.");
						else {
							result+=ciderCount*600;
							System.out.println("장바구니에 추가했습니다.");
						}
					}
				}else if(select==3) {
					System.out.println("환타 제고 : "+fanta+"개");
					System.out.print("구매할 환타의 개수를 입력해주세요 : ");
					fantaCount = scan.nextInt();
					if(fantaCount>fanta) {
						System.out.println("재고가 부족합니다.");
					}else if(money<(fantaCount*700)) {
						System.out.println("금액이 부족합니다.");
					}else {
						if((result+fantaCount*700) > money) System.out.println("금액이 부족합니다.");
						else {
							result+=fantaCount*700;
							System.out.println("장바구니에 추가했습니다.");
						}
					}
				}else if(select==4) {
					System.out.println("=======> 장바구니");
					if(colaCount!=0) System.out.println("콜라 : "+colaCount+"개 "+"===> 총 금액 : "+colaCount*500);
					if(ciderCount!=0) System.out.println("사이다 : "+ciderCount+"개 "+"===> 총 금액 : "+ciderCount*600);
					if(fantaCount!=0) System.out.println("환타 : "+fantaCount+"개 "+"===> 총 금액 : "+fantaCount*700);
					System.out.println("총 금액 : "+result);
					money-=result;
					System.out.println("잔돈 : "+(money));
					cola-=colaCount;
					cider-=ciderCount;
					fanta-=fantaCount;
					System.out.println("========>결제완료");
					break;
				}
			}
			
			
		}
		
		
		
	}

}
