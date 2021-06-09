package Day05;

import java.util.Scanner;

public class Day05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예제1 : 369 게임
			//1. 하나의 정수를 입력받아 해당 정수까지 숫자 출력
			//2. 3,6,9 포함되어 있는 수는 박수 출력
			//3. 36인경우 두번출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		
		int num = scan.nextInt();
		int i=1;
		
		while(i<=num) {
			
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.print("박수");
				if(i/10 == 3 || i/10==6 || i/10==9) System.out.print(" 박수");
				System.out.println("");
			}else if(i/10 == 3 || i/10==6 || i/10==9) {
				System.out.print("박수");
				if(i%10==3 || i%10==6 || i%10==9) System.out.print(" 박수");
				System.out.println("");
			}else System.out.println(i);
			
			i++;
		}//while end
		
		
		
	}

}
