package Day10;

public class User {
	String id;
	String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String password) {
		
		this.id = id;
		this.password = password;
	}
	
	public void userInfo() {
		System.out.println("아이디 : "+this.id);
		System.out.println("비밀번호 : "+this.password);
	}
	
}


