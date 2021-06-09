package Day12;

public class Day12_05 {

	//예외를 현재 클래스에서 처리하지 않고 호출한 클래스에서 예외처리
	public  static void exceptionThrows() throws Exception {
											//예외던지기 => 메소드를 호출했던 곳으로 오류 보내기
		
		Class class1 = Class.forName("java.lang.문자");
						// Class.forName("클래스명") : 해당 클래스 찾기
							//해당 클래스가 없을 수도 있고 있을 수도 있기 때문에 예외발생 가능성 있음
	}
	
	//예외 던지기를 하지 않았을 경우
	public  static void exceptionThrows2() {
		//예외던지기 => 메소드를 호출했던 곳으로 오류 보내기

	Class class1 = Class.forName("java.lang.문자");
	// Class.forName("클래스명") : 해당 클래스 찾기
	//해당 클래스가 없을 수도 있고 있을 수도 있기 때문에 예외발생 가능성 있음
	}
}
