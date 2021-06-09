package Day09;

import java.util.Random;

public class Character {
	//필드 [ 변수 설계 ]
	String nick; // 글자당 2바이트
	int level; // 4바이트
	int hp; // 4바이트
	int power; // 4바이트
	
	//생성자 : 클래스명과 동일하게 생성
	//기본 생성자 : 필드를 받지 않음
	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	//모든 필드를 받는 생성자
	public Character(String nick, int level, int hp, int power) {
		this.nick = nick;
		this.level = level;
		this.hp = hp;
		this.power = power;
	}
	
	//메소드
	//메모리를 효율적으로 사용 가능
	public void levelUp() {
		System.out.println(this.nick +"님의 레벨이 증가 했습니다");
	}
	
	public void attack(int power) {
		
		Random random = new Random();
		
		int rpower = random.nextInt(power)+1;
		
		
		System.out.println(rpower + "만큼 공격했습니다");
	}
	
	public int damage(int power) {
		Random random = new Random();
		int rpower = random.nextInt(power)+1;
		System.out.println(rpower + "만큼 피해 당했습니다");
		return rpower;
	}
	
	public int hpPrint() {
		return this.hp;
	}
	
}
