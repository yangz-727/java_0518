package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if : ���
		
//		int score = 90;
//		String s = "����";
//		
//		if( score>= 80) {
//				if(s.equals("����"))System.out.println("A�� �հ�");
//				else System.out.println("B�� �հ�");
//			}
//		else if(score>=70) System.out.println("����");
//		else System.out.println("���հ�");
		
		
		//����1 : ���������� ����
			//1. �� ����ڿ��� �� �Է� �ޱ�
			//2. ���ؼ� �̱�� �� �Ǵ� (if)
		System.out.println("���� ���� �� [������=end] ����");
		
		Scanner scan = new Scanner(System.in);
		String userA;
		//String userB;
		int userAA = 3;
		int userBB = 3;
		
		//�¸���
		int userAC = 0;
		int userBC = 0;
		
		//�Ǽ�
		int count = 0;
		
		while(true) {
			
			System.out.print("�÷��̾� A : ");
			userA = scan.next();
				if(userA.equals("����")) userAA = 0;
				else if(userA.equals("����")) userAA=1;
				else if(userA.equals("��")) userAA=2;
				else if(userA.equals("end")) {
					//�����¸� �Ǵ�
					System.out.println("�� "+count+"�� "+"�÷��̾�A : "+userAC+" �÷��̾�B(��ǻ��) : "+userBC);
					if(userAC>userBC) System.out.println("���� �¸� �÷��̾�A ["+userAC+"]");
					else if (userAC<userBC) System.out.println("���� �¸� �÷��̾�B(��ǻ��) ["+userBC+"]");
					else if(userAC==userBC) System.out.println(" ���º� ");
					break;
				}
				else System.out.println("�߸� �Է��߽��ϴ�.");
				
			
			//��ǻ�� ���� ����
			Random random  = new Random();
			userBB = random.nextInt(3); //0~2���� ���� �߻�
			if(userBB == 0) System.out.println("�÷��̾�B(��ǻ��) : ����");
			else if(userBB==1)System.out.println("�÷��̾�B(��ǻ��) : ����");
			else System.out.println("�÷��̾�B(��ǻ��) : ��");
			
			
			
			
			//�¸��Ǵ�
			if(userAA == 0) {
				if(userBB == 0) System.out.println("���º��Դϴ�.");
				else if(userBB == 1) {
					System.out.println("�÷��̾�B(��ǻ��) �¸�!");
					userBC++;
				}
				else {
					System.out.println("�÷��̾� A �¸�!");
					userAC++;
				}
			}else if(userAA==1) {
				if(userBB == 1) System.out.println("���º��Դϴ�.");
				else if(userBB == 2) {
					System.out.println("�÷��̾�B(��ǻ��) �¸�!");
					userBC++;
				}
				else {
					System.out.println("�÷��̾� A �¸�!");
					userAC++;
				}
			}else if(userAA == 2){
				if(userBB == 2) System.out.println("���º��Դϴ�.");
				else if(userBB == 0) {
					System.out.println("�÷��̾�B(��ǻ��) �¸�!");
					userBC++;
				}
				else {
					System.out.println("�÷��̾� A �¸�!");
					userAC++;
				}
			}else {
				count--;
				System.out.println("�߸� �Էµ� ���� �ֽ��ϴ�.");
			}
			
			count++;
			System.out.println("==============================");
		}//while end
	}
	
}
