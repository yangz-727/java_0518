package Day12;

public class Day12_2 {

	private String name;
	public String id;
	protected String se;
	String phone;
	
	
	//private 필드에 접근 방법
	// 직접 접근 X => public 메소드를 통해 간접 접근
	public void field(String name) {
		this.name = name;
	}
	
}
