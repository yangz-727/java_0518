package Day18;

import java.util.Scanner;

public class Day18_01 {

	
	public static void main(String[] args) {
		
		//���� ó�� : ����(����)�� �߻����� �� ��� ó���Ұ����� (ó�� �ڵ�)
		// *�ڵ�� ������ ������
			// if : ���� [ ����Ǵ� ���� ] ����
		//1. ������� �ʴ� ������ ó��
		//2. ����� ���� ���� ���� ó�� => �ٸ� �ڵ�� ��ü
		//3. try{ ���� �߻� ���ɼ��� �ִ� �ڵ� } catch(����Ŭ���� ��ü��){ ��ü�ڵ� }
		//4. ���� �߻��ϸ� => ���α׷� ���� // ���� �߻��� => ����ó�� => ���α׷��� ����ȭ
		
		
		try {
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		//���� ������
			//����޼ҵ��() throws ����Ŭ������ {}
		try {
			method();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			//���� ���þ��� ������ ó��
			System.out.println("�޼ҵ� ������ ���");
		}
		
		
		
		
	}
	
	public static void method() throws Exception {
		Class findClass = Class.forName("���ڿ�.class");
							//forName(ã�����ϴ� Ŭ������)
							//Ȥ�ó� Ŭ������ ���� ��쿡 ���� ����ó��
	}
	
}
