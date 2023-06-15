package suhang;

import java.util.Scanner;

public class Integer_1211 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int hab = a+b+c;
		float vud = (float)hab/3;
		
		System.out.println("합: " + hab);
		System.out.println("평균: " + String.format("%.2f",vud));
		//String.format은 반올림
		
		
	}

}
