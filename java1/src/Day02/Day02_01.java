package Day02; //��Ű����

public class Day02_01 { //Ŭ����

	
	
	public static void main(String[] args) {
		//main : ������ => �ڵ带 �о��ִ� ����
		
//		//�Է� Scanner ��ü �����
//		Scanner sc = new Scanner(System.in);
//			// new : ��ü�� �޸� �Ҵ�
//			// System.in : �Է���ġ	
//		
//		int num = sc.nextInt();
//			// sc ��ü�� ����� ���� ������ ������ ����
//		
//		System.out.println("���� �Է��� ���� "+num);
		
		// ����
		int ����1 = 0; // int ���� ����
		int ����2 = 10; // int ���� ���� + �ʱ�ȭ (���� ������ �ѹ��� ����)
		����1 = 1234; // ������ ������ ���� ����
		
		System.out.println(����1);
		System.out.println(����2);
		
		System.out.println("����2 ������ ����� �� : "+����2);
		
		// �ڷ���
		
		boolean ������ = true;
			// true, false �� ���� (1bit)
		System.out.println("boolean : "+������);
		
		char ���ں���1 = 'a';
			//char : 2����Ʈ : �������
		System.out.println("char : "+���ں���1);
		char ���ں���2 = 97;
		System.out.println(���ں���2);
		
		byte ����Ʈ���� = 100;
			// byte : 1byte : +-127
		System.out.println("����Ʈ ���� : "+����Ʈ����);
		byte ����Ʈ����2 = 'a';
		System.out.println(����Ʈ����2);
		
		short ��Ʈ���� = 'a';
		// short : 2����Ʈ : +-3��
		System.out.println("short : "+��Ʈ����);
		short ��Ʈ����2 = 100;
		System.out.println("short : "+��Ʈ����2);
		
		int ��Ʈ���� = 3000;
			// int : 4byte : +-3aks
		System.out.println("��Ʈ�� ���� : "+��Ʈ����);
		// int num = "abc"; ���ڿ� X
		int ��Ʈ����2 = 'a';
		System.out.println("��Ʈ�� ���� : "+��Ʈ����2);
		
		long �պ��� = 999999999999L;
			// long : 8byte
		System.out.println("���� ���� : "+�պ���);
		
		float �Ǽ����� = 10.522222222222f;
		System.out.println("float : "+ �Ǽ�����);
		double �Ǽ�����2 = 10.52222222222;
		System.out.println("double : "+ �Ǽ�����2);
		
		
		String ���ڿ���ü = new String("�ȳ��ϼ���");
		System.out.println("���ڿ� ��ü"+���ڿ���ü);
		
		String ���ڿ���ü2 = "�ȳ��ϼ���";
		System.out.println("���ڿ� ��ü"+���ڿ���ü2);
		
		Integer ���� = 1234;
		System.out.println("Integer(Ŭ������ int ����) : "+����);
		
		// �� ��ȯ => Ŭ����/�ڷ��� ����
		char ��ȯ1 = 123;
		int ��ȯ2 = ��ȯ1; // ����
		
		float ��ȯ3 = 10.5f;
		double ��ȯ4 = ��ȯ3; // ����
		
		//���� ����ȯ
		double ��ȯ5 = 12.5;
		float ��ȯ6 = (float)��ȯ5; // �Ұ���
	}

}
