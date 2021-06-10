package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_03 {

	public static Queue<String> jongjum = new LinkedList<>();
	public static Queue<String> youngsan = new LinkedList<>();
	public static Queue<String> seoul = new LinkedList<>();
	public static Queue<String> guro = new LinkedList<>();
	
	public static ArrayList<Queue<String>> state = new ArrayList<Queue<String>>();
	
	
	public static void main(String[] args) {
		
		
		//Queue ( 인터페이스 )
			//1. 전철 밀어내기
			//2. 역 : 종점역 => 용산 => 서울 => 구로
			//3. 종점역 : 전철 3개의 객체
			//4. 3초마다 하나씩 역 이동
			
			state.add(jongjum);
			state.add(youngsan);
			state.add(seoul);
			state.add(guro);
		
			state.get(0).offer("전철1");
			state.get(0).offer("전철2");
			state.get(0).offer("전철3");
			
			Scanner scan = new Scanner(System.in);
			
			
			while(true) {
				System.out.println("========= 현재 전철역 현황 =======");
				getState();
				System.out.println("전철 출발 신호");
				System.out.println("1종점 2용산 3서울 4구로");
				System.out.print("선택 : ");
				int select = scan.nextInt();
				
				if(select == 1) jmove();
				if(select == 2) ymove();
				if(select == 3) smove();
				if(select == 4) gmove();
				
				
			}
			
			
	}// main end
	
	
	
	//전철 현황 메소드
	public static void getState() {
		System.out.println("현재 종점역의 전철 수 : "+state.get(0));
		System.out.println("현재 용산역의 전철 수 : "+state.get(1));
		System.out.println("현재 서울역의 전철 수 : "+state.get(2));
		System.out.println("현재 구로역의 전철 수 : "+state.get(3));
	}
	
	public static void jmove() {
		try {
			if(state.get(0).isEmpty()) {
				System.out.println("출발할 전철이 없습니다");
				return;
			}
			System.out.println("3초 후 ~~~");
			Thread.sleep(3000); // 3초 지연
			state.get(1).offer(state.get(0).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void ymove() {
		try {
			if(state.get(1).isEmpty()) {
				System.out.println("출발할 전철이 없습니다");
				return;
			}
			System.out.println("3초 후 ~~~");
			Thread.sleep(3000); // 3초 지연
			state.get(2).offer(state.get(1).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void smove() {
		try {
			if(state.get(2).isEmpty()) {
				System.out.println("출발할 전철이 없습니다");
				return;
			}
			System.out.println("3초 후 ~~~");
			Thread.sleep(3000); // 3초 지연
			state.get(3).offer(state.get(2).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void gmove() {
		try {
			if(state.get(3).isEmpty()) {
				System.out.println("출발할 전철이 없습니다");
				return;
			}
			System.out.println("3초 후 ~~~");
			Thread.sleep(2000); // 3초 지연
			state.get(0).offer(state.get(3).poll());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
