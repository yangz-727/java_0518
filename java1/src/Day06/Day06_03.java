package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_03 {
	public static void main(String[] args) {
		//��� ����
		
		Scanner scan = new Scanner(System.in);
		
		//������ ���
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
		
		//3. �÷��̾��� �Է��� �޾� 
		while(true) {
			
			//�� ���
			for(int i=0;i<game.length;i++) {
				System.out.print(game[i]);
				if(i%3==2) System.out.println();
			}
			
			//�����
			while(true){
				System.out.print("��ȣ ���� [0~8] : ");
				int select = scan.nextInt();
				
				//�̹� �� �ڸ����� �Է� X
				if(game[select].equals("[ ]")) {
					game[select] = "[O]";
					break;
				}
				else System.out.println("�̹� �� �ڸ��Դϴ�. �ٸ� ���� �������ּ���");
			}
			
			//��ǻ�� �÷��̾�
			while(true) {
				Random random = new Random();
				int select = random.nextInt(8);
				if(game[select].equals("[ ]")) {
					game[select] = "[X]";
					break;
				}
			}
			
			String v = "0";
			
			//�¸� �Ǵ�
			//����
			for(int i=0;i<=6;i+=3) {
				
				if(game[i].equals(game[i+1]) &&game[i+1].equals(game[i+2])) {
					if(!game[i].equals("[ ]")) v = game[i];

				}
			}
			//����
			for(int i=0;i<3;i++) {
				if(game[i].equals(game[i+3]) &&game[i+3].equals(game[i+6])){
					if(!game[i].equals("[ ]")) v = game[i];
	
				}
			}
			
			//�밢��
			if(game[0].equals(game[4]) &&game[4].equals(game[8])){
				if(!game[0].equals("[ ]")) v = game[0];
			}else if(game[2].equals(game[4]) &&game[4].equals(game[6])){
				if(!game[2].equals("[ ]")) v = game[2];
			}
			
			
			if(v.equals("[O]")) {
				System.out.println("�÷��̾� �¸�");
				break;
			}else if(v.equals("[X]")) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
			
		}//while
		
		
	}//main
		
}//class
