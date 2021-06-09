package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_03 {
	public static void main(String[] args) {
		//삼목 게임
		
		Scanner scan = new Scanner(System.in);
		
		//게임판 출력
//		String[] game = new String[9];
//		game[0] = "[ ]";
//		game[1] = "[ ]";
//		game[2] = "[ ]";
//		game[3] = "[ ]";
//		game[4] = "[ ]";
//		game[5] = "[ ]";
//		game[6] = "[ ]";
//		game[7] = "[ ]";
//		game[8] = "[ ]";
		
		String[] game = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		//3. 플레이어의 입력을 받아 
		while(true) {
			
			//판 출력
			for(int i=0;i<game.length;i++) {
				System.out.print(game[i]);
				if(i%3==2) System.out.println();
			}
			
			//사용자
			while(true){
				System.out.print("번호 선택 [0~8] : ");
				int select = scan.nextInt();
				
				//이미 둔 자리에는 입력 X
				if(game[select].equals("[ ]")) {
					game[select] = "[O]";
					break;
				}
				else System.out.println("이미 둔 자리입니다. 다른 곳을 선택해주세요");
			}
			
			//컴퓨터 플레이어
			while(true) {
				Random random = new Random();
				int select = random.nextInt(8);
				if(game[select].equals("[ ]")) {
					game[select] = "[X]";
					break;
				}
			}
			
			String v = "0";
			
			//승리 판단
			//가로
			for(int i=0;i<=6;i+=3) {
				
				if(game[i].equals(game[i+1]) &&game[i+1].equals(game[i+2])) {
					if(!game[i].equals("[ ]")) v = game[i];

				}
			}
			//세로
			for(int i=0;i<3;i++) {
				if(game[i].equals(game[i+3]) &&game[i+3].equals(game[i+6])){
					if(!game[i].equals("[ ]")) v = game[i];
	
				}
			}
			
			//대각선
			if(game[0].equals(game[4]) &&game[4].equals(game[8])){
				if(!game[0].equals("[ ]")) v = game[0];
			}else if(game[2].equals(game[4]) &&game[4].equals(game[6])){
				if(!game[2].equals("[ ]")) v = game[2];
			}
			
			
			if(v.equals("[O]")) {
				System.out.println("플레이어 승리");
				break;
			}else if(v.equals("[X]")) {
				System.out.println("컴퓨터 승리");
				break;
			}
			
		}//while
		
		
	}//main
		
}//class
