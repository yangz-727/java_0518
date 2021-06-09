package Day02; //패키지명

public class Day02_01 { //클래스

	
	
	public static void main(String[] args) {
		//main : 스레드 => 코드를 읽어주는 역할
		
//		//입력 Scanner 객체 만들기
//		Scanner sc = new Scanner(System.in);
//			// new : 객체에 메모리 할당
//			// System.in : 입력장치	
//		
//		int num = sc.nextInt();
//			// sc 객체에 저장된 값을 가져와 변수에 저장
//		
//		System.out.println("현재 입력한 값은 "+num);
		
		// 변수
		int 정수1 = 0; // int 변수 선언
		int 정수2 = 10; // int 변수 선언 + 초기화 (변수 선언은 한번만 가능)
		정수1 = 1234; // 변수는 데이터 변경 가능
		
		System.out.println(정수1);
		System.out.println(정수2);
		
		System.out.println("정수2 변수의 저장된 값 : "+정수2);
		
		// 자료형
		
		boolean 논리변수 = true;
			// true, false 만 저장 (1bit)
		System.out.println("boolean : "+논리변수);
		
		char 문자변수1 = 'a';
			//char : 2바이트 : 문자출력
		System.out.println("char : "+문자변수1);
		char 문자변수2 = 97;
		System.out.println(문자변수2);
		
		byte 바이트변수 = 100;
			// byte : 1byte : +-127
		System.out.println("바이트 변수 : "+바이트변수);
		byte 바이트변수2 = 'a';
		System.out.println(바이트변수2);
		
		short 쇼트변수 = 'a';
		// short : 2바이트 : +-3만
		System.out.println("short : "+쇼트변수);
		short 쇼트변수2 = 100;
		System.out.println("short : "+쇼트변수2);
		
		int 인트변수 = 3000;
			// int : 4byte : +-3aks
		System.out.println("인트형 변수 : "+인트변수);
		// int num = "abc"; 문자열 X
		int 인트변수2 = 'a';
		System.out.println("인트형 변수 : "+인트변수2);
		
		long 롱변수 = 999999999999L;
			// long : 8byte
		System.out.println("롱형 변수 : "+롱변수);
		
		float 실수변수 = 10.522222222222f;
		System.out.println("float : "+ 실수변수);
		double 실수변수2 = 10.52222222222;
		System.out.println("double : "+ 실수변수2);
		
		
		String 문자열객체 = new String("안녕하세요");
		System.out.println("문자열 객체"+문자열객체);
		
		String 문자열객체2 = "안녕하세요";
		System.out.println("문자열 객체"+문자열객체2);
		
		Integer 정수 = 1234;
		System.out.println("Integer(클래스형 int 변수) : "+정수);
		
		// 형 변환 => 클래스/자료형 변경
		char 변환1 = 123;
		int 변환2 = 변환1; // 가능
		
		float 변환3 = 10.5f;
		double 변환4 = 변환3; // 가능
		
		//강제 형변환
		double 변환5 = 12.5;
		float 변환6 = (float)변환5; // 불가능
	}

}
