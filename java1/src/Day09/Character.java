package Day09;

import java.util.Random;

public class Character {
	//�ʵ� [ ���� ���� ]
	String nick; // ���ڴ� 2����Ʈ
	int level; // 4����Ʈ
	int hp; // 4����Ʈ
	int power; // 4����Ʈ
	
	//������ : Ŭ������� �����ϰ� ����
	//�⺻ ������ : �ʵ带 ���� ����
	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	//��� �ʵ带 �޴� ������
	public Character(String nick, int level, int hp, int power) {
		this.nick = nick;
		this.level = level;
		this.hp = hp;
		this.power = power;
	}
	
	//�޼ҵ�
	//�޸𸮸� ȿ�������� ��� ����
	public void levelUp() {
		System.out.println(this.nick +"���� ������ ���� �߽��ϴ�");
	}
	
	public void attack(int power) {
		
		Random random = new Random();
		
		int rpower = random.nextInt(power)+1;
		
		
		System.out.println(rpower + "��ŭ �����߽��ϴ�");
	}
	
	public int damage(int power) {
		Random random = new Random();
		int rpower = random.nextInt(power)+1;
		System.out.println(rpower + "��ŭ ���� ���߽��ϴ�");
		return rpower;
	}
	
	public int hpPrint() {
		return this.hp;
	}
	
}
