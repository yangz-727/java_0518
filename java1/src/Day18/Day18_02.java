package Day18;

import java.util.Scanner;

public class Day18_02 {

	public static int[] waitList = new int[10];
	public static void main(String[] args) {
		/*
		 * ����� ���α׷� 1. �迭[10] : �ִ� 10xla 2. �޴� 1������߰� ����ܻ���
		 * 
		 * ����ó�� 1 �迭�� �޸𸮰� �����Ұ��
		 * 
		 */

		while (true) {
			try {
				Start();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("----> �����ڿ��� ����");
			}

		}

	}

	public static void Start() {

		while (true) {
			Scanner scan = new Scanner(System.in); // ����ó�� : scanner�� �ִ� ���ڸ� �ٽ� �ʱ�ȭ
			System.out.println("===== ����� =====");
			//����� ��
			int waitTeam = 0;
			for(int i =0;i<10;i++) {
				if(waitList[i] !=0 ) {
					waitTeam++;
				}
			}
			
			
			//����� ���
			for(int i=0;i<waitTeam;i++) {
				if(waitList[i]==0) {
					System.out.println("----> ���� ������� ����ֽ��ϴ�.");
					
				}else {
					System.out.println((i+1)+"��° �� ����ο� : "+waitList[i]+"��");
				}
			}
			
			
			System.out.println("1������߰� 2����ܻ���");
			System.out.print("���� : ");
			int select = 0;
			try {
				select = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("----> ���ڸ� �Է°����մϴ�.");
			}

			if (select == 1) {
				System.out.println("----> ����� �߰�");
				for(int i = 0 ; i<10;i++) {
					if(waitList[i] == 0) {
						System.out.print("�ο� : ");
						waitList[i] = scan.nextInt();
						System.out.println("����ȣ : "+(i+1)+"\n\n");
						break;
						
					}
					if((i+1)==10) {
						System.out.println("----> ����� ���� [��ٷ��ּ���]");
					}
				}
				
			}else if(select == 2) {
				
				for(int i=0;i<10;i++) {
					
					if((i+1) == 10) {
						waitList[i] = 0;
						break;
					}
					
					//��ĭ�� ����
					waitList[i] = waitList[i+1];
					
				}
				
				
				
			}else if(select == 3) {
				return;
			}

		}

	}

}
