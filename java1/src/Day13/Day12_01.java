package Day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_01 {

	public static void main(String[] args) throws Exception {
		// 메모리 : 데이터 저장 [ 프로그램 종료시 초기화 ]
			// 영구저장 : 파일, DB, 클라우드 등
		
		// 스트림 : 입출력 장치와 응용프로그램을 연결하는 객체 ( 입출력 통신 단위 ) 
			// 바이트 단위
		
		// 파일
			// 1. 파일 생성
		FileOutputStream outputStream = new FileOutputStream("c:/java/output.txt");
		// 파일출력클래스 		객체명		new		생성자("경로명/파일명.확장자")
		
		// 2. 파일쓰기
		String content = "java";
		outputStream.write(content.getBytes());
			//객체명.write( 바이트 단위 )
			//String.getBytes() : 문자열을 바이트다윈로 변환
		
		// 3. 입력값 쓰기
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 내용 입력 : ");
		String content2 = scan.next();
		outputStream.write(content2.getBytes());
		
		// 4. 파일 내용 추가
		// 메모리 할당을 다시 하면 그 전 내용은 사라지고 새로 입력, true 생략 ( 새로쓰기 )
		// 기존 파일에 내용을 추가하려면  new FileOutputStream("c:java/output.txt",true); => 이어쓰기
			//true를 넣어줘야한다
		outputStream = new FileOutputStream("c:java/output.txt",true);
		System.out.print("파일 내용 입력 : ");
		String content3 = scan.next();
		outputStream.write(content3.getBytes());
		
		// 5. 파일 읽어오기
		FileInputStream inputStream = new FileInputStream("c:java/output.txt");
		byte[] byteArr = new byte[1024]; //1kb
		inputStream.read(byteArr);
			//객체명.read(배열) : 입력 스트림에 있는 바이트를 읽어와서 배열에 저장
		
		System.out.println(new String(byteArr));
							// new String(배열명) : 해당 배열내의 바이트를 문자열로 변환
	}
	
}
