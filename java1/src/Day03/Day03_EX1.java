package Day03;

import java.util.Scanner;

public class Day03_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num,num2,num3;
		double a,b;
		
		
		
		
		  System.out.print("���ڸ� �Է����ּ��� : "); 
		  num = scan.nextInt();
		  System.out.println("7�� ��� Ȯ�� : "+(num%7==0));
		  
		  System.out.println("=================================");
		  System.out.print("������ �Է����ּ��� :"); 
		  num = scan.nextInt();
		  System.out.println("Ȧ�� �Ǵ� : "+(num%2!=0));
		  
		  System.out.println("=================================");
		  System.out.print("������ �Է����ּ��� :"); 
		  num = scan.nextInt();
		  System.out.println("7�� ���, Ȧ�� �Ǵ� : "+(num%7==0 && num%2!=0));
		  
		  System.out.println("=================================");
		  System.out.print("�������� �Է����ּ��� : "); 
		  a = scan.nextDouble();
		  System.out.println("���� ���� : "+ (a*a*3.14));
		  
		  System.out.println("=================================");
		  System.out.print("�Ǽ� a �Է� : "); 
		  a = scan.nextDouble();
		  System.out.print("�Ǽ� b �Է� : "); 
		  b= scan.nextDouble();
		  System.out.printf("A�� B�� %.3f %%\n",(a/b*100)); //printf()���� % ����Ϸ��� --> %%
		  
		  System.out.println("=================================");
		  System.out.print("���� �Է� :"); 
		  num = scan.nextInt();
		  System.out.print("�غ� �Է� :"); 
		  num2 = scan.nextInt();
		  
		  System.out.print("���� �Է� :"); 
		  num3 = scan.nextInt();
		  System.out.println("��ٸ����� ���� : "+((num*num2)*num3/2));
		  
		  System.out.println("=================================");
		  System.out.print("Ű �Է� : "); 
		  num = scan.nextInt();
		  System.out.println("ǥ��ü�� : "+((num-100)*0.9));
		  
		  System.out.println("=================================");
		  System.out.print("Ű �Է� : "); 
		  num = scan.nextInt();
		  System.out.print("������ �Է� : "); 
		  num2 = scan.nextInt();
		  System.out.println("BMI : "+(num2/((num/100)*(num/100))));
		  
		  System.out.println("=================================");
		  System.out.print("Inch : "); 
		  num = scan.nextInt();
		  System.out.println(num+"inch = "+(num*2.54)+"cm");
		  
		  
		  
		  System.out.println("=================================");
		  System.out.print("�߰���� ���� �Է� : "); 
		  num = scan.nextInt();
		  System.out.print("�⸻��� ���� �Է� : "); 
		  num2 = scan.nextInt();
		  System.out.print("������ ���� �Է� : "); 
		  num3 = scan.nextInt();
		  System.out.printf("�߰���� �ݿ����� => %.2f\n",num*0.3);
		  System.out.printf("�⸻��� �ݿ����� => %.2f\n",num*0.3);
		  System.out.printf("������ �ݿ����� => %.2f\n",num*0.4);
		 
		
		System.out.println("=================================");
		int x=10;
		int y = x-- +5 + --x;
		// y = 10 + 5 + 8
		System.out.printf("x�� �� : %d, y�� �� : %d",x,y);
	}

}
