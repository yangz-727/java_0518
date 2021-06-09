package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_03 {
	
	
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
		
		searchCalendar(sYear, sMonth, eYear,eMonth);
		sCalendar(sYear, sMonth, eYear, eMonth);
	}
	
	public static void searchCalendar(int sYear, int sMonth, int eYear, int eMonth) {
		//���� ��¥�� �޷�
				while(true) {
					if(sYear> eYear) {
						System.out.println("----> �˻��Ұ�");
						break;
					}else if(sYear == eYear) {
						if(sYear>eYear) {
							System.out.println("----> �˻��Ұ�");
							break;
						}
					}
					
					Calendar calendar = Calendar.getInstance(); // 1. ���� �޷� ��������
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
						System.out.print(i+"\t");
						if(ssDay%7==0)System.out.println(); //�ٹٲ�
						ssDay++;
					}
					System.out.println();
					if(sYear == eYear && sMonth == eMonth) {
						break;
					}else {
						if(sMonth == 12) {
							sYear++;
							sMonth=0;
						}
						sMonth++;
					}
					
					
				}
				
	}
	public static void sCalendar(int sYear, int sMonth, int eYear, int eMonth) {
		int startMonth = 1;
		int endMonth = 12;
		
		for(int y = sYear; y<=eYear;y++) {
			if(sYear> eYear) {
				System.out.println("----> �˻��Ұ�");
				break;
			}else if(sYear == eYear) {
				if(sYear>eYear) {
					System.out.println("----> �˻��Ұ�");
					break;
				}
			}
			//Y�� �������� �������� �ش� ������ ���������� ���
			if(eYear == y) endMonth = eMonth;
			
			//Y�� ���ۿ����� ������ ���� ���۴� ���� ���
			if(sYear == y) startMonth = sMonth;
			else startMonth = 1;
			
			for(int m = startMonth; m<=endMonth;m++) {
				Day14_02.searchCalendar(y, m);
			}
			
		}
	}
}
