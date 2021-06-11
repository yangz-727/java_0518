package Day18;

import java.awt.Toolkit;

public class SoundThread implements Runnable {
	// Runnable 스레드 인터페이스 연결
	
	@Override
	public void run() {
		// 멀티스레드의 실행코드
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); // 비프음 소리
			try {
				Thread.sleep(1000); //스레드 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
