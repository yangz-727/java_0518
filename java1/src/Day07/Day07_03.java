package Day07;

public class Day07_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// �޸� �Ҵ� => ��ǻ�� ����
			//1. ���� => �ڷ��� : int num; ( 4byte �޸� �Ҵ� )   
			//2. �迭 : ������ �ڷ����� �������� ���� ����
				// int[] arr = new int[3] ( 3*4byte �޸� �Ҵ� )
		
		//ȸ������
			//���̵� String
			//��й�ȣ String
			//�̸� String
			//�̸��� String
			//��ȭ��ȣ int
		
		//Ŭ����(����) => ���� �ٸ� �ڷ����� �ϳ��� ����
		
		//��1 : ������ ���
			String id1 = "asdf";
			String pew1 = "asdf";
			String name1 = "asdf";
			String email1 = "asdf";
			String phone1 = "asdf";
			
		//��2 : 2���� �迭 ȸ������ �����
			String[][] user = new String[100][5];
			user[0][0] = "qwe";
			user[0][1] = "qwe";
			user[0][2] = "qwe";
			user[0][3] = "qwe";
			user[0][4] = "qwe";
			
		//��3 : Ŭ���� ȸ������ �����
		User user1 = new User();
		user1.id="qer";
		user1.password="asdf";
		user1.name = "asdf";
		user1.email = "afsdfdsa";
		user1.phone=1023143;
		
		//��4 : �Խ���
			//1.�Խù� ��ȣ
			//2. �Խù� ����
			//3. �Խù� ����
			//4. �ۼ���
			//5. ����
			//6. �ۼ���
		//====> �Խ��� Ŭ����
	}

}
