package Day07;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day07_01 {
	
	public static void main(String[] args) {
		
		//�л� ���� ���� ���α׷�
			//1. 1���� �迭 ���
			//2. �޴� 
				//1. �л� ��
				//2. ���� �Է�
				//3. ��� => 1�� �л�, ���, �������� ���� ���
				//4. ���� => ��������
		Scanner scan = new Scanner(System.in);
		Integer[] score = null;
		
		while(true) {
			System.out.println("1. �л� �� 2. ���� �Է�, 3. ��� 4. ����");
			System.out.print("�޴��� �Է����ּ��� : ");
			int menu = scan.nextInt();
			
			if(menu==1) {
				System.out.print("�л� ���� �Է����ּ��� : ");
				int stuCount = scan.nextInt();
				score = new Integer[stuCount];
				
			}else if(menu == 2) {
				if(score==null) {
					System.out.println("�л� ���� �Է����ּ���");
				}else {
					for(int i=0;i<score.length;i++) {
						System.out.print(i+1+"�� �л��� ������ �Է����ּ��� : ");
						score[i]=scan.nextInt();
					}
				}
				
			}else if(menu==3) {
				int max=0;
				int sum=0;
				for(int i=0;i<score.length;i++) {
					if(max<score[i]) {
						max = score[i];
					}
					sum+=score[i];
				}
				System.out.println("���� ���� ���� : "+max);
				System.out.println("��� : "+(sum/score.length));
				
				//Arrays : �迭 Ŭ����
				// .sort(�迭��) : ����(��������) �޼ҵ�
				//Collections.reverseOrder() => Ŭ������ ���� (int -> intger)
				Arrays.sort(score, Collections.reverseOrder());
				for(int i=0;i<score.length;i++) {
					System.out.println(i+1+"�� �л��� ���� : "+score[i]);
				}	
				
			}else if(menu==4) {
				System.out.println("======> ����");
				break;
			}else {
				System.out.println("���� �޴� �Դϴ�. �ٽ� �Է����ּ���.");
			}
			
			
		}
		
		
	}
	
	
}
