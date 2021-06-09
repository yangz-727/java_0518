package Day07;


import java.util.Scanner;

public class Day07_02 {
	
	public static void main(String[] args) {
		//회원제 프로그램
			//1 2차원 배열 사용
			//2 메뉴
				//1 회원가입 
					// 아이디와 비밀번호 입력받아 배열에 저장
				//2 로그인
					// 아이디와 비밀번호를 입력받아 존재하면 로그인 성공
				//3 종료
					//반복문 종료
		
		String[][] user = new String[100][2]; 
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = scan.nextInt();
			
			if(select==1) {
				System.out.println("=====> 회원가입");
				
				System.out.print("ID : ");
				String id = scan.next();
				
				
				int sw = 0;
				//아이디 중복제거
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
							System.out.println("=====> 회원가입 완료");
							break;
						}
					}
				}else {
					System.out.println("이미 존재하는 아이디입니다.");
				}
				
				
			}else if(select==2) {
				System.out.println("======> 로그인");
				System.out.print("ID : ");
				String id = scan.next();
				System.out.print("PASSWORD : ");
				String pwd = scan.next();
				
				int sw = 0;
				
				for(int i=0;i<user.length;i++){
					if(user[i][0]!=null) { //회원이 존재하는 경우
						if(id.equals(user[i][0])&&pwd.equals(user[i][1])) {
							System.out.println("=====> 로그인 성공");
							sw=1;
							// 모든 회원의 id/pwd 출력
							
							for(int k=0;k<user.length;k++) {
								if(user[k][0]!=null) {
									System.out.println(k+1+". ID : "+user[k][0]+" / PASSWORD : "+user[k][1]);
								}else {
									break;
								}
							}
							while(true) {
								System.out.println("1. 회원탈퇴 2. 패스워드 변경 3. 로그아웃");
								System.out.print("메뉴를 선택해주세요 : ");
								int select2 = scan.nextInt();
								if(select2 == 1) {
									System.out.println("=====> 회원탈퇴");
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
									System.out.println("=====> 패스워드 변경");
									System.out.print("PASSWORD : ");
									user[i][1] = scan.next();
									System.out.println("=====> 패스워드 변경 완료");
									break;
									
								}else if(select2==3){
									System.out.println("=====> 로그아웃");
									break;
								}
							}
							break;
						}
					}
				}
				if(sw==0) System.out.println("동일한 회원정보가 없습니다.");
				
			}else {
				System.out.println("======> 종료");
				break;
			}
		}
		
		
		
		
	}	
}
