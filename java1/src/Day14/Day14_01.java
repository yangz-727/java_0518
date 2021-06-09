package Day14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day14_01 {

	public static void main(String[] args) {
		
		//�������� API
			//API : �̸� �ۼ��� ���α׷�[Ŭ����]
		
		// ��¥ ���� Ŭ����
			//1. Date Ŭ���� : �ý��� ��¥ / �ð�
			//2. SimpleDateFormat Ŭ���� : ��¥���� Ŭ����
			//3. Calendar : �޷� Ŭ����
		
		// ��1 ) ���� ��¥
		
		Date date = new Date();
		System.out.println("��¥ ��ü : "+date);
		System.out.println("��¥ ��ü ���� : "+ date.toString());
		
		
		// ��2) ��¥ ����
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println("��¥ ���� ���� : "+dateFormat.format(date));  // date ��ü�� ���� �ֱ�
		
		// ��3) �޷�
		Calendar calendar = Calendar.getInstance(); //���� �޷�
		System.out.println(calendar);
		
		System.out.println("���� : "+ calendar.get(calendar.YEAR));
		System.out.println("�� : "+(calendar.get(calendar.MONTH)+1)); // 1��:0 2��:1
		System.out.println("��[������] : "+calendar.get(calendar.DAY_OF_YEAR)); // ������ �ϼ�
		System.out.println("��[�ִ���] : "+calendar.get(calendar.DAY_OF_WEEK)); // �ִ��� �ϼ� �Ͽ���:1, ������:2
		System.out.println("��[������] : "+calendar.get(calendar.DAY_OF_MONTH)); // ������ �ϼ�
		
		// ��4) ���� : ���� => �ѱ�
		int day = calendar.get(calendar.DAY_OF_WEEK);
		if(day == 1) System.out.println("�Ͽ���");
		if(day == 2) System.out.println("������");
		if(day == 3) System.out.println("ȭ����");
		if(day == 4) System.out.println("������");
		if(day == 5) System.out.println("�����");
		if(day == 6) System.out.println("�ݿ���");
		if(day == 7) System.out.println("�����");

		// ��5) �ð� 
		System.out.println("����/���� : "+ calendar.get(calendar.AM_PM));
		int ampm = calendar.get(calendar.AM_PM);
		if(ampm==1) System.out.println("���� ����");
		else System.out.println("���� ����");
		
		System.out.println("���� �� : "+ calendar.get(calendar.HOUR));
		System.out.println("���� �� : "+ calendar.get(calendar.MINUTE));
		System.out.println("���� �� : "+ calendar.get(calendar.SECOND));
		
		
		// ��6) 
		LocalDate ���糯¥ = LocalDate.now();
		System.out.println(���糯¥);
		
		//��¥ ���� �����
		LocalDate userDate = LocalDate.of(2024, 6, 10);
		System.out.println("����� ��¥ : "+userDate);
		
		LocalTime ����ð� = LocalTime.now();
		System.out.println("���� �ð� : "+����ð�);
		
		LocalTime userTime = LocalTime.of(6, 30, 58);
		System.out.println("����� �ð� : "+userTime);
		
		LocalDateTime ���糯¥�ð� = LocalDateTime.now();
		System.out.println("���糯¥�ð� : "+���糯¥�ð�);
		
		LocalDateTime userDateTime = LocalDateTime.of(2021, 1, 1, 9, 30, 30);
		System.out.println("����ڳ�¥�ð� : "+userDateTime);
		
		
		// ��7) �����ð�
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("�������� �ð� : "+zonedDateTime);
		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� ���� �ð� : "+newyork);
		
		
		
	}
	
}
