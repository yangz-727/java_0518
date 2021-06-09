package Day11;

public class TV implements Remote {
	
	//필드
	int sound = 0;

	//추상 메소드 정의
	@Override
	public void 실행() {
		// TODO Auto-generated method stub
		System.out.println("tv 실행");
	}

	@Override
	public void 종료() {
		// TODO Auto-generated method stub
		System.out.println("tv 종료");
	}

	@Override
	public void 사운드설정(int sound) {
		// TODO Auto-generated method stub
		if(sound>Remote.max) {
			this.sound = Remote.max;
		}else if(sound<Remote.min) {
			this.sound = Remote.min;
		}else {
			this.sound=sound;
		}
		
		System.out.println("현재 사운드 크기 : "+this.sound);
	}
	
	
}