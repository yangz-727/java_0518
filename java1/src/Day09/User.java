package Day09;


public class User {
	String id;
	String password;
	String name;
	String address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}


	public void addUser() {
		//회원가입
		System.out.println("----> 회원가입");
		while(true) {
			int sw=0;
			System.out.print("ID : ");
			String id = Day09_02.scan.next();
			
			if(id.equals("n")) {
				System.out.println("----> 회원가입 종료");
			}
			
			for(int i=0;i<Day09_02.userList.size();i++) {
				
				if(Day09_02.userList.get(i).id.equals(id)) {
					System.out.println("----> 현재 사용중인 아이디입니다.");
					sw=1;
					break;
				}
			}
			
			if(sw==0) {
				System.out.print("password : ");
				String password = Day09_02.scan.next();
				System.out.print("NAME : ");
				String name = Day09_02.scan.next();
				System.out.print("ADDRESS : ");
				String address = Day09_02.scan.next();
			
				User temp = new User(id,password,name,address);
				
				Day09_02.userList.add(temp);
				System.out.println("----> 회원가입 완료");
				break;
				
			}
			
			
		}
	}
	
	public void findId() {
		//아이디 찾기
		//이름과 주소를 입력받아 아이디 출력 반복문을 이용한 리스트에서 찾기
		System.out.println("----> 아이디 찾기");
		System.out.print("NAME : ");
		String name = Day09_02.scan.next();
		System.out.print("ADDRESS : ");
		String address = Day09_02.scan.next();
		
		for(User temp : Day09_02.userList) {
			if(temp.name.equals(name) && temp.address.equals(address)) {
				System.out.println("----> "+temp.name+"님의 아이디 : "+temp.id);
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다");
		
	}
	
	public void findPassword() {
		//비밀번호 찾기
		System.out.println("----> 비밀번호 찾기");
		System.out.print("ID : ");
		String id = Day09_02.scan.next();
		System.out.print("NAME : ");
		String name = Day09_02.scan.next();
		
		for(User temp : Day09_02.userList) {
			if(temp.name.equals(name) && temp.id.equals(id)) {
				System.out.println("----> "+temp.id+"님의 비밀번호 : "+temp.password);
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다");
	}
	
	public void myBook() {
		//나의 대여도서
	}
	
	
	public void login() {
		//로그인
		System.out.print("ID : ");
		String id = Day09_02.scan.next();
		System.out.print("PASSWORD : ");
		String password = Day09_02.scan.next();
		for(int i=0; i<Day09_02.userList.size();i++) {
			if(Day09_02.userList.get(i).id.equals(id) && Day09_02.userList.get(i).password.equals(password)) {
				System.out.println("----> 로그인 성공");
				if(id.equals("admin")) {
					adminMenu();
					
				}else{
					//관리자 메뉴  1. 도서 등록 2.두서수정 3.도서삭제 4.회원목록
					menu(id);
				}
				return;
			}
		}
		System.out.println("----> 로그인 실패");
		
	}
	public boolean logout() {
		//로그아웃
		return false;
	}
	
	public void menu(String id) {
		while(true) {
			System.out.println("===================== 회원 메뉴 =====================");
			System.out.println("1.도서목록 2.대여 3.대여 4.반납 5.내도서목록 6.회원수정 7.종료");
			System.out.print("선택 : ");
			int select = Day09_02.scan.nextInt();
			Book temp = new Book();
			if(select == 1) {
				temp.getList();
			}else if(select == 2) {
				temp.loanBook(id);
				
			}else if(select == 3) {
				temp.returnBook(id);
			}else if(select == 4) {
				
			}else if(select == 5) {
				
			}else if(select == 6) {
				
			}else if(select == 7) {
				break;
			}
		}	
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("================== 관리자 메뉴 ==================");
			System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.회원목록 5.로그아웃");
			System.out.print("선택 : ");
			int select = Day09_02.scan.nextInt();
			Book temp = new Book();
			if(select == 1) {
				temp.addBook();
			}else if(select ==2) {
				temp.updateBook();
			}else if(select == 3) {
				temp.deleteBook();
			}else if(select == 4) {
				
			}else if(select == 5) {
				System.out.println("----> 로그아웃");
				break;
			}
			
		}
	}
	
}
