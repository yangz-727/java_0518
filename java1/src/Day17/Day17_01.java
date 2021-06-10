package Day17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_01 {

	
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ : �ڷᱸ�� [ ������ ���� ���� ]
			
			// Stack Ŭ���� : LIFO
				// ��) : ctrl+z �ǵ�����
				// ��/�ⱸ ���� => LIFO ���� ���߿� ���� �޸𸮰� ���� ���� ����
					//.push(��ü) == .add(��ü)
					//.pop() : 
					//.isEmpty() : ���� ������ ��� �ִ��� Ȯ��
		
			// Queue Ŭ���� : FIFO
				// ��) �ټ����
				// ��/�ⱸ�� �ٸ� => ���� ���� ���� �޸𸮰� ���� ���� ����
					//.offer(��ü) == .add(��ü)
					//
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(300));
		
		System.out.println("���������� ���� �� : "+coinBox.size());
		
		for(Coin temp : coinBox) {
			System.out.println("���� �ݾ� : "+temp.coin);
		}
		
		while(!coinBox.isEmpty()) {
			Coin temp = coinBox.pop();
			System.out.println("pop ���� �ݾ� : "+temp.coin);
		}
		
		Queue<Coin> coinBox2 = new LinkedList<>();
			//�������̽��� �Ǿ� �־� Ŭ�����κ��� �޸𸮸� �Ҵ� �޾ƾ��Ѵ�.
		
		coinBox2.offer(new Coin(100));
		coinBox2.offer(new Coin(200));
		coinBox2.offer(new Coin(300));
		System.out.println("��������2�� ���� �� : "+coinBox2.size());
		
		
		for(Coin temp : coinBox2) {
			System.out.println("����2 �ݾ� : "+temp.coin);
		}
		
		while(!coinBox2.isEmpty()) {
			Coin temp = coinBox2.poll();
			System.out.println("poll ���� �ݾ� : "+temp.coin);
			
		}
	}
	
	
	
}
