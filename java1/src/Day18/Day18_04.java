package Day18;

public class Day18_04 {

	public static void main(String[] args) {

		Thread movieThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("영화실행");
					try {
						Thread.sleep(2000); // 스레드 일시정지
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
					System.out.println("음악실행");
					try {
						Thread.sleep(2000); // 스레드 일시정지
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
					System.out.println("메일실행");
					try {
						Thread.sleep(2000); // 스레드 일시정지
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
		System.out.println("----> 메인 스레드 끝");

	}

}
