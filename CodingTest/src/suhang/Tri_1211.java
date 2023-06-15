package suhang;

import java.util.Scanner;

public class Tri_1211 {	//1-2

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int inp1, inp2, result;
	System.out.print("두 수를 입력하세요(스페이스로 구분): ");
	inp1 = sc.nextInt();
	inp2 = sc.nextInt();
	
	result = (inp1 > inp2) ? inp1 : inp2;
	System.out.println("큰수: " + result);
	
	}
}
