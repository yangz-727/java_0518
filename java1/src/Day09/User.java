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
		//ȸ������
		System.out.println("----> ȸ������");
		while(true) {
			int sw=0;
			System.out.print("ID : ");
			String id = Day09_02.scan.next();
			
			if(id.equals("n")) {
				System.out.println("----> ȸ������ ����");
			}
			
			for(int i=0;i<Day09_02.userList.size();i++) {
				
				if(Day09_02.userList.get(i).id.equals(id)) {
					System.out.println("----> ���� ������� ���̵��Դϴ�.");
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
				System.out.println("----> ȸ������ �Ϸ�");
				break;
				
			}
			
			
		}
	}
	
	public void findId() {
		//���̵� ã��
		//�̸��� �ּҸ� �Է¹޾� ���̵� ��� �ݺ����� �̿��� ����Ʈ���� ã��
		System.out.println("----> ���̵� ã��");
		System.out.print("NAME : ");
		String name = Day09_02.scan.next();
		System.out.print("ADDRESS : ");
		String address = Day09_02.scan.next();
		
		for(User temp : Day09_02.userList) {
			if(temp.name.equals(name) && temp.address.equals(address)) {
				System.out.println("----> "+temp.name+"���� ���̵� : "+temp.id);
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�");
		
	}
	
	public void findPassword() {
		//��й�ȣ ã��
		System.out.println("----> ��й�ȣ ã��");
		System.out.print("ID : ");
		String id = Day09_02.scan.next();
		System.out.print("NAME : ");
		String name = Day09_02.scan.next();
		
		for(User temp : Day09_02.userList) {
			if(temp.name.equals(name) && temp.id.equals(id)) {
				System.out.println("----> "+temp.id+"���� ��й�ȣ : "+temp.password);
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�");
	}
	
	public void myBook() {
		//���� �뿩����
	}
	
	
	public void login() {
		//�α���
		System.out.print("ID : ");
		String id = Day09_02.scan.next();
		System.out.print("PASSWORD : ");
		String password = Day09_02.scan.next();
		for(int i=0; i<Day09_02.userList.size();i++) {
			if(Day09_02.userList.get(i).id.equals(id) && Day09_02.userList.get(i).password.equals(password)) {
				System.out.println("----> �α��� ����");
				if(id.equals("admin")) {
					adminMenu();
					
				}else{
					//������ �޴�  1. ���� ��� 2.�μ����� 3.�������� 4.ȸ�����
					menu(id);
				}
				return;
			}
		}
		System.out.println("----> �α��� ����");
		
	}
	public boolean logout() {
		//�α׾ƿ�
		return false;
	}
	
	public void menu(String id) {
		while(true) {
			System.out.println("===================== ȸ�� �޴� =====================");
			System.out.println("1.������� 2.�뿩 3.�뿩 4.�ݳ� 5.��������� 6.ȸ������ 7.����");
			System.out.print("���� : ");
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
			System.out.println("================== ������ �޴� ==================");
			System.out.println("1.������� 2.�������� 3.�������� 4.ȸ����� 5.�α׾ƿ�");
			System.out.print("���� : ");
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
				System.out.println("----> �α׾ƿ�");
				break;
			}
			
		}
	}
	
}
