package Day07;


import java.util.Scanner;

public class Day07_02 {
	
	public static void main(String[] args) {
		//ȸ���� ���α׷�
			//1 2���� �迭 ���
			//2 �޴�
				//1 ȸ������ 
					// ���̵�� ��й�ȣ �Է¹޾� �迭�� ����
				//2 �α���
					// ���̵�� ��й�ȣ�� �Է¹޾� �����ϸ� �α��� ����
				//3 ����
					//�ݺ��� ����
		
		String[][] user = new String[100][2]; 
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1. ȸ������ 2. �α��� 3. ����");
			System.out.print("�޴��� �������ּ��� : ");
			int select = scan.nextInt();
			
			if(select==1) {
				System.out.println("=====> ȸ������");
				
				System.out.print("ID : ");
				String id = scan.next();
				
				
				int sw = 0;
				//���̵� �ߺ�����
				for(int i=0;i<user.length;i++) {
					if(user[i][0] != null) {
						if(id.equals(user[i][0])) {
							sw = 1;
							break;
						}
					}else break;
				}
				
				if(sw==0) {
					System.out.print("PASSWORD : ");
					String pwd =  scan.next();
					for(int i=0; i<user.length;i++) {
						if(user[i][0] == null) {
							user[i][0] = id;
							user[i][1] = pwd;
							System.out.println("=====> ȸ������ �Ϸ�");
							break;
						}
					}
				}else {
					System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
				}
				
				
			}else if(select==2) {
				System.out.println("======> �α���");
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("PASSWORD : ");
				String pwd = scan.next();
				
				int sw = 0;
				
				for(int i=0;i<user.length;i++){
					if(user[i][0]!=null) { //ȸ���� �����ϴ� ���
						if(id.equals(user[i][0])&&pwd.equals(user[i][1])) {
							System.out.println("=====> �α��� ����");
							sw=1;
							// ��� ȸ���� id/pwd ���
							
							for(int k=0;k<user.length;k++) {
								if(user[k][0]!=null) {
									System.out.println(k+1+". ID : "+user[k][0]+" / PASSWORD : "+user[k][1]);
								}else {
									break;
								}
							}
							while(true) {
								System.out.println("1. ȸ��Ż�� 2. �н����� ���� 3. �α׾ƿ�");
								System.out.print("�޴��� �������ּ��� : ");
								int select2 = scan.nextInt();
								if(select2 == 1) {
									System.out.println("=====> ȸ��Ż��");
									user[i][0]=null;
									user[i][1]=null;
									for(int j=i;j<user.length;j++) {
										if(user[j][0]!=null) {	
											user[j][0]=user[j+1][0];
											user[j][1]=user[j+1][1];
										}else {
											user[j][0]=null;
											user[j][1]=null;
											for(int k=0;k<user.length;k++) {
												if(user[k][0]!=null) {
													System.out.println(k+1+". ID : "+user[k][0]+" / PASSWORD : "+user[k][1]);
												}else break;
											}
											break;
										}
									}
									
								}else if(select2==2) {
									System.out.println("=====> �н����� ����");
									System.out.print("PASSWORD : ");
									user[i][1] = scan.next();
									System.out.println("=====> �н����� ���� �Ϸ�");
									break;
									
								}else if(select2==3){
									System.out.println("=====> �α׾ƿ�");
									break;
								}
							}
							break;
						}
					}
				}
				if(sw==0) System.out.println("������ ȸ�������� �����ϴ�.");
				
			}else {
				System.out.println("======> ����");
				break;
			}
		}
		
		
		
		
	}	
}
