package Day18;

import java.awt.Toolkit;

public class SoundThread implements Runnable {
	// Runnable ������ �������̽� ����
	
	@Override
	public void run() {
		// ��Ƽ�������� �����ڵ�
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
