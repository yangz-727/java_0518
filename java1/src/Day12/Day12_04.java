package Day12;

public class Day12_04 {
	
	public static void main(String[] args) {
		//main에서 throws Exception을 했을 경우 Object로 간다
		
		// 예외처리 Exception : 오류 발생시에 처리 코드
			// 1. 일반적인 오류는 코드에서 처리
			// 2. 예상치 못한 오류 발생시(프로그램 종료) => 예외처리 => 오류발생시에도 프로그램 정상화
				// 1. 코드상 문제가 없는 경우
			// 3. 형태
				// try{ 오류발생 가능성이 있는 코드 }
				// catch(예외클래스 객체명){ 오류발생시 대체 코드 } 
				//finally{ 무조건 실행되는 코드 }
			// 4. 예외 클래스
				// 1. 예외 이유를 알고 있는 경우 예외클래스 사용 (속도면에서 조금 더 빠르다)
				// 2. 예외 이유가 다양하거나 모르는 경우 : Expception 클래스 사용
					// Exception : 모든 Exception 처리를 할 수 있음 [ 슈퍼클래스 ]
		
			// 5. 예외 던지기 [ 오류 떠넘기기 ]
				// 1. 한곳에서 모든 예외를 처리하고 다른 코드에서는 예외 처리 코드로 오류 떠넘기기
				// => 오류를 이동시켜 한곳에서 처리
				// 2. 접근제한자 반환타입  메소드명 (매개변수) throws Exception{}
		
			// 예외 만들기 
				// throw new Exception("예외");
		
		// 1. 변수가 null인 경우 출력시 
		try { //오류가 발생할것 같은 코드 => 오류발생시 catch로 이동
			// => 오류가 없는 경우 try 모두 실행
			String data = null;
			System.out.println(data.toString()); // toString() : 객체 정보 변환	
		} catch (NullPointerException e) { // try에서 오류 발생시 catch 문 처리
			// TODO: handle exception
			System.out.println("예외발생 : "+e);
		}
		
		// 2. 배열 오류
		
		try {
			String[] arr = new String[2];
			arr[0] = "강호동";
			arr[1] = "이수근";
			arr[2] = "은지원";
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("예외발생 : "+e);
		}
		
		// 3. 문자 => 숫자롤 변경 불가능
		try {
			String data1 = "100"; //문자
			String data2 = "a100"; //문자
			//문자열을 => 숫자 변환
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2)); //오류 발생
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("예외발생 : "+e);
		}
		
		
		// 4. 다중 예외처리
		
		try {
			String data = null;
			System.out.println(data.toString()); // toString() : 객체 정보 변환	
			String[] arr = new String[2];
			arr[0] = "강호동";
			arr[1] = "이수근";
			arr[2] = "은지원";
			String data1 = "100"; //문자
			String data2 = "a100"; //문자
			//문자열을 => 숫자 변환
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2)); //오류 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생 : "+e);
			
		}finally {
			System.out.println("코드 종료");
		}
		
		// 5. 예외 던지기
		try {
			Day12_05.exceptionThrows();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생 : "+e);
		}
		
		
		
		
	}
	
	
	
	
}
