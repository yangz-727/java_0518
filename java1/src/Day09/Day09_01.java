package Day09;

public class Day09_01 {
	
	// 1. �����
	// 2. ����
	// 3. if, for
	// 4. �迭
	
	// Ŭ���� : �޸� ���� = ����
		// 1. �ʵ� [ ���� ]
		// 2. ������ [ ��ü�� �ʱⰪ ]
			// 1. ������� :
			// 2. ������ ������ ����÷ :
			// 3. �޼ҵ�(�Լ� - �ݺ������� ����� �̸� �ۼ��� �ڵ�)
				// 1. ������� : 
	
	public static void main(String[] args) {
		
		
		//ĳ���� ����
		Character user1 = new Character();
		//new ������ : �޸�(heap) �Ҵ�, ���Ͻ� ����, ������ ����
			// ���� : �ڷ���, String
		
		// �ʵ��� �� �ֱ�
		user1.nick = "asdf";
		user1.level = 1;
		user1.hp = 100;
		user1.power = 10;
		
		Character user2 = new Character("aaa", 1, 100, 10);
		
		user1.levelUp();
		user2.levelUp();
		user1.attack(10);
		user2.attack(10);
		user1.hp -=user1.damage(10);
		user2.hp -= user2.damage(10);
		System.out.println(user1.hpPrint());
		System.out.println(user2.hpPrint());
	}
}
