package Day17;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day17_02 {

	public static void main(String[] args) {

		// 자판기 : Stack 구조 : 3개 제품
		// 1.콜라스택[200](10) 2.사이다스택[300](10) 3.환타스택[400](10)
		// 2. 동전 투입
		// 3. 제품 선택 후 제품 출력 제품 차감
		// 4. 금액부족 구매 X 제품수량 X
		// 5. 잔돈 출력

		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> cola = new Stack<Integer>();
		Stack<Integer> cider = new Stack<Integer>();
		Stack<Integer> fanta = new Stack<Integer>();
		
		// Stack 객체 => List
		List<Stack<Integer>> count = new Stack<>();
		count.add(cola);
		count.add(cider);
		count.add(fanta);

		for (int i = 0; i < 10; i++) {
			count.get(0).push(200);
			count.get(1).push(300);
			count.get(2).push(400);
		}

		while (true) {
			System.out.print("동전투입 : ");
			int money = scan.nextInt();
			while (true) {
				System.out.println("1.콜라[200]:" + cola.size() + " 2.사이다[300]:" + cider.size() + " 3.환타[500]:"
						+ fanta.size() + " 4.종료");
				System.out.print("선택 : ");
				int select = scan.nextInt();
				if (select == 1) {
					if (money >= 200) {
						if (!cola.isEmpty()) {
							money -= cola.pop();
							System.out.println("잔액 : " + money);
						} else {
							System.out.println("재고가 부족합니다");
						}
					} else {
						System.out.println("잔액이 부족합니다");
						System.out.println("잔액 : " + money);
					}

				} else if (select == 2) {
					if (money >= 300) {
						if (!cider.isEmpty()) {
							money -= cider.pop();
							System.out.println("잔액 : " + money);
						} else {
							System.out.println("재고가 부족합니다");
						}
					} else {
						System.out.println("잔액이 부족합니다");
						System.out.println("잔액 : " + money);
					}
				} else if (select == 3) {
					if (money >= 200) {
						if (!fanta.isEmpty()) {
							money -= fanta.pop();
							System.out.println("잔액 : " + money);
						} else {
							System.out.println("재고가 부족합니다");
						}
					} else {
						System.out.println("잔액이 부족합니다");
						System.out.println("잔액 : " + money);
					}
				} else if (select == 4) {
					System.out.println("반환액 : " + money);
					break;
				}
			}
		}

	}

}
