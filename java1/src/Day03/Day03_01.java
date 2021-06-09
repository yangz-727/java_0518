package Day03;

public class Day03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술연산자
		
		int a = 12;
		int b = 24;
		int c = 45;
		
		System.out.println("더하기 : "+(a+b));
		System.out.println("빼하기 : "+(a-b));
		System.out.println("곱하기 : "+(a*b));
		System.out.println("나누기 : "+(c/a));
		System.out.println("나머지 : "+(c%a));
		
		
		//대입연산자
		a += 5;
		System.out.println("대입연산자 후 :"+a);
		
		//비교연산자 ===> t/f
		System.out.println("초과 : "+(a>b));
		System.out.println("미만 : "+(a<b));
		System.out.println("이상 : "+(a>=b));
		System.out.println("이하 : "+(a<=b));
		System.out.println("같다 : "+(a==b));
		System.out.println("같지않다 : "+(a!=b));
		
		//논리연산자
		System.out.println("AND : "+(a>b && b>c));
		System.out.println("OR : "+(a>b || b<c));
		
		//증감연산자
		System.out.println("후위증가 : "+a++); // 증가전 print 먼저 출력
		System.out.println("확인 : "+a);
		System.out.println("선위증가 : "+(++a));
		
		System.out.println("후위감소 : "+a--);
		System.out.println("확인 : "+a);
		System.out.println("선위감소 : "+(--a));
		
		
		
		
		
	}

}
