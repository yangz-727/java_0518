package Day05;

import java.util.Scanner;

public class Day05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(����), while(��), do ~ while(���� ���� �� �˻縦 ����, ������ 1�� ����)
		
		//for��
		for(int i=0;i<10;i++) {
			System.out.println(i);
			//1. �ʱⰪ �˻� 2. ���ǹ� �˻� 3. �ڵ� ����
			// ������ => ���ǹ� �˻�[T] => �ڵ� ����
			// ������ => ���ǹ� �˻�[F] => �ݺ��� Ż��
		}
		
		//����1 : 1~50���� ���
		for(int i=1;i<=50;i++) System.out.println(i);

		//1~50���� 3�� ����
		for(int i=1;i<=50;i+=3) System.out.println(i);
		
		//����3 : 1~50���� �����հ�
		int sum=0;
		for(int i=1;i<=50;i++) {
			sum+=i;
		}
		System.out.println("1~50 ���� �հ� : "+sum);
		
		//����4 1~50���� 3����� �����հ�
		sum=0;
		for(int i=3;i<=50;i+=3) {
			sum+=i;
		}
		System.out.println("1~50���� 3����� �� : "+sum);
		
		//������
		for(int i=2;i<=9;i++) {
			System.out.println("===== "+i+"�� =====");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		
		
		//����7
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("*");
		}
		
		//����8 : �Է��� ������ŭ * ���
		
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println("");
			}
		}
		System.out.println("");
		
		//����9
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//���� 10
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//����11:
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=num;j++) {
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		
		//����12:
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num;j++) {
				if(j<=i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		
		
//		//����13: �Ƕ�̵�
//		num=5;
//		int start = (int)num/2+1;
//		int end=start;
//		for(int i=1;i<=num;i++) {
//			if(end>num || start<1) break;
//			
//			for(int j=1;j<=num;j++) {
//				if(j==start || (j>=start &&j<=end)) System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println("");
//			start--;
//			end++;
//		}
		
		num=5;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=num-i;b++) System.out.print(" ");
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		num=9;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=num-i;b++) System.out.print(" ");
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(i);
			}
			System.out.println("");
			
		}
		
		num=9;
		for(int i=1;i<=num;i++) {
			for(int b=1; b<=i-1;b++) System.out.print(" ");
			for(int j=1;j<=num-i;j++) {
				System.out.print(i);
			}
			for(int b=1; b<=i-1;b++) System.out.print(" ");
			System.out.println("");
			
		}
		
		
//		
//		
//		//����14
//		num=13;
//		start = (int)num/2+1; 
//		end=start;
//		for(int i=1;i<=num;i++) {
//			if(end>num || start<1) break;
//			
//			for(int j=1;j<=num;j++) {
//				if(j==start || (j>=start &&j<=end)) System.out.print(i);
//				else System.out.print(" ");
//			}
//			System.out.println("");
//			start--;
//			end++;
//			
//		}
//		
//		//����15 : ���Ƕ�̵�
//		num=13;
//		
//		for(int i=0;i<num;i++) {
//			for(int k=1; k<=i;k++){
//				System.out.println(" ");
			//}
//			for(int j=1;j<=num-i;j++) {
//				System.out.println(i);
//			}
//			System.out.println("");
//			
//		}
//		
		
		//����16 ���̾Ƹ��
		
		
		
		
		//����17 X���
		
	}

}
