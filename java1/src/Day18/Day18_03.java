package Day18;

import java.awt.Toolkit;

public class Day18_03 {

	public static void main(String[] args) {

		// ������ : �ڵ带 �о��ִ� ����
			// main �޼ҵ忡 : main ������ ����
		// ��Ƽ������ : ���� �ڵ带 ���� ó��
			// �ڵ� ����ó��
			// ��ǻ�� ���� => ����ó�� X => ������� ó��
			
		// 1. implements Runnable => run() �޼ҵ� @Override
		// 2. extends Thred => run() �޼ҵ� @Override
		// 3. new Thread(new Runnable(){ run() �޼ҵ� @Override });
		
		// ��Ƽ������ ����
		// 1. �������.start() : start() => �ش� ������ run
		

		// ����1 ) ���� ������
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ �Ҹ�
			try {
				Thread.sleep(1000); // ������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("=========================����1��");

		// ����2 ) ��Ƽ������ - �������̽�
		Runnable sound = new SoundThread();
		Thread thread1 = new Thread(sound);
		thread1.start(); // �ش� �������� run() �޼ҵ� ȣ��
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================����2��");

		// ����3 ) ��Ƽ������ - Ŭ����
		Thread thread2 = new SoundThread2();
		thread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================����3��");

		// ����4 )
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // ������ �Ҹ�
					try {
						Thread.sleep(1000); // ������ �Ͻ�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=========================����4��");

		

	}

}
