package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_03 {
	
	
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
		
		searchCalendar(sYear, sMonth, eYear,eMonth);
		sCalendar(sYear, sMonth, eYear, eMonth);
	}
	
	public static void searchCalendar(int sYear, int sMonth, int eYear, int eMonth) {
		//현재 날짜의 달력
				while(true) {
					if(sYear> eYear) {
						System.out.println("----> 검색불가");
						break;
					}else if(sYear == eYear) {
						if(sYear>eYear) {
							System.out.println("----> 검색불가");
							break;
						}
					}
					
					Calendar calendar = Calendar.getInstance(); // 1. 현재 달력 가져오기
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
						System.out.print(i+"\t");
						if(ssDay%7==0)System.out.println(); //줄바꿈
						ssDay++;
					}
					System.out.println();
					if(sYear == eYear && sMonth == eMonth) {
						break;
					}else {
						if(sMonth == 12) {
							sYear++;
							sMonth=0;
						}
						sMonth++;
					}
					
					
				}
				
	}
	public static void sCalendar(int sYear, int sMonth, int eYear, int eMonth) {
		int startMonth = 1;
		int endMonth = 12;
		
		for(int y = sYear; y<=eYear;y++) {
			if(sYear> eYear) {
				System.out.println("----> 검색불가");
				break;
			}else if(sYear == eYear) {
				if(sYear>eYear) {
					System.out.println("----> 검색불가");
					break;
				}
			}
			//Y가 끝연도를 만났을때 해당 연도는 끝월까지만 출력
			if(eYear == y) endMonth = eMonth;
			
			//Y가 시작연도와 동일한 경우는 시작달 부터 출력
			if(sYear == y) startMonth = sMonth;
			else startMonth = 1;
			
			for(int m = startMonth; m<=endMonth;m++) {
				Day14_02.searchCalendar(y, m);
			}
			
		}
	}
}
