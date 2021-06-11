package Day18;

import java.util.Scanner;

public class Day18_01 {

	
	public static void main(String[] args) {
		
		//에외 처리 : 예외(오류)가 발생했을 때 어떻게 처리할것인지 (처리 코드)
		// *코드상 오류를 제외한
			// if : 오류 [ 예상되는 오류 ] 차단
		//1. 예상되지 않는 오류를 처리
		//2. 경우의 수가 많은 오류 처리 => 다른 코드로 대체
		//3. try{ 오류 발생 가능성이 있는 코드 } catch(예외클래스 객체명){ 대체코드 }
		//4. 오류 발생하면 => 프로그램 종료 // 오류 발생시 => 예외처리 => 프로그램의 정상화
		
		
		try {
			Scanner scan = new Scanner(System.in);
			int select = scan.nextInt();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		//예외 던지기
			//선언메소드명() throws 예외클래스명 {}
		try {
			method();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			//예외 관련없이 무조건 처리
			System.out.println("메소드 실행후 결과");
		}
		
		
		
		
	}
	
	public static void method() throws Exception {
		Class findClass = Class.forName("문자열.class");
							//forName(찾고자하는 클래스명)
							//혹시나 클래스가 없는 경우에 대한 예외처리
	}
	
}
