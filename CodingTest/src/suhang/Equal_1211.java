package suhang;

import java.util.Scanner;
public class Equal_1211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, one = 0, ten = 0;
		System.out.print("2자리수 정수 입력(10~99) >> ");
		input = sc.nextInt();
		
		ten = input/10;
		one = input%10;
		
		if(ten==one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else if(ten!=one)
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		
		
		
	}

}
