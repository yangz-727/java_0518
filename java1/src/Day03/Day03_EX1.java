package Day03;

import java.util.Scanner;

public class Day03_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num,num2,num3;
		double a,b;
		
		
		
		
		  System.out.print("숫자를 입력해주세요 : "); 
		  num = scan.nextInt();
		  System.out.println("7의 배수 확인 : "+(num%7==0));
		  
		  System.out.println("=================================");
		  System.out.print("정수를 입력해주세요 :"); 
		  num = scan.nextInt();
		  System.out.println("홀수 판단 : "+(num%2!=0));
		  
		  System.out.println("=================================");
		  System.out.print("정수를 입력해주세요 :"); 
		  num = scan.nextInt();
		  System.out.println("7의 배수, 홀수 판단 : "+(num%7==0 && num%2!=0));
		  
		  System.out.println("=================================");
		  System.out.print("반지름을 입력해주세요 : "); 
		  a = scan.nextDouble();
		  System.out.println("원의 넓이 : "+ (a*a*3.14));
		  
		  System.out.println("=================================");
		  System.out.print("실수 a 입력 : "); 
		  a = scan.nextDouble();
		  System.out.print("실수 b 입력 : "); 
		  b= scan.nextDouble();
		  System.out.printf("A는 B의 %.3f %%\n",(a/b*100)); //printf()에서 % 사용하려면 --> %%
		  
		  System.out.println("=================================");
		  System.out.print("윗변 입력 :"); 
		  num = scan.nextInt();
		  System.out.print("밑변 입력 :"); 
		  num2 = scan.nextInt();
		  
		  System.out.print("높이 입력 :"); 
		  num3 = scan.nextInt();
		  System.out.println("사다리꼴의 넓이 : "+((num*num2)*num3/2));
		  
		  System.out.println("=================================");
		  System.out.print("키 입력 : "); 
		  num = scan.nextInt();
		  System.out.println("표준체중 : "+((num-100)*0.9));
		  
		  System.out.println("=================================");
		  System.out.print("키 입력 : "); 
		  num = scan.nextInt();
		  System.out.print("몸무게 입력 : "); 
		  num2 = scan.nextInt();
		  System.out.println("BMI : "+(num2/((num/100)*(num/100))));
		  
		  System.out.println("=================================");
		  System.out.print("Inch : "); 
		  num = scan.nextInt();
		  System.out.println(num+"inch = "+(num*2.54)+"cm");
		  
		  
		  
		  System.out.println("=================================");
		  System.out.print("중간고사 점수 입력 : "); 
		  num = scan.nextInt();
		  System.out.print("기말고사 점수 입력 : "); 
		  num2 = scan.nextInt();
		  System.out.print("수행평가 점수 입력 : "); 
		  num3 = scan.nextInt();
		  System.out.printf("중간고사 반영비율 => %.2f\n",num*0.3);
		  System.out.printf("기말고사 반영비율 => %.2f\n",num*0.3);
		  System.out.printf("수행평가 반영비율 => %.2f\n",num*0.4);
		 
		
		System.out.println("=================================");
		int x=10;
		int y = x-- +5 + --x;
		// y = 10 + 5 + 8
		System.out.printf("x의 값 : %d, y의 값 : %d",x,y);
	}

}
