package Day02;

import java.util.Scanner;

public class Day02_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제1 : 급여 명세표
		// 입력받기 : 기본급, 수당
		// 실수령액 = 기본급 + 수당 - 세금 [기본급10%]

		Scanner scan = new Scanner(System.in);
		int basic;
		int salary;
		int rs;
		
		System.out.print("기본급 : ");
		basic = scan.nextInt();
		
		System.out.print("수당 : ");
		salary = scan.nextInt();
		
		rs = basic+salary-(int)(basic*0.1);
		
		System.out.println("실수령액 : "+rs+"원");
		scan.close();
	}

}
