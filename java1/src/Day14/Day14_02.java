package Day14;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Day14_02 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int sYear = scan.nextInt();
		System.out.print("���� �� : ");
		int sMonth = scan.nextInt();
		
		System.out.print("�� ���� : ");
		int eYear = scan.nextInt();
		System.out.print("�� �� : ");
		int eMonth = scan.nextInt();
		
		searchCalendar(sYear, sMonth);
		
		
	}
	
	public static void searchCalendar(int sYear, int sMonth) {
		//���� ��¥�� �޷�
				Calendar calendar = Calendar.getInstance(); // 1. ���� �޷� ��������
				int today = calendar.get(calendar.DAY_OF_MONTH); // ���� ��¥ �ϼ�
				//int year = calendar.get(calendar.YEAR);
				//int month = calendar.get(calendar.MONTH)+1;
				
				calendar.set(sYear, sMonth-1, 1); // ���� ��¥�� 1��
				int sDay = calendar.get(Calendar.DAY_OF_WEEK); // ���� ����
				int eDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // ���� ��¥ ���� ������ �ϼ�
				
				// �޷� ���
				System.out.println("==================== "+sYear+"�� "+sMonth+"�� ====================");
				System.out.println("��\t��\tȭ\t��\t��\t��\t��");
				System.out.println("===================================================");
				
				int ssDay = sDay; //���� ���� ����� ���� �ٹٲ�
				
				
				// �� ���� ��ġ ��� ����
				for(int i=1;i<sDay;i++) {
					System.out.print("\t");
				}
				for(int i=1;i<=eDay;i++) {
					if(today == i) {
						System.out.print("["+i+"]\t");
					}else {
						System.out.print(i+"\t");
					}
					
					if(ssDay%7==0)System.out.println(); //�ٹٲ�
					ssDay++;
				}
				System.out.println();
	}
	
}
