package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_02 {

	
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ : �޸� ���� Ŭ���� ����
			// �÷��� : ����
			// �����ӿ�ũ : �̸� ������� ���α׷�
		
		// 1. List �÷���
			// 1. ArrayList
				// 1. �迭�� ������ : �迭(���� �޸�), ArrayList(���� �޸�)
					// �迭 : int[] �迭�� = new int[10] => ũ�Ⱑ ������, ȿ������ ������
				// 2. �ε��� ��� : ���� ���� 0~(n-1)����
				// 3. �߰�, ������ : �ε��� �ڵ� ����
		
		// ��1) ArrayList Ŭ����
			// 1. ����
			List<String> list = new ArrayList<>(); //�������̽�	
			ArrayList<String> list2 = new ArrayList<String>(); //Ŭ����
			//�������̽�/Ŭ������ < ����Ʈ�� ���� Ŭ������ > ����Ʈ�� = new ArrayList<��������>();
			
			// 2. �޼ҵ�
				//1. ����Ʈ�� ��ü �ֱ�
				list.add("java"); 
				list.add("python"); 
				list.add("database"); 
				list.add("c++"); 
				
				//2. ����Ʈ ��ü ȣ���ϱ�
				System.out.println(list.get(0));
				
				//3. ����Ʈ ��ü ����
				list.remove(0); // �ε����� ��ĭ�� �����
				System.out.println(list.get(0));
				
				//4. ����Ʈ�� ��ü��
				System.out.println(list.size());
				
				//5. �ݺ��� Ȱ��1
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				
				//6. �ݺ��� Ȱ��2
				for(String temp : list) {
					System.out.println(temp);
				}
				
				//7. ��ü ��� ����
				list.clear();
			
			// 2. Vactor
				// 1. ArrayList�� ������ : ����ȭ ���� ����
				
			// 3. LinkedList
				// ���� ����� ���� ()
		
		// 2. Set �÷���
		// 3. Map �÷���
		
		
		
		
	}
	
	
}
