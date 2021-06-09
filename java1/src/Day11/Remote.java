package Day11;

public interface Remote {

	int max =10;
	int min = 0;
	
	//추상 메소드 정의 X
	public void 실행();
	public void 종료();
	public void 사운드설정(int sound);
	
	
	// 디폴트 메소드
	public default void 채널변경() {
		System.out.println("채널변경");
	}
	
}
