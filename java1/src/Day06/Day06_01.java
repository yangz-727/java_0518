package Day06;

import java.util.Scanner;

public class Day06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for, while, do~while
		
		
		//switch
			//(key=��)�� �ش��ϴ� case�� ã�� �� case ��� ��� 
			//break; => ����ġ Ż��
			// (key)�� if ó�� �� ��� X
			// case���� �� ��� X
			//�ӵ��� if���� ���� 
			//==> �Ϲ������� ���� ������ �ִ� ����� ���� �Ǵ��� �� ��� ex) ��ư1, ��ư2 ���
			//if�� ������, ����ġ�� ������ ����
		
		int score=80;
		switch (score) {
		case 90:
			System.out.println("A���");
			break;
		case 80:
			System.out.println("B���");
			break;
		case 70:
			System.out.println("C���");
			break;	
		default:
			System.out.println("Ż��");
			break;
		}
		
		//3���� ������ ����� ����� �� 90�� �̻� A 80�̻� B ������ Ż��
		
		int kor=80, eng=90, math=80;
		int avg = (kor+eng+math)/3;
		
		switch (avg/10) {
		case 9:
			System.out.println("A���");
			break;
		case 8:
			System.out.println("B���");
			break;
		default:
			System.out.println("Ż��");
			break;
		}
		
		//while : ���ѹݺ�, 
		int i=0;
		int sum = 0;
		while(i<10) {
			i++;
			sum+=i;
		}
		System.out.println("���� �հ� : "+sum);
		
		int j=0;
		while(true) {
			j++;
			System.out.println("���ѹݺ�"+j);
			if(j==10) break;
		}
		
		
		
		
	}//main

}//class
