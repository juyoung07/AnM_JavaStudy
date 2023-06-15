package suhang;

import java.util.Scanner;

public class Dollar_1211 {	//1-3

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int won;
		
		System.out.print("원화를 입력하세요(단위:원) : ");
		won = sc.nextInt();
		float doll = (float)won/1260;
		
		System.out.println(won + "원은 $" + String.format("%.2f",doll) + "입니다.");
		//String.format으로 반올림 (이건 몰랐음..)

	}

}
