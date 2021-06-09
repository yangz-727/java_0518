package Day14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day14_01 {

	public static void main(String[] args) {
		
		//여러가지 API
			//API : 미리 작성된 프로그램[클래스]
		
		// 날짜 관련 클래스
			//1. Date 클래스 : 시스템 날짜 / 시간
			//2. SimpleDateFormat 클래스 : 날짜형식 클래스
			//3. Calendar : 달력 클래스
		
		// 예1 ) 현재 날짜
		
		Date date = new Date();
		System.out.println("날짜 객체 : "+date);
		System.out.println("날짜 객체 정보 : "+ date.toString());
		
		
		// 예2) 날짜 형식
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("날짜 형식 변경 : "+dateFormat.format(date));  // date 객체를 형식 넣기
		
		// 예3) 달력
		Calendar calendar = Calendar.getInstance(); //현재 달력
		System.out.println(calendar);
		
		System.out.println("연도 : "+ calendar.get(calendar.YEAR));
		System.out.println("월 : "+(calendar.get(calendar.MONTH)+1)); // 1월:0 2월:1
		System.out.println("일[연단위] : "+calendar.get(calendar.DAY_OF_YEAR)); // 연단위 일수
		System.out.println("일[주단위] : "+calendar.get(calendar.DAY_OF_WEEK)); // 주단위 일수 일요일:1, 월요일:2
		System.out.println("일[월단위] : "+calendar.get(calendar.DAY_OF_MONTH)); // 월단위 일수
		
		// 예4) 요일 : 숫자 => 한글
		int day = calendar.get(calendar.DAY_OF_WEEK);
		if(day == 1) System.out.println("일요일");
		if(day == 2) System.out.println("월요일");
		if(day == 3) System.out.println("화요일");
		if(day == 4) System.out.println("수요일");
		if(day == 5) System.out.println("목요일");
		if(day == 6) System.out.println("금요일");
		if(day == 7) System.out.println("토요일");

		// 예5) 시간 
		System.out.println("오전/오후 : "+ calendar.get(calendar.AM_PM));
		int ampm = calendar.get(calendar.AM_PM);
		if(ampm==1) System.out.println("현재 오후");
		else System.out.println("현재 오전");
		
		System.out.println("현재 시 : "+ calendar.get(calendar.HOUR));
		System.out.println("현재 시 : "+ calendar.get(calendar.MINUTE));
		System.out.println("현재 시 : "+ calendar.get(calendar.SECOND));
		
		
		// 예6) 
		LocalDate 현재날짜 = LocalDate.now();
		System.out.println(현재날짜);
		
		//날짜 직접 만들기
		LocalDate userDate = LocalDate.of(2024, 6, 10);
		System.out.println("사용자 날짜 : "+userDate);
		
		LocalTime 현재시간 = LocalTime.now();
		System.out.println("현재 시간 : "+현재시간);
		
		LocalTime userTime = LocalTime.of(6, 30, 58);
		System.out.println("사용자 시간 : "+userTime);
		
		LocalDateTime 현재날짜시간 = LocalDateTime.now();
		System.out.println("현재날짜시간 : "+현재날짜시간);
		
		LocalDateTime userDateTime = LocalDateTime.of(2021, 1, 1, 9, 30, 30);
		System.out.println("사용자날짜시간 : "+userDateTime);
		
		
		// 예7) 협정시계
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정세계 시간 : "+zonedDateTime);
		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("현재 뉴욕 시간 : "+newyork);
		
		
		
	}
	
}
