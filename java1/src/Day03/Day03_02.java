package Day03;

import java.util.Scanner;

public class Day03_02 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
		 int score;
		
			

		// ����6 : �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ�
		System.out.print("input socre : "); 
		score = scan.nextInt();
		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else System.out.println("F");
		
		System.out.print("���� : "); 
		score = scan.nextInt();
		System.out.println("���� : ");
		String a;
		a = scan.next();
		
		if(score>=90) {
			if(a.equals("����")) 
				System.out.println("A-1");
				else System.out.println("A-2");
		}else if(score>=80) {
			if(a.equals("����")) System.out.println("B-1");
			else System.out.println("B-2");
		}else if(score>=70) {
			if(a.equals("����")) System.out.println("C-1");
			else System.out.println("C-2");
		}else if(score>=60) {
			if(a.equals("����")) System.out.println("D-1");
			else System.out.println("D-2");
		}else System.out.println("F");
		
	
		
	}
}
