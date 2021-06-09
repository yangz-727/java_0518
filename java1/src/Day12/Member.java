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
			//System.out.println("----> 아이디가 다릅니다");
			//예외 만들기
			throw new Exception("----> 아이디가 다릅니다");
		}
		if(!password.equals("asd")){
			//System.out.println("----> 패스워드가 다릅니다");
			throw new Exception("----> 패스워드가 다릅니다");
		}
		System.out.println("----> 로그인 성공");
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
