package Day02;

import java.util.Scanner;

public class Day02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����2 : 2���� �л��� ����, ����, �� ������ �Է¹޾� ���
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("ù��° �л��� : ");
//		String stu1 = scan.next();
//		
//		System.out.print("ù��° �л��� ���� ���� : ");
//		int class1_1 = scan.nextInt();
//		
//		System.out.print("ù��° �л��� ���� ���� : ");
//		int class1_2 = scan.nextInt();
//		
//		System.out.print("ù��° �л��� ���� ���� : ");
//		int class1_3 = scan.nextInt();
//		
//		System.out.print("�ι�° �л��� : ");
//		String stu2 = scan.next();
//		
//		System.out.print("�ι�° �л��� ���� ���� : ");
//		int class2_1 = scan.nextInt();
//		
//		System.out.print("�ι�° �л��� ���� ���� : ");
//		int class2_2 = scan.nextInt();
//		
//		System.out.print("�ι�° �л��� ���� ����: ");
//		int class2_3 = scan.nextInt();
//		
//		int stu1all = class1_1+class1_2+class1_3;
//		double stu1avg = stu1all/3;
//		int stu2all = class2_1+class2_2+class2_3;
//		double stu2avg = stu2all/3;
//		
//		System.out.println("==================== ����ǥ ====================");
//		System.out.println("�л���\t����\t����\t����\t����\t���");
//		System.out.println(stu1+"\t"+class1_1+"\t"+class1_2+"\t"+class1_3+"\t"+stu1all+"\t"+stu1avg);
//		System.out.println(stu2+"\t"+class2_1+"\t"+class2_2+"\t"+class2_3+"\t"+stu2all+"\t"+stu2avg);
//		System.out.println("==============================================");
		
		String[] name = new String[2];
		int [][] score = new int[2][3];
		
		System.out.println("======================================");
		
		for(int i=0; i<2;i++) {
			System.out.print((i+1)+"�� �л��� : ");
			name[i] = scan.next();
			
			System.out.print((i+1)+"�� �л��� ���� ���� : ");
			score[i][0] = scan.nextInt();
			
			System.out.print((i+1)+"�� �л��� ���� ���� : ");
			score[i][1] = scan.nextInt();
			
			System.out.print((i+1)+"�� �л��� ���� ���� : ");
			score[i][2] = scan.nextInt();
		}
		int[] total = new int[2];
		double[] avg = new double[2];
		
		for(int k=0;k<2;k++) {
			total[k] = score[k][0]+score[k][1]+score[k][2];
			avg[k] = total[k]/3;
		}
		
		System.out.println("==================== ����ǥ ====================");
		System.out.println("�л���\t����\t����\t����\t����\t���");
		System.out.println(name[0]+"\t"+score[0][0]+"\t"+score[0][1]+"\t"+score[0][2]+"\t"+total[0]+"\t"+avg[0]);
		System.out.println(name[1]+"\t"+score[1][0]+"\t"+score[1][1]+"\t"+score[1][2]+"\t"+total[1]+"\t"+avg[1]);
		System.out.println("==============================================");
		
		scan.close();
		
		//����1 : �޿� ��ǥ
		// �Է¹ޱ� : �⺻��, ����
		// �Ǽ��ɾ� = �⺻�� + ���� - ���� [�⺻��10%]
		
		//����2 ����� ����
		// �ʸ��� : n�� ���
	}

}
