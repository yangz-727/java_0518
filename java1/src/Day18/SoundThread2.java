package Day18;

import java.awt.Toolkit;

public class SoundThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); // ������ �Ҹ�
			try {
				Thread.sleep(1000); //������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
