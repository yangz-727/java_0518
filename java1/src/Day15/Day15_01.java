package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_01 {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Member> memberList = new ArrayList<Member>();
	public static void main(String[] args) {
		Member temp = new Member();
		while(true) {
			System.out.println("========= �α��� =========");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			System.out.print("���� : ");
			int select = scan.nextInt();
			if(select==1) {
				Member.signup();
			}else if(select==2) {
				System.out.println("----> �α���");
				
			}else if(select==3) {
				temp.findId();
			}else if(select==4) {
				temp.findPassword();
			}else if(select==5) {
				System.out.println("----> ����");
				break;
			}else System.out.println("----> �ٽ� �Է����ּ���");
		}
		
		
	}
	
	

}
