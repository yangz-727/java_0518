package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] rotto = new int[6];
		int[] num = new int[6];
		
		
			for(int k=0;k<rotto.length;k++) {
				while(true) {
					int sw=0;
					System.out.print(k+1+"번째 1~45까지 숫자를 입력해주세요 : ");
					int temp = scan.nextInt();
					if(temp<0 || temp>45) {
						System.out.println("1~45 사이 숫자만 입력해주세요");
						sw=1;
					}
					
					//중복값 제거[기존 배열에 이미 있는 수]
					for(int j=0;j<rotto.length;j++) {
						if(rotto[j]==temp) {
							System.out.println("이미 존재하는 숫자입니다.");
							sw=1;
						}
					}
					if(sw==0){
						rotto[k]=temp;
						break;
					}
			}
		
		}
		//확인
		
		//추첨번호
		for(int k=0;k<rotto.length;k++) {
			while(true) {
				int sw=0;
				Random random = new Random();
				int temp = random.nextInt(45)+1;
				
				if(temp<0 || temp>45) sw=1;
				
				//중복값 제거[기존 배열에 이미 있는 수]
				for(int j=0;j<rotto.length;j++) {
					if(num[j]==temp) sw=1;
				}
				if(sw==0){
					num[k]=temp;
					break;
				}
		}
	
		}//for
		
		System.out.print("선택한 번호 : ");
		for(int j=0;j<rotto.length;j++) {
			System.out.print(rotto[j]+" ");
		}
		System.out.println();
		System.out.print("당첨번호 : ");
		for(int j=0;j<num.length;j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();
		
		int count=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(rotto[i]==num[j]) count++;
			}
		}
		
		if(count == 6) {
			System.out.println("1등 당첨!");
		} else if(count == 5) {
			System.out.println("2등 당첨!");
		}else if(count == 4) {
			System.out.println("3등 당첨!");
		}else if(count == 3) {
			System.out.println("4등 당첨!");
		}else if(count == 2) {
			System.out.println("5등 당첨!");
		}else if(count == 1) {
			System.out.println("6등 당첨!");
		}else if(count==0) System.out.println("꽝");
		
		
		
		
	}
	
}
