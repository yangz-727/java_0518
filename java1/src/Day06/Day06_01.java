package Day06;

import java.util.Scanner;

public class Day06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for, while, do~while
		
		
		//switch
			//(key=값)에 해당하는 case를 찾은 후 case 모두 출력 
			//break; => 스위치 탈출
			// (key)에 if 처럼 논리 사용 X
			// case에도 논리 사용 X
			//속도는 if보다 빠름 
			//==> 일반적으로 값이 정해져 있는 경우의 수를 판단할 때 사용 ex) 버튼1, 버튼2 등등
			//if는 논리제어, 스위치는 값으로 제어
		
		int score=80;
		switch (score) {
		case 90:
			System.out.println("A등급");
			break;
		case 80:
			System.out.println("B등급");
			break;
		case 70:
			System.out.println("C등급");
			break;	
		default:
			System.out.println("탈락");
			break;
		}
		
		//3개의 점수를 평균을 계산한 후 90점 이상 A 80이상 B 나머지 탈락
		
		int kor=80, eng=90, math=80;
		int avg = (kor+eng+math)/3;
		
		switch (avg/10) {
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		default:
			System.out.println("탈락");
			break;
		}
		
		//while : 무한반복, 
		int i=0;
		int sum = 0;
		while(i<10) {
			i++;
			sum+=i;
		}
		System.out.println("누적 합계 : "+sum);
		
		int j=0;
		while(true) {
			j++;
			System.out.println("무한반복"+j);
			if(j==10) break;
		}
		
		
		
		
	}//main

}//class
