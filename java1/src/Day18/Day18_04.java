package Day18;

public class Day18_04 {

	public static void main(String[] args) {

		Thread movieThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("��ȭ����");
					try {
						Thread.sleep(2000); // ������ �Ͻ�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		Thread musicThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("���ǽ���");
					try {
						Thread.sleep(2000); // ������ �Ͻ�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		Thread mailThread = new Thread(new Runnable() {

			@Override
			public void run() {

				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("���Ͻ���");
					try {
						Thread.sleep(2000); // ������ �Ͻ�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		movieThread.start();
		musicThread.start();
		mailThread.start();
		System.out.println("----> ���� ������ ��");

	}

}
