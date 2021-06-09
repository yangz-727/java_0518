package Day12_2;

public class User {
	private String id;
	private String password;
	private String name;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void signup() throws Exception {
		System.out.println("----> ȸ������");
		System.out.print("ID : ");
		String id = Day12_2.scan.next();
		
		for(User temp : Day12_2.userList) {
			if(temp.id.equals(id)){
				System.out.println("----> ������ ���̵� �ֽ��ϴ�");
				return;
			}
		}
		System.out.print("Password : ");
		String passowrd = Day12_2.scan.next();
		System.out.print("Name : ");
		String name = Day12_2.scan.next();
			
			
		User temp = new User(id, passowrd, name);
		Day12_2.userList.add(temp);
			
		//���Ͽ� �����ϱ�
		FileUtill.writeFile("c:/java/", "users.txt", Day12_2.userList);
		System.out.println("----> ȸ������ ����");
	}
	
	public void login() throws Exception {
		System.out.println("----> �α���");
			
		System.out.print("ID : ");
		String id = Day12_2.scan.next();
		System.out.print("Password : ");
		String passowrd = Day12_2.scan.next();
			
		for(User temp : Day12_2.userList) {
			if(temp.id.equals(id)&&temp.password.equals(passowrd)) {
				System.out.println("----> �α��� ����");
				break;
			}
		}
	}
	
}
