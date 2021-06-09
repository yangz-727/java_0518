package Day14;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Day14_02 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 연도 : ");
		int sYear = scan.nextInt();
		System.out.print("시작 월 : ");
		int sMonth = scan.nextInt();
		
		System.out.print("끝 연도 : ");
		int eYear = scan.nextInt();
		System.out.print("끝 월 : ");
		int eMonth = scan.nextInt();
		
		searchCalendar(sYear, sMonth);
		
		
	}
	
	public static void searchCalendar(int sYear, int sMonth) {
		//현재 날짜의 달력
				Calendar calendar = Calendar.getInstance(); // 1. 현재 달력 가져오기
				int today = calendar.get(calendar.DAY_OF_MONTH); // 현재 날짜 일수
				//int year = calendar.get(calendar.YEAR);
				//int month = calendar.get(calendar.MONTH)+1;
				
				calendar.set(sYear, sMonth-1, 1); // 현재 날짜의 1일
				int sDay = calendar.get(Calendar.DAY_OF_WEEK); // 시작 요일
				int eDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 현재 날짜 월의 마지막 일수
				
				// 달력 출력
				System.out.println("==================== "+sYear+"년 "+sMonth+"월 ====================");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				System.out.println("===================================================");
				
				int ssDay = sDay; //요일 구분 토요일 마다 줄바꿈
				
				
				// 현 월의 위치 잡기 공백
				for(int i=1;i<sDay;i++) {
					System.out.print("\t");
				}
				for(int i=1;i<=eDay;i++) {
					if(today == i) {
						System.out.print("["+i+"]\t");
					}else {
						System.out.print(i+"\t");
					}
					
					if(ssDay%7==0)System.out.println(); //줄바꿈
					ssDay++;
				}
				System.out.println();
	}
	
}
