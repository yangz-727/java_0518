package Day05;

import java.util.Scanner;

public class Day05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1 : 369 ����
			//1. �ϳ��� ������ �Է¹޾� �ش� �������� ���� ���
			//2. 3,6,9 ���ԵǾ� �ִ� ���� �ڼ� ���
			//3. 36�ΰ�� �ι����
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		
		int num = scan.nextInt();
		int i=1;
		
		while(i<=num) {
			
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.print("�ڼ�");
				if(i/10 == 3 || i/10==6 || i/10==9) System.out.print(" �ڼ�");
				System.out.println("");
			}else if(i/10 == 3 || i/10==6 || i/10==9) {
				System.out.print("�ڼ�");
				if(i%10==3 || i%10==6 || i%10==9) System.out.print(" �ڼ�");
				System.out.println("");
			}else System.out.println(i);
			
			i++;
		}//while end
		
		
		
	}

}
