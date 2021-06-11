package Day18;

import java.awt.Toolkit;

public class Day18_03 {

	public static void main(String[] args) {

		// 스레드 : 코드를 읽어주는 역할
			// main 메소드에 : main 스레드 존재
		// 멀티스레드 : 여러 코드를 동시 처리
			// 코드 병행처리
			// 컴퓨터 입장 => 병행처리 X => 순서대로 처리
			
		// 1. implements Runnable => run() 메소드 @Override
		// 2. extends Thred => run() 메소드 @Override
		// 3. new Thread(new Runnable(){ run() 메소드 @Override });
		
		// 멀티스레드 실행
		// 1. 스레드명.start() : start() => 해당 스레드 run
		

		// 예제1 ) 단일 스레드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 소리
			try {
				Thread.sleep(1000); // 스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("=========================예제1끝");

		// 예제2 ) 멀티스레드 - 인터페이스
		Runnable sound = new SoundThread();
		Thread thread1 = new Thread(sound);
		thread1.start(); // 해당 스레드의 run() 메소드 호출
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================예제2끝");

		// 예제3 ) 멀티스레드 - 클래드
		Thread thread2 = new SoundThread2();
		thread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================예제3끝");

		// 예제4 )
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 비프음 소리
					try {
						Thread.sleep(1000); // 스레드 일시정지
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================예제4끝");

		

	}

}
