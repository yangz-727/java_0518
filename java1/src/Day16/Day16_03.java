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
		
		// 게시판 => 카테고리
		
		//Map<회원번호, User>
		// Map<게시물번호, Board>
		
		// 여러개 Map 관리를 위한 List 선언
		//List = Map<k,v>
		
		superMap.put("user", userMap);
		
		Map<String,User>map = new HashMap<>();
		map.put("1", new User());
		set.add(map);
		
		
	}
	
	
	
}
