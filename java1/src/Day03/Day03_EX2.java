package Day03;

import java.util.Scanner;

public class Day03_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,b,c,d;
		
		//1.2개의 정수를 입력받아 더큰 수를 출력
		System.out.print("정수 A 입력 : ");
		a = scan.nextInt();
		System.out.print("정수 B 입력 : ");
		b = scan.nextInt();
		
		if(a>b) System.out.println("더 큰수는 "+a);
		else System.out.println("더 큰수는 "+b);
		
		//2. 3개의 정수를 입력 받아 가장 큰 수 출력
		System.out.print("정수 A 입력 : ");
		a = scan.nextInt();
		System.out.print("정수 B 입력 : ");
		b = scan.nextInt();
		System.out.print("정수 C 입력 : ");
		c = scan.nextInt();
		
		if(a>b) {
			if(a>c) System.out.println("더 큰수는 : "+a);
			else System.out.println("더 큰수는 : "+c);
		}else {
			if(b>c) System.out.println("더 큰수는 : "+b);
			else System.out.println("더 큰수는 : "+c);
		}
		
		//4개의 정수를 입력 받아 더 큰수 출력
		System.out.print("정수 A 입력 : ");
		a = scan.nextInt();
		System.out.print("정수 B 입력 : ");
		b = scan.nextInt();
		System.out.print("정수 C 입력 : ");
		c = scan.nextInt();
		System.out.print("정수 D 입력 : ");
		d = scan.nextInt();
		if(a>b) {
			if(a>c) {
				if(a>d) System.out.println("더 큰수는 A : "+a);
				else System.out.println("더 큰수는 D : "+d);
			}else {
				if(c>d) System.out.println("더 큰수는 C : "+c);
				else System.out.println("더 큰수는 D : "+d);
			}
		}else {
			if(b>c) {
				if(b>d) System.out.println("더 큰수는 B : "+b);
				else System.out.println("더 큰수는 D : "+d);
			}else {
				if(c>d) System.out.println("더 큰수는 C : "+c);
				else System.out.println("더 큰수는 D : "+d);
			}
		}
	}

}
