package Day02;

import java.util.Scanner;

public class Day02_02 {
	
	public static void main(String[] args) {
		
		//���� 1 : 2���� �̸��� 1���� ~ 3���� ������ �����͸� �Է� �޾� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �л��� : ");
		String stu1 = scan.next();
		
		System.out.print("ù��° �л��� 1���� �⼮ ���� : ");
		String class1_1 = scan.next();
		
		System.out.print("ù��° �л��� 2���� �⼮ ���� : ");
		String class1_2 = scan.next();
		
		System.out.print("ù��° �л��� 2���� �⼮ ���� : ");
		String class1_3 = scan.next();
		
		System.out.print("�ι�° �л��� : ");
		String stu2 = scan.next();
		
		System.out.print("�ι�° �л��� 1���� �⼮ ���� : ");
		String class2_1 = scan.next();
		
		System.out.print("�ι�° �л��� 2���� �⼮ ���� : ");
		String class2_2 = scan.next();
		
		System.out.print("�ι�° �л��� 2���� �⼮ ���� : ");
		String class2_3 = scan.next();
		
		System.out.println("========== �⼮��1 ==========");
		
		System.out.println("����\t1����\t2����\t4����");
		System.out.println(stu1+"\t"+class1_1+"\t"+class1_2+"\t"+class1_3);
		System.out.println(stu2+"\t"+class2_1+"\t"+class2_2+"\t"+class2_3);
		System.out.println("============================");
		
		scan.close();
	}
}
