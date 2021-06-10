package Day17;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day17_02 {

	public static void main(String[] args) {

		// ���Ǳ� : Stack ���� : 3�� ��ǰ
		// 1.�ݶ���[200](10) 2.���̴ٽ���[300](10) 3.ȯŸ����[400](10)
		// 2. ���� ����
		// 3. ��ǰ ���� �� ��ǰ ��� ��ǰ ����
		// 4. �ݾ׺��� ���� X ��ǰ���� X
		// 5. �ܵ� ���

		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> cola = new Stack<Integer>();
		Stack<Integer> cider = new Stack<Integer>();
		Stack<Integer> fanta = new Stack<Integer>();
		
		// Stack ��ü => List
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
			System.out.print("�������� : ");
			int money = scan.nextInt();
			while (true) {
				System.out.println("1.�ݶ�[200]:" + cola.size() + " 2.���̴�[300]:" + cider.size() + " 3.ȯŸ[500]:"
						+ fanta.size() + " 4.����");
				System.out.print("���� : ");
				int select = scan.nextInt();
				if (select == 1) {
					if (money >= 200) {
						if (!cola.isEmpty()) {
							money -= cola.pop();
							System.out.println("�ܾ� : " + money);
						} else {
							System.out.println("��� �����մϴ�");
						}
					} else {
						System.out.println("�ܾ��� �����մϴ�");
						System.out.println("�ܾ� : " + money);
					}

				} else if (select == 2) {
					if (money >= 300) {
						if (!cider.isEmpty()) {
							money -= cider.pop();
							System.out.println("�ܾ� : " + money);
						} else {
							System.out.println("��� �����մϴ�");
						}
					} else {
						System.out.println("�ܾ��� �����մϴ�");
						System.out.println("�ܾ� : " + money);
					}
				} else if (select == 3) {
					if (money >= 200) {
						if (!fanta.isEmpty()) {
							money -= fanta.pop();
							System.out.println("�ܾ� : " + money);
						} else {
							System.out.println("��� �����մϴ�");
						}
					} else {
						System.out.println("�ܾ��� �����մϴ�");
						System.out.println("�ܾ� : " + money);
					}
				} else if (select == 4) {
					System.out.println("��ȯ�� : " + money);
					break;
				}
			}
		}

	}

}
