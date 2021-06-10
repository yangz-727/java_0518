package Day17;

public class Day17_04 {

	public static void main(String[] args) {
		
		
		//에외 처리 : 예외(오류)가 발생했을 때 어떻게 처리할것인지 (처리 코드)
			// *코드상 오류를 제외한
				// if : 오류 [ 예상되는 오류 ] 차단
			//1. 예상되지 않는 오류를 처리
			//2. 경우의 수가 많은 오류 처리 => 다른 코드로 대체
			//3. try{ 오류 발생 가능성이 있는 코드 } catch{ 대체코드 }
			//4. 오류 발생하면 => 프로그램 종료 // 오류 발생시 => 예외처리 => 프로그램의 정상화
		
		
		// 예제1 ) 메모리 크기가 부족할 경우 예외 발생
			String[] arr = new String[3];
			
			
			try {
				
				arr[0] = "java";
				arr[1] = "java";
				arr[2] = "java";
				arr[3] = "java"; //예외 발생
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생 : "+ e);
			}
		
		// 예제2 ) 자료형 변환 예외처리
			try {
				String str1 = "100";
				String str2 = "a100";
				System.out.println("문자열 -> 숫자 : "+Integer.parseInt(str1));
				System.out.println("문자열 -> 숫자 : "+Integer.parseInt(str2)); // 예외 발생
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생 : "+ e);
				
			}
			
		// 예외3 ) 메모리가 null인 경우
			
			try {
				String str3 = null;
				System.out.println(str3.toString());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생 : "+ e);
			}
			
			//속도면에서는 직접 예외 클래스 사용하는 것이 더 빠르다
		
	}
	
	
	
}
