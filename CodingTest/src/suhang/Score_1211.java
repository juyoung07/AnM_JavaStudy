package suhang;

import java.util.Scanner;

public class Score_1211 {	//1-4

	public static void main(String[] args) {
		
		int score, grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		score = sc.nextInt();
		
		System.out.print("학년을 입력하세요(1~3): ");
		grade = sc.nextInt();
		
		if(grade == 3) {
			if(score >= 70) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}	//3학년 if
		
		if((grade == 1) || (grade == 2)) {
			if(score >= 60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		

	} //main

}
