package Day02;

import java.util.Scanner;

public class Day02_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����2 ����� ����
		// �ʸ��� : n�� ���
		
		Scanner scan = new Scanner(System.in);
		
		int money;
		int count;
		int[] unit= {100000,50000,10000,5000,1000,500,100,50,10};
		int i=0;
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		money = scan.nextInt();
		
		while(i!=9) {
			count=money/unit[i];
			System.out.println(unit[i]+"�� : "+count+"��");
			money %= unit[i];
			i++;
			
		}
		System.out.println("������ : "+money);
		scan.close();
	}

}
