package Day03;

import java.util.Scanner;

public class Day03_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,b,c,d;
		
		//1.2���� ������ �Է¹޾� ��ū ���� ���
		System.out.print("���� A �Է� : ");
		a = scan.nextInt();
		System.out.print("���� B �Է� : ");
		b = scan.nextInt();
		
		if(a>b) System.out.println("�� ū���� "+a);
		else System.out.println("�� ū���� "+b);
		
		//2. 3���� ������ �Է� �޾� ���� ū �� ���
		System.out.print("���� A �Է� : ");
		a = scan.nextInt();
		System.out.print("���� B �Է� : ");
		b = scan.nextInt();
		System.out.print("���� C �Է� : ");
		c = scan.nextInt();
		
		if(a>b) {
			if(a>c) System.out.println("�� ū���� : "+a);
			else System.out.println("�� ū���� : "+c);
		}else {
			if(b>c) System.out.println("�� ū���� : "+b);
			else System.out.println("�� ū���� : "+c);
		}
		
		//4���� ������ �Է� �޾� �� ū�� ���
		System.out.print("���� A �Է� : ");
		a = scan.nextInt();
		System.out.print("���� B �Է� : ");
		b = scan.nextInt();
		System.out.print("���� C �Է� : ");
		c = scan.nextInt();
		System.out.print("���� D �Է� : ");
		d = scan.nextInt();
		if(a>b) {
			if(a>c) {
				if(a>d) System.out.println("�� ū���� A : "+a);
				else System.out.println("�� ū���� D : "+d);
			}else {
				if(c>d) System.out.println("�� ū���� C : "+c);
				else System.out.println("�� ū���� D : "+d);
			}
		}else {
			if(b>c) {
				if(b>d) System.out.println("�� ū���� B : "+b);
				else System.out.println("�� ū���� D : "+d);
			}else {
				if(c>d) System.out.println("�� ū���� C : "+c);
				else System.out.println("�� ū���� D : "+d);
			}
		}
	}

}
