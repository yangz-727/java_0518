package Day02;

import java.util.Scanner;

public class Day02_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1 : �޿� ��ǥ
		// �Է¹ޱ� : �⺻��, ����
		// �Ǽ��ɾ� = �⺻�� + ���� - ���� [�⺻��10%]

		Scanner scan = new Scanner(System.in);
		int basic;
		int salary;
		int rs;
		
		System.out.print("�⺻�� : ");
		basic = scan.nextInt();
		
		System.out.print("���� : ");
		salary = scan.nextInt();
		
		rs = basic+salary-(int)(basic*0.1);
		
		System.out.println("�Ǽ��ɾ� : "+rs+"��");
		scan.close();
	}

}
