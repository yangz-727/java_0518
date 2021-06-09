package Day02;

import java.util.Scanner;

public class Day02_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제2 지폐수 세기
		// 십만원 : n장 등등
		
		Scanner scan = new Scanner(System.in);
		
		int money;
		int count;
		int[] unit= {100000,50000,10000,5000,1000,500,100,50,10};
		int i=0;
		
		System.out.print("금액을 입력하세요 : ");
		money = scan.nextInt();
		
		while(i!=9) {
			count=money/unit[i];
			System.out.println(unit[i]+"원 : "+count+"장");
			money %= unit[i];
			i++;
			
		}
		System.out.println("나머지 : "+money);
		scan.close();
	}

}
