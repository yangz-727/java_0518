package Day06;

public class Day06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//day1 : ���
		//day2 : �Է�
		//day3 : ����, �ڷ���
		//day4 : ������, if
		//day5 : �ݺ��� for
		
		//�迭 array : Ư������[index]���� ������� ����� ����
			// �������� ������ ���ÿ� �����ϱ� ���ؼ�
			// ���� -> �޸� �Ҵ�
			// �迭 -> ������ ���� -> ������ �޸� �Ҵ� 
			// �ε��� : ������ �迭�� ����Ǵ� ����
			// 0���� ����
		
		int num; //4����Ʈ
		int num2; //4����Ʈ
		int num3; //4����Ʈ
		
		//�迭 ����
		//0���� �ʱ�ȭ�ȴ�
		int[] arr = new int[3]; //4����Ʈ*3 = 12����Ʈ
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr); //�迭�� �ּҰ�
		System.out.println(arr.length); //�迭�� ����
		System.out.println(arr.toString()); // �迭�� �ּҰ�
		System.out.println(arr[0]);
		
		//1���� �迭 int[] arr = new int[5];
		//2���� �迭 int[][] arr = new int[��][��];
		
		int[][] arr2 = new int[2][2];
		arr2[0][0]=80;
		arr2[0][1]=90;
		arr2[1][0]=100;
		arr2[1][1]=110;
		
		System.out.println(arr2.length); //�� ����
		System.out.println(arr2[0].length); //�� ����
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[1][0]);
		System.out.println(arr2[1][1]);
		 
	}//main
}//class
