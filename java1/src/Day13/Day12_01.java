package Day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_01 {

	public static void main(String[] args) throws Exception {
		// �޸� : ������ ���� [ ���α׷� ����� �ʱ�ȭ ]
			// �������� : ����, DB, Ŭ���� ��
		
		// ��Ʈ�� : ����� ��ġ�� �������α׷��� �����ϴ� ��ü ( ����� ��� ���� ) 
			// ����Ʈ ����
		
		// ����
			// 1. ���� ����
		FileOutputStream outputStream = new FileOutputStream("c:/java/output.txt");
		// �������Ŭ���� 		��ü��		new		������("��θ�/���ϸ�.Ȯ����")
		
		// 2. ���Ͼ���
		String content = "java";
		outputStream.write(content.getBytes());
			//��ü��.write( ����Ʈ ���� )
			//String.getBytes() : ���ڿ��� ����Ʈ������ ��ȯ
		
		// 3. �Է°� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		String content2 = scan.next();
		outputStream.write(content2.getBytes());
		
		// 4. ���� ���� �߰�
		// �޸� �Ҵ��� �ٽ� �ϸ� �� �� ������ ������� ���� �Է�, true ���� ( ���ξ��� )
		// ���� ���Ͽ� ������ �߰��Ϸ���  new FileOutputStream("c:java/output.txt",true); => �̾��
			//true�� �־�����Ѵ�
		outputStream = new FileOutputStream("c:java/output.txt",true);
		System.out.print("���� ���� �Է� : ");
		String content3 = scan.next();
		outputStream.write(content3.getBytes());
		
		// 5. ���� �о����
		FileInputStream inputStream = new FileInputStream("c:java/output.txt");
		byte[] byteArr = new byte[1024]; //1kb
		inputStream.read(byteArr);
			//��ü��.read(�迭) : �Է� ��Ʈ���� �ִ� ����Ʈ�� �о�ͼ� �迭�� ����
		
		System.out.println(new String(byteArr));
							// new String(�迭��) : �ش� �迭���� ����Ʈ�� ���ڿ��� ��ȯ
	}
	
}
