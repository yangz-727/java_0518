package Day04;

import java.util.Scanner;

public class Day04_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		
//		int a,b,c;
//		int min;
//		//���� ���� �� ���
//		System.out.print("���� A �Է� : ");
//		a = scan.nextInt();
//		System.out.print("���� B �Է� : ");
//		b = scan.nextInt();
//		System.out.print("���� C �Է� : ");
//		c = scan.nextInt();
//		
//		min = a;
//		if(min>b) min=b;
//		if(min>c) min=c;
//		
//		System.out.println("���� ���� �� : "+min);
//		
//		//3������ ���� �������� ���
//		System.out.print("���� A �Է� : ");
//		a = scan.nextInt();
//		System.out.print("���� B �Է� : ");
//		b = scan.nextInt();
//		System.out.print("���� C �Է� : ");
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
//		System.out.println("�������� ���� :"+a+" "+b+" "+c);
//		
//		
		// ���̵� qwe105060 ��й�ȣ 1234 ȸ�� ����
		// 1. ���̵�� ��й�ȣ�� ������ ��� �α��� ����
		// 2. ������ ���̵��  ��й�ȣ�� �ƴ� ��� �α��� �Է�â �ݺ�����
		
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
//					System.out.println("====> �α��� ����");
//					break;
//			}else {
//				System.out.println("====> ������ ȸ���� �����ϴ�. [ �ٽ� �Է����ּ��� ]");
//				continue;
//			}
//		}//while end
		
		// ����4: ���Ǳ� �����(�ݶ�[10]=>500, ���̴�[5]=>600, ȯŸ[7]=>700)
		// ���Ǳ� ���α׷� ���ѷ���
		// ����ڿ��� �ݾ� �Է� �ޱ�
		// �Է¹��� �ݾ����� ��ǰ ����
			//1. ��ǰ��ȣ�� ����
		// ���� ���� => ���� ����, => ���� ����
		int cola=10, cider=5, fanta=7;
		
		while(true) {
			
			int colaCount=0, ciderCount=0, fantaCount=0;
			
			System.out.println("--------- ���Ǳ� ���α׷� ---------");
			System.out.print("�ݾ��� �־��ּ��� : ");
			int money = scan.nextInt();
			int result=0;
			
			while(true) {
				System.out.println("1.�ݶ�[500] 2.���̴�[600] 3.ȯŸ[700] 4.����");
				System.out.print("�޴��� �������ּ��� : ");
				int select = scan.nextInt();
				
				if(select==1) {
					System.out.println("�ݶ� ���� : "+cola+"��");
					System.out.print("������ �ݶ��� ������ �Է����ּ��� : ");
					colaCount = scan.nextInt();
					if(colaCount>cola) {
						System.out.println("��� �����մϴ�.");
					}else if(money<(colaCount*500)) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else {
						if((result+colaCount*500) > money) System.out.println("�ݾ��� �����մϴ�.");
						else {
							result+=colaCount*500;
							System.out.println("��ٱ��Ͽ� �߰��߽��ϴ�.");
						}
					}
				}else if(select == 2) {
					System.out.println("���̴� ���� : "+cider+"��");
					System.out.print("������ ���̴��� ������ �Է����ּ��� : ");
					ciderCount = scan.nextInt();
					if(ciderCount>cider) {
						System.out.println("��� �����մϴ�.");
					}else if(money<(ciderCount*600)) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else {
						
						if((result+ciderCount*600) > money) System.out.println("�ݾ��� �����մϴ�.");
						else {
							result+=ciderCount*600;
							System.out.println("��ٱ��Ͽ� �߰��߽��ϴ�.");
						}
					}
				}else if(select==3) {
					System.out.println("ȯŸ ���� : "+fanta+"��");
					System.out.print("������ ȯŸ�� ������ �Է����ּ��� : ");
					fantaCount = scan.nextInt();
					if(fantaCount>fanta) {
						System.out.println("��� �����մϴ�.");
					}else if(money<(fantaCount*700)) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else {
						if((result+fantaCount*700) > money) System.out.println("�ݾ��� �����մϴ�.");
						else {
							result+=fantaCount*700;
							System.out.println("��ٱ��Ͽ� �߰��߽��ϴ�.");
						}
					}
				}else if(select==4) {
					System.out.println("=======> ��ٱ���");
					if(colaCount!=0) System.out.println("�ݶ� : "+colaCount+"�� "+"===> �� �ݾ� : "+colaCount*500);
					if(ciderCount!=0) System.out.println("���̴� : "+ciderCount+"�� "+"===> �� �ݾ� : "+ciderCount*600);
					if(fantaCount!=0) System.out.println("ȯŸ : "+fantaCount+"�� "+"===> �� �ݾ� : "+fantaCount*700);
					System.out.println("�� �ݾ� : "+result);
					money-=result;
					System.out.println("�ܵ� : "+(money));
					cola-=colaCount;
					cider-=ciderCount;
					fanta-=fantaCount;
					System.out.println("========>�����Ϸ�");
					break;
				}
			}
			
			
		}
		
		
		
	}

}
