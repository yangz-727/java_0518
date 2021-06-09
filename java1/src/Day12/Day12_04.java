package Day12;

public class Day12_04 {
	
	public static void main(String[] args) {
		//main���� throws Exception�� ���� ��� Object�� ����
		
		// ����ó�� Exception : ���� �߻��ÿ� ó�� �ڵ�
			// 1. �Ϲ����� ������ �ڵ忡�� ó��
			// 2. ����ġ ���� ���� �߻���(���α׷� ����) => ����ó�� => �����߻��ÿ��� ���α׷� ����ȭ
				// 1. �ڵ�� ������ ���� ���
			// 3. ����
				// try{ �����߻� ���ɼ��� �ִ� �ڵ� }
				// catch(����Ŭ���� ��ü��){ �����߻��� ��ü �ڵ� } 
				//finally{ ������ ����Ǵ� �ڵ� }
			// 4. ���� Ŭ����
				// 1. ���� ������ �˰� �ִ� ��� ����Ŭ���� ��� (�ӵ��鿡�� ���� �� ������)
				// 2. ���� ������ �پ��ϰų� �𸣴� ��� : Expception Ŭ���� ���
					// Exception : ��� Exception ó���� �� �� ���� [ ����Ŭ���� ]
		
			// 5. ���� ������ [ ���� ���ѱ�� ]
				// 1. �Ѱ����� ��� ���ܸ� ó���ϰ� �ٸ� �ڵ忡���� ���� ó�� �ڵ�� ���� ���ѱ��
				// => ������ �̵����� �Ѱ����� ó��
				// 2. ���������� ��ȯŸ��  �޼ҵ�� (�Ű�����) throws Exception{}
		
			// ���� ����� 
				// throw new Exception("����");
		
		// 1. ������ null�� ��� ��½� 
		try { //������ �߻��Ұ� ���� �ڵ� => �����߻��� catch�� �̵�
			// => ������ ���� ��� try ��� ����
			String data = null;
			System.out.println(data.toString()); // toString() : ��ü ���� ��ȯ	
		} catch (NullPointerException e) { // try���� ���� �߻��� catch �� ó��
			// TODO: handle exception
			System.out.println("���ܹ߻� : "+e);
		}
		
		// 2. �迭 ����
		
		try {
			String[] arr = new String[2];
			arr[0] = "��ȣ��";
			arr[1] = "�̼���";
			arr[2] = "������";
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���ܹ߻� : "+e);
		}
		
		// 3. ���� => ���ڷ� ���� �Ұ���
		try {
			String data1 = "100"; //����
			String data2 = "a100"; //����
			//���ڿ��� => ���� ��ȯ
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2)); //���� �߻�
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("���ܹ߻� : "+e);
		}
		
		
		// 4. ���� ����ó��
		
		try {
			String data = null;
			System.out.println(data.toString()); // toString() : ��ü ���� ��ȯ	
			String[] arr = new String[2];
			arr[0] = "��ȣ��";
			arr[1] = "�̼���";
			arr[2] = "������";
			String data1 = "100"; //����
			String data2 = "a100"; //����
			//���ڿ��� => ���� ��ȯ
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2)); //���� �߻�
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻� : "+e);
			
		}finally {
			System.out.println("�ڵ� ����");
		}
		
		// 5. ���� ������
		try {
			Day12_05.exceptionThrows();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻� : "+e);
		}
		
		
		
		
	}
	
	
	
	
}
