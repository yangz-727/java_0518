package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_03 {

	
	//List -> Map
	public static ArrayList< Map<Integer, User>> userMap = new ArrayList<>();
	public static ArrayList< Map<Integer, Board>> boardMap = new ArrayList<>();
	
	//Map -> List
	public static Map<String, ArrayList<Map<Integer,User>>> superMap = new HashMap<>();
	public static Set<Map<String, User>> set = new HashSet<>();
	
	//Map -> Set
	public static Map<String, Set<User>> map2 = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		// �Խ��� => ī�װ�
		
		//Map<ȸ����ȣ, User>
		// Map<�Խù���ȣ, Board>
		
		// ������ Map ������ ���� List ����
		//List = Map<k,v>
		
		superMap.put("user", userMap);
		
		Map<String,User>map = new HashMap<>();
		map.put("1", new User());
		set.add(map);
		
		
	}
	
	
	
}
