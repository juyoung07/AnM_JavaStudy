package suhang;

import java.util.Scanner;
public class Time_1211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, hour=0, min=0, sec=0;
		System.out.print("정수(초)를 입력하세요 : ");
		input = sc.nextInt();
		
		hour = ((input/60)/60);
		min = (input/60)%60;
		sec = input%60;

		System.out.println(input + "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");

	}

}
