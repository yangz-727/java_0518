package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class EX1 {

	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Board> boardList = new ArrayList<Board>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//�޴� ����
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			System.out.print("���� : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				//ȸ������
				User user = new User();
				user.addUser();
			}else if(select == 2) {
				//�α���
				while(true) {
					System.out.println("----> �α���");
					System.out.print("ID : ");
					String id = scan.next();
					System.out.print("PASSWORD : ");
					String password = scan.next();
					
					User user = new User();
					boolean login = user.login(id,password);
					
					//�α��� ����
					while(login) {
						Board temp = new Board();
						System.out.println();
						temp.getBoardList();
						System.out.println();
						
						System.out.println("1.ȸ����� 2.�Խù� �ۼ� 3.�󼼺��� 4.ȸ������ 5.ȸ��Ż�� 6.�α׾ƿ�");
						System.out.print("���� : ");
						int select2 = scan.nextInt();
						
						if(select2 == 1) {
							//ȸ����� ���
							System.out.println("~ ȸ�� ��� ~");
							for(int i=0;i<userList.size();i++) {
								System.out.println(i+") "+userList.get(i).id);
							}
						}else if(select2 == 2) {
							//�Խù� �ۼ�
							temp.addBoard(id);
						}else if(select2 == 3) {
							System.out.println("----> �󼼺���");
							System.out.print("�Խù� ��ȣ : ");
							int no = scan.nextInt();
							temp.getBoard(no);
							if(boardList.get(no).writer.equals(id)) {
								while(true) {
									System.out.println("1.�Խù� ���� 2.�Խù� ���� 3.�ڷΰ���");
									System.out.print("���� : ");
									int select3 = scan.nextInt();
									
									if(select3 == 1) {
										temp.deleteBoard(no);
									}else if(select3 == 2){
										temp.updateBoard(no);
									}else if(select3==3) {
										break;
									}else {
										System.out.println("----> ���� �޴��Դϴ�");
									}
								}
							}
						}else if(select2 == 4) {
							//ȸ������
							user.updateUser(id);
						}else if(select2 == 5) {
							//ȸ��Ż��
							user.deleteUser(id);
							login = false;
						}else if(select2 == 6) {
							//�α׾ƿ�
							login = false;
						}else {
							System.out.println("----> ���� �޴��Դϴ�");
						}
					}
					
					//�α׾ƿ�
					if(login == false) {
						break;
					}
					
					
				}
				
			}else if(select==3){
				//����
				System.out.println("----> ����");
				break;
			}else {
				System.out.println("----> ���� �޴��Դϴ�");
			}
			
			
		} //while 1
		
		
	}//main
}//class
