package Day11;

public class SmartTV extends TV {
	//상속을 받으면 인터페이스도 따라온다
	@Override
	public void 사운드설정(int sound) {
		// TODO Auto-generated method stub
		super.사운드설정(sound);
	}
	
	@Override
	public void 실행() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV 실행");
	}
	
	@Override
	public void 종료() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV 종료");
	}
	
}
