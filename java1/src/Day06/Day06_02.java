package Day06;

public class Day06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//day1 : 출력
		//day2 : 입력
		//day3 : 변수, 자료형
		//day4 : 연산자, if
		//day5 : 반복문 for
		
		//배열 array : 특정기준[index]으로 순서대로 저장된 변수
			// 여러개의 변수를 동시에 관리하기 위해서
			// 변수 -> 메모리 할당
			// 배열 -> 여러개 변수 -> 여러개 메모리 할당 
			// 인덱스 : 변수가 배열에 저장되는 순서
			// 0부터 시작
		
		int num; //4바이트
		int num2; //4바이트
		int num3; //4바이트
		
		//배열 선언
		//0으로 초기화된다
		int[] arr = new int[3]; //4바이트*3 = 12바이트
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr); //배열의 주소값
		System.out.println(arr.length); //배열의 길이
		System.out.println(arr.toString()); // 배열의 주소값
		System.out.println(arr[0]);
		
		//1차원 배열 int[] arr = new int[5];
		//2차원 배열 int[][] arr = new int[행][열];
		
		int[][] arr2 = new int[2][2];
		arr2[0][0]=80;
		arr2[0][1]=90;
		arr2[1][0]=100;
		arr2[1][1]=110;
		
		System.out.println(arr2.length); //행 길이
		System.out.println(arr2[0].length); //열 길이
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[1][0]);
		System.out.println(arr2[1][1]);
		 
	}//main
}//class
