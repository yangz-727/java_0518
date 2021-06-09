package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Day16_01 {

	public static void main(String[] args) {
		
		
		// �÷��� �����ӿ�ũ
			// 1. List �÷��� : ������ �ִ� ����Ʈ
				// 1. ArrayList Ŭ���� : ����ȭ X, �˻�����
				// 2. Vector Ŭ���� : ����ȭ O
				// 3. LinkedList Ŭ���� : ����/���� ����
			
		
			// 2. Set �÷��� : ������ ���� ���� (�ߺ���� X)
				// 1.HashSet Ŭ����
					//Iterator �������̽��� �̿��� ��� ����1
			
			// 3. Map �÷��� : Ű, �� => �ѽ�
				//
		
		
		// 1. ����
		List<User> list = new Vector<>();
		// �������̽� : �߻�޼ҵ� [ �������� �ʴ� �޼ҵ� ] : Ŭ���� �޸��Ҵ� �ʿ�
			// �������̽��� ȥ�ڼ� �� �� �ִ� ��� X
		Vector<String> vector = new Vector<>();
			// < > ���׸� : �ش� Ŭ������ Ŭ���� �ֱ� 
		
		// 2. �޼ҵ�
		list.add(new User());
		list.add(new User()); // �ߺ��� ����

		list.remove(0);
		System.out.println(list.size());
		
		for(User temp : list) {
			System.out.println(temp);
		}
		
		//Linked
		List<String> list3 = new ArrayList<>();
		List<String> list4 = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ�
		for(int i=0;i<10000;i++) {
			list3.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("Arraylist 10000�� ���Խ� �ɸ��ð� : "+(end-start));
		
		start = System.nanoTime(); // ���� �ð�[����] �޼ҵ�
		for(int i=0;i<10000;i++) {
			list4.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 10000�� ���Խ� �ɸ��ð� : "+(end-start));
		
		
		//HashSet Ŭ����
		// 1. ����
		Set<String> set = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set.add("java");
		set.add("java");
		set.add("c");
		set.add("database");
		System.out.println("set�� ��ü�� : "+set.size());
		
		set.remove("c"); // ���� ��ü ����
		System.out.println("set�� ��ü�� : "+set.size());
		
		for(String temp : set) {
			System.out.println(temp);
		}
		
		// get �޼ҵ尡 ���� ----> Iterator �������̽� ���
		Iterator<String> iterator = set.iterator();
		//Iterator : ���� ���� �÷��ǿ� ��� ��ü ��ȸ �������̽�
			// null ���� ���� next() �޼ҵ�� �������� �̵�
		
		while(iterator.hasNext()) {
						//.hashNext(); : ���� ��� Ȯ��
			String temp =iterator.next();
			System.out.println(temp);
		}
		
		set.clear();
		
		
		
		
		
		
	}
	
	
	
}
