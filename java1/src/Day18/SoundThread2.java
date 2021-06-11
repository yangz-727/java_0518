package Day18;

import java.awt.Toolkit;

public class SoundThread2 extends Thread {

	@Override
	public void run() {
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
