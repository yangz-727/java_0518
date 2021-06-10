package Day17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_01 {

	
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 : 자료구조 [ 데이터 관리 구조 ]
			
			// Stack 클래스 : LIFO
				// 예) : ctrl+z 되돌리기
				// 입/출구 동일 => LIFO 가장 나중에 들어온 메모리가 가장 먼저 나감
					//.push(객체) == .add(객체)
					//.pop() : 
					//.isEmpty() : 현재 스택이 비어 있는지 확인
		
			// Queue 클래스 : FIFO
				// 예) 줄세우기
				// 입/출구가 다름 => 가장 먼저 들어온 메모리가 가장 먼저 나감
					//.offer(객체) == .add(객체)
					//
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(300));
		
		System.out.println("동전상자의 동전 수 : "+coinBox.size());
		
		for(Coin temp : coinBox) {
			System.out.println("동전 금액 : "+temp.coin);
		}
		
		while(!coinBox.isEmpty()) {
			Coin temp = coinBox.pop();
			System.out.println("pop 동전 금액 : "+temp.coin);
		}
		
		Queue<Coin> coinBox2 = new LinkedList<>();
			//인터페이스로 되어 있어 클래스로부터 메모리를 할당 받아야한다.
		
		coinBox2.offer(new Coin(100));
		coinBox2.offer(new Coin(200));
		coinBox2.offer(new Coin(300));
		System.out.println("동전상자2의 동전 수 : "+coinBox2.size());
		
		
		for(Coin temp : coinBox2) {
			System.out.println("동전2 금액 : "+temp.coin);
		}
		
		while(!coinBox2.isEmpty()) {
			Coin temp = coinBox2.poll();
			System.out.println("poll 동전 금액 : "+temp.coin);
			
		}
	}
	
	
	
}
