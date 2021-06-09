package Day10;

public class Admin extends User {
	
	String grade;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String id, String password, String grade) {
		// TODO Auto-generated constructor stub
		super(id, password);
		this.grade = grade;
	}
	
	@Override
	public void userInfo() {
		// TODO Auto-generated method stub
		super.userInfo();
		System.out.println("관리자 직급 : "+this.grade);
	}
	
}
