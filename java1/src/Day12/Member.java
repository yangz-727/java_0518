package Day12;

public class Member {
	private String id;
	private String password;
	private String name;
	
	//Setter, Getter
	
	
	
	public void setMember(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public void getMember() {
		System.out.println("ID : "+this.id);
		System.out.println("PASSWORD : "+this.password);
		System.out.println("NAME : "+this.name);
	}
	
	public static void login(String id, String password) throws Exception {
		if(!id.equals("asd")){
			//System.out.println("----> ���̵� �ٸ��ϴ�");
			//���� �����
			throw new Exception("----> ���̵� �ٸ��ϴ�");
		}
		if(!password.equals("asd")){
			//System.out.println("----> �н����尡 �ٸ��ϴ�");
			throw new Exception("----> �н����尡 �ٸ��ϴ�");
		}
		System.out.println("----> �α��� ����");
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

	
	
}
