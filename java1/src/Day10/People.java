package Day10;

public class People {
	String name;
	int age;
	
	//持失切
	public People() {
		// TODO Auto-generated constructor stub
	}
	
	public People(String name) {
		this.name = name;
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//五社球
	public void info() {
		System.out.println(this.name);
	}
}

