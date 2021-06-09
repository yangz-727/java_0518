package Day10;

public class Vip extends User{
	String grade;
	
	public Vip(String id, String password, String grade) {
		// TODO Auto-generated constructor stub
		super(id, password);
		this.grade = grade;
	}
	
	@Override
	public void userInfo() {
		// TODO Auto-generated method stub
		super.userInfo();
		System.out.println(this.id+"¥‘¿« µÓ±ﬁ : "+this.grade);
	}
	
}
