package Day17;

public class Day17_04 {

	public static void main(String[] args) {
		
		
		//���� ó�� : ����(����)�� �߻����� �� ��� ó���Ұ����� (ó�� �ڵ�)
			// *�ڵ�� ������ ������
				// if : ���� [ ����Ǵ� ���� ] ����
			//1. ������� �ʴ� ������ ó��
			//2. ����� ���� ���� ���� ó�� => �ٸ� �ڵ�� ��ü
			//3. try{ ���� �߻� ���ɼ��� �ִ� �ڵ� } catch{ ��ü�ڵ� }
			//4. ���� �߻��ϸ� => ���α׷� ���� // ���� �߻��� => ����ó�� => ���α׷��� ����ȭ
		
		
		// ����1 ) �޸� ũ�Ⱑ ������ ��� ���� �߻�
			String[] arr = new String[3];
			
			
			try {
				
				arr[0] = "java";
				arr[1] = "java";
				arr[2] = "java";
				arr[3] = "java"; //���� �߻�
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ܹ߻� : "+ e);
			}
		
		// ����2 ) �ڷ��� ��ȯ ����ó��
			try {
				String str1 = "100";
				String str2 = "a100";
				System.out.println("���ڿ� -> ���� : "+Integer.parseInt(str1));
				System.out.println("���ڿ� -> ���� : "+Integer.parseInt(str2)); // ���� �߻�
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ܹ߻� : "+ e);
				
			}
			
		// ����3 ) �޸𸮰� null�� ���
			
			try {
				String str3 = null;
				System.out.println(str3.toString());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ܹ߻� : "+ e);
			}
			
			//�ӵ��鿡���� ���� ���� Ŭ���� ����ϴ� ���� �� ������
		
	}
	
	
	
}
